package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap; //��Ű�� ����
import java.util.Iterator; //��Ű�� ����
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

//�⼮��Ȳ �̺�Ʈ
public class StartAction implements ActionListener{
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
			
			//���� ����
			serverSocket = new ServerSocket(3000);
			System.out.println("���� ����");
			
			//Ŭ���̾�Ʈ�� ����Ǹ�
			while(true){
				//��� ���� �����ϰ� ������ ����
				socket = serverSocket.accept();
				ServerReceiver receiver = new ServerReceiver(socket);
				System.out.println("����");
				receiver.start();
			}
		}
		catch(IOException e){
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
				System.out.println("����1");
			}
		}
		
		public void run(){
			String idpw = null;
			
			StringTokenizer st = new StringTokenizer(idpw, "|");
			while(st.hasMoreTokens()){
				String temp = st.nextToken();
				if(st.equals("|")){
					System.out.println("\n");
				}else{
					System.out.println(temp);
				}
			}
			
			try {
				idpw = input.readUTF();
				
                clients.put(idpw, output);
                //System.out.println("���� " + clients.size() + "���� ��ȭ�濡 ���� ���Դϴ�.");

			}catch(IOException e){
			}finally{
				clients.remove(idpw);
                
				System.out.println(idpw + "\n" + "[" + socket.getInetAddress() + ":" + socket.getPort() + "]" + "���� ��ȭ�濡�� �������ϴ�.");
			}
		}
	}
}