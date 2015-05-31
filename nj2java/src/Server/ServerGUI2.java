package Server;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame(){
		Container ct = getContentPane();
		getContentPane().setLayout(new BorderLayout(0,0));
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		ct.add(jp1, BorderLayout.NORTH);
		ct.add(jp2, BorderLayout.NORTH);
		setSize(500,500);
		setTitle("출석관리프로그램(서버)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try{
			img = ImageIO.read(new File("img/Title.png"));
		}catch(IOException e){
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		b1 = new JButton("날짜 선택");
		jp2.add(b1);
		b1.setEnabled(false);
		
		b1.setBounds(30,240,95,30);
		
	}

	private JButton b1, b2, b3, b4, b5, b6, b7;
	BufferedImage img = null;
	
	
	

	

}
public class ServerGUI2 {
	MyFrame f = new MyFrame();

}
