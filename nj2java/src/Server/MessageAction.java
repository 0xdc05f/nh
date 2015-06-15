package Server;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

//출석상황 이벤트
class MessageAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(e.getSource()==b)
			new MessageFrame();	
	}

}