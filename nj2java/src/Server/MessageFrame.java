package Server;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MessageFrame extends JFrame{

	public MessageFrame(){

		JPanel jp1 = new JPanel();
		jp1.setBorder(new  EmptyBorder(30,13,5,5));
		JLabel lb1 = new JLabel("[자리선택]");
		jp1.add(lb1,BorderLayout.CENTER);
		add(jp1);
		
		Container ct = getContentPane();
		GridLayout g1 = new GridLayout(3,5,10,10);
		
		ct.setLayout(g1);
		for (int i = 1; i <= 14; i++)
			ct.add(new JButton("좌석"+i));
		setTitle("메세지");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
		
		
}

