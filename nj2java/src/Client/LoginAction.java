package Client;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

class LoginAction implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		JButton a = (JButton)e.getSource();
		if(e.getSource() == a)
			new LoginSitFrame();
	}
}