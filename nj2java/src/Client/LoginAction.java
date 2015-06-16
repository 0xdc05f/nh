package Client;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;

import javax.swing.JButton;

public class LoginAction implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		JButton a = (JButton)e.getSource();
		if(e.getSource() == a){
			String ip = "220.149.125.131";
			Socket socket = null;
			try{
				socket = new Socket(ip, 3000);
				System.out.println("서버에 연결됨");
				
				LoginSender ls = new LoginSender(socket);
				Thread t = new Thread(ls);
				
				t.start();
				t.join();
				new LoginSitFrame();
				
			}catch(Exception err){System.out.println("서버연결실패");}
		}
	}
}
