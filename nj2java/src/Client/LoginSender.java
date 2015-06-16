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
    
    //LoginFrame ��ӹ޾Ƽ� ��������
	String id = loginTextField.getText().trim();
	String pw = new String(passwordField.getPassword());

    
    public void start() {
        try {
            socket = new Socket(serverIp, 5000);
            System.out.println("������ ����Ǿ����ϴ�. ��ȭ���� �Է��ϼ��� : ");
            ClientSender clientSender = new ClientSender(socket);
            clientSender.start();
        } catch (IOException e) {System.out.println("�������");}
    }
 
    class ClientSender extends Thread {
   	
    	// ������ ����� ���� �ν��Ͻ���
    	Socket socket;
    	
    	// ���Ͽ��� ��Ʈ���� ������ ���� �ν��Ͻ���
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
          }catch(IOException e){System.out.println("������ ����");}
              
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
    			System.out.println("��ȭ�濡 �����Ͽ����ϴ�.");
    		}catch(Exception e){
    		}
    	}
    }

