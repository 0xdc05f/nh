package Server;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

//�⼮��Ȳ �̺�Ʈ
class MessageAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(e.getSource()==b)
			new MessageFrame();	
	}

}