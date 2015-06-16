package Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class LoginSender extends LoginFrame {
    private String login;
    private Socket socket;
    private String serverIp = "220.149.125.131";
    
    //LoginFrame 상속받아서 가져오기
	String id = loginTextField.getText().trim();
	String pw = new String(passwordField.getPassword());

    
    public void start() {
        try {
            socket = new Socket(serverIp, 5000);
            System.out.println("서버와 연결되었습니다. 대화명을 입력하세요 : ");
            ClientSender clientSender = new ClientSender(socket);
            clientSender.start();
        } catch (IOException e) {System.out.println("연결실패");}
    }
 
    class ClientSender extends Thread {
   	
    	// 소켓을 만들기 위한 인스턴스들
    	Socket socket;
    	
    	// 소켓에서 스트림을 얻어오기 위한 인스턴스들
    	private OutputStream os = null;
    	private OutputStreamWriter writer = null;
    	
        public ClientSender(Socket socket) {
            this.socket = socket;
            try {
                os = socket.getOutputStream();
                writer = new OutputStreamWriter(os);
            } catch (Exception e) {  }
        }
 
        @Override
        public void run() {
        	try{
        	login = 
             writer.write(id+"|"+pw,0,(id+"|"+pw).length());
             writer.flush();
          }catch(IOException e){System.out.println("보내기 실패");}
              
           try{
             socket.close();
             writer.close();
             os.close();
          }catch(IOException e){
          }
    	}
	  }
	}
    
    class ClientSender extends Thread{
    	Socket socket;
    	DataOutputStream output;
    	
    	public ClientSender(Socket socket){
    		this.socket = socket;
    		try{
    			output = new DataOutputStream(socket.getOutputStream());
    			output.writeUTF(login);
    			System.out.println("대화방에 입장하였습니다.");
    		}catch(Exception e){
    		}
    	}
    }

