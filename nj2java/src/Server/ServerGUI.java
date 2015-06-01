package Server;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.JTextField;
import javax.swing.JButton;


public class ServerGUI extends JFrame{
	int w = 280;
	int h = 40;
	int gap = 15;
	public ServerGUI() {
		
		setBounds(100,200,600,500); // x좌표, y좌표, 가로, 높이
		setLayout(null);
		setTitle("수업 도우미(교수님화면)");
		
		JPanel jp1 = new JPanel();
		jp1.setBounds(gap, gap, w*2, h);
		jp1.setBorder(new BevelBorder(BevelBorder.RAISED));
		JLabel lb1 = new JLabel("수업도우미");
		//lb1.setOpaque(true); 색 입힐수 있게할 것인지
		jp1.add(lb1,BorderLayout.CENTER);
		add(jp1);
		
		JPanel jp2 = new JPanel();
		jp2.setBounds(gap, gap*2+h,w/2,h);
		jp2.setBorder(new EmptyBorder(5,5,5,5));
		jp2.setLayout(new BorderLayout());
		String path1 = "img/number.jpg";
		JLabel lb2 = new JLabel(new ImageIcon(path1));
		//lb1.setOpaque(true); 색 입힐수 있게할 것인지
		jp2.add(lb2,JLabel.CENTER);		
		add(jp2);
		
		JPanel jp3 = new JPanel();
		jp3.setBounds(gap*2+w/2, gap*2+h,w/2,h);
		jp3.setBorder(new EmptyBorder(5,5,5,5));
		jp3.setLayout(new BorderLayout());
		
		JTextField tf1 = new JTextField(10);
		jp3.add(tf1,tf1.CENTER);		
		add(jp3);
		
		JPanel jp4 = new JPanel();
		jp4.setBounds(gap, gap*3+h*2,w/2,h);
		jp4.setBorder(new EmptyBorder(5,5,5,5));
		jp4.setLayout(new BorderLayout());
		String path2 = "img/start.png";
		JLabel lb3 = new JLabel(new ImageIcon(path1));
		//lb1.setOpaque(true); 색 입힐수 있게할 것인지
		jp4.add(lb3,JLabel.CENTER);		
		add(jp4);
		
		JPanel jp5 = new JPanel();
		jp5.setBounds(gap*2+w/2, gap*3+h*2,w/3,h);
		jp5.setBorder(new EmptyBorder(5,5,5,5));
		jp5.setLayout(new BorderLayout());
		JButton btn1 = new JButton("ㅎㅎㅎ");
		jp5.add(btn1, btn1.CENTER);
		add(jp5);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	public static void main(String args[]){
		new ServerGUI();
	}
}
