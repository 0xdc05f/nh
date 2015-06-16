package Client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class LoginSender implements Runnable {
	Socket socket;
	DataOutputStream dos;
	BufferedInputStream bis;
	
	public LoginSender(Socket socket){
		this.socket = socket;
		try{
			dos = new DataOutputStream(socket.getOutputStream());
		}catch(IOException e){System.out.println("스트림생성실패");}
	}
	LoginFrame lf = new LoginFrame();
	public void run(){
		
		try{
			String id, pw;
			id = lf.loginTextField.getText();
			//id = loginTextField.getText().toString();
			System.out.println(id);
			pw = new String(lf.passwordField.getPassword());
			
			StringBuilder idpw = new StringBuilder(id);
			idpw.append("|");
			idpw.append(pw);
			
			String a = idpw.toString();
			dos.writeUTF(a);
			System.out.println("id, pw전송 완료");
			//dos.close();
			//socket.close();
		}catch(Exception e){System.out.println(e);}
	}
	


}

