package Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
 
public class LoginSender extends LoginFrame {
    private String name;
    private Socket socket;
    private String serverIp = "10.20.63.119";
    
    //LoginFrame ��ӹ޾Ƽ� ��������
	String id = loginTextField.getText().trim();
	String pw=new String(passwordField.getPassword());

    
    public void start() {
        try {
            socket = new Socket(serverIp, 5000);
            System.out.println("������ ����Ǿ����ϴ�.");
            ClientSender clientSender = new ClientSender(socket);
            clientSender.start();
        } catch (IOException e) {System.out.println("�������");}
    }
 
    class ClientSender extends Thread {
   	

    	// ������ ����� ���� �ν��Ͻ���
    	private Socket socket=null;
    	
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
             writer.write(id,0,10);
             writer.write(pw,0,10);
             writer.flush();
          }catch(IOException e){System.out.println("������ ����");}
              
           try{
             socket.close();
             writer.close();
             os.close();
          }catch(IOException e){ }
        }
    }
}
