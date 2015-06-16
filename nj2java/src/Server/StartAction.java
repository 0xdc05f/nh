package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap; //패키지 설명
import java.util.Iterator; //패키지 설명
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

//출석상황 이벤트
public class StartAction implements ActionListener{
	private HashMap<String, DataOutputStream> clients;
	private ServerSocket serverSocket;

	@Override
	public void actionPerformed(ActionEvent e) {
		new StartAction().start();
	}
	
	public StartAction() {
        clients = new HashMap<String, DataOutputStream>();
 
        // 스레드 동기
        Collections.synchronizedMap(clients);
    }
	
	public void start(){
		try{
			Socket socket;
			
			//소켓 생성
			serverSocket = new ServerSocket(3000);
			System.out.println("서버 시작");
			
			//클라이언트와 연결되면
			while(true){
				//통신 소켓 생성하고 스레드 생성
				socket = serverSocket.accept();
				ServerReceiver receiver = new ServerReceiver(socket);
				System.out.println("실행");
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
				System.out.println("오류1");
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
                //System.out.println("현재 " + clients.size() + "명이 대화방에 접속 중입니다.");

			}catch(IOException e){
			}finally{
				clients.remove(idpw);
                
				System.out.println(idpw + "\n" + "[" + socket.getInetAddress() + ":" + socket.getPort() + "]" + "님이 대화방에서 나갔습니다.");
			}
		}
	}
}