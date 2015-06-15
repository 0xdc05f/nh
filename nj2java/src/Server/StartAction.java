package Server;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;


//�⼮��Ȳ �̺�Ʈ
class StartAction implements ActionListener{
	private HashMap<String, DataOutputStream> clients;
	private ServerSocket serverSocket;

	@Override
	public void actionPerformed(ActionEvent e) {
		new StartAction().start();
		
	}
	public StartAction() {
        clients = new HashMap<String, DataOutputStream>();
 
        // ������ ����
        Collections.synchronizedMap(clients);
    }
	
	public void start(){
		try{
			Socket socket;
			//���� ��
			serverSocket = new ServerSocket(5000);
			System.out.println("���� ����");
			
			while(true){
				socket = serverSocket.accept();
				ServerReceiver receiver = new ServerReceiver(socket);
				System.out.println("sdfsad");
				//receiver.start();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	class ServerReceiver extends Thread{
		Socket socket;
		DataInputStream input;
		DataOutputStream output;
		
		public ServerReceiver(Socket socket){
			this.socket = socket;
			try{
				input = new DataInputStream(socket.getInputStream());
				output = new DataOutputStream(socket.getOutputStream());
			}catch(IOException e){
				
			}
		}
		

		
		public void run(){
			String name = "";
			try {
				name = input.readUTF();
			}catch(IOException e){
				
			}finally{
				
			}
		}
	}
	

}