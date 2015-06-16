package Server;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MessageFrame extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Message Frame");
		
		JPanel jp1 = new JPanel();
		jp1.setBorder(new  EmptyBorder(30,13,5,5));
		JLabel lb1 = new JLabel("[자리선택]");
		jp1.add(lb1,BorderLayout.CENTER);
		add(jp1);
		
		Container ct = getContentPane();
		GridLayout g1 = new GridLayout(3,5,10,10);
		
		MessageAction messageaction = new MessageAction();
		
		ct.setLayout(g1);
		for (int i = 1; i <= 14; i++) {
			JButton tempBtn = new JButton("좌석" + i);
			tempBtn.addActionListener(messageaction);
			ct.add(tempBtn);
		}
		setTitle("메세지");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
		
}

