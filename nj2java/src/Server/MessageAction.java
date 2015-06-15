package Server;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Client.LoginAction;

//출석상황 이벤트
class MessageAction extends JFrame implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		// JButton b = (JButton)e.getSource();
		// if(e.getSource()==b)
		// new MessageFrame();
		//
		// MessageAction ms1 = new MessageAction();

		System.out.println("Message Action");
		JFrame jFrame = new JFrame("Message Action.Action");
		jFrame.setLayout(null);
		jFrame.setSize(420, 520);
		
		JPanel jp1 = new JPanel();
		jp1.setBounds(50, 25, 300, 400);
		jp1.setBorder(new EmptyBorder(5,5,5,5));
		jp1.setLayout(new BorderLayout());
		
		JTextField tf1 = new JTextField(10);
		jp1.add(tf1,tf1.CENTER);		
		jFrame.add(jp1);
		
		JPanel jp2 = new JPanel();
		jp2.setBounds(50, 425, 150, 50);
		jp2.setBorder(new EmptyBorder(5,5,5,5));
		jp2.setLayout(new BorderLayout());
		
		JTextField tf2 = new JTextField(10);
		jp2.add(tf2,tf2.CENTER);		
		jFrame.add(jp2);
		
		JPanel jp3 = new JPanel();
		jp3.setBounds(195, 425, 70, 50);
		jp3.setBorder(new EmptyBorder(5,5,5,5));
		jp3.setLayout(new BorderLayout());
		JButton btn1 = new JButton("파일");
		LoginAction SendFileAction = new LoginAction();
		btn1.addActionListener(SendFileAction);
		jp3.add(btn1, btn1.CENTER);
		jFrame.add(jp3);
		
		JPanel jp4 = new JPanel();
		jp4.setBounds(261, 425, 88, 50);
		jp4.setBorder(new EmptyBorder(5,5,5,5));
		jp4.setLayout(new BorderLayout());
		JButton btn2 = new JButton("메시지");
		LoginAction MsSendAction = new LoginAction();
		btn2.addActionListener(MsSendAction);
		jp4.add(btn2, btn2.CENTER);
		jFrame.add(jp4);
		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
	}

}