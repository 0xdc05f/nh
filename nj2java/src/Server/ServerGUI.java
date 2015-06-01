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
		
		//제목
		JPanel jp1 = new JPanel();
		jp1.setBounds(gap, gap, w*2, h);
		jp1.setBorder(new BevelBorder(BevelBorder.RAISED));
		JLabel lb1 = new JLabel("수업도우미");
		//lb1.setOpaque(true); 색 입힐수 있게할 것인지
		jp1.add(lb1,BorderLayout.CENTER);
		add(jp1);
		
		//달력이미지
		JPanel jp2 = new JPanel();
		jp2.setBounds(gap, gap*2+h,w/2,h);
		jp2.setBorder(new EmptyBorder(5,5,5,5));
		jp2.setLayout(new BorderLayout());
		String path1 = "img/달력.png";
		JLabel lb2 = new JLabel(new ImageIcon(path1));
		//lb1.setOpaque(true); 색 입힐수 있게할 것인지
		jp2.add(lb2,JLabel.CENTER);		
		add(jp2);
		
		//텍스트창
		JPanel jp3 = new JPanel();
		jp3.setBounds(gap*2+w/2, gap*2+h,w/2,h);
		jp3.setBorder(new EmptyBorder(5,5,5,5));
		jp3.setLayout(new BorderLayout());
		
		JTextField tf1 = new JTextField(10);
		jp3.add(tf1,tf1.CENTER);		
		add(jp3);
		
		
		//수업시작 이미지
		JPanel jp4 = new JPanel();
		jp4.setBounds(gap, gap*3+h*2,w/2,h);
		jp4.setBorder(new EmptyBorder(5,5,5,5));
		jp4.setLayout(new BorderLayout());
		String path2 = "img/start.png";
		JLabel lb3 = new JLabel(new ImageIcon(path2));
		//lb1.setOpaque(true); 색 입힐수 있게할 것인지
		jp4.add(lb3,JLabel.CENTER);		
		add(jp4);
		
		//수업시작
		JPanel jp5 = new JPanel();
		jp5.setBounds(gap*2+w/2, gap*3+h*2,w/2,h);
		jp5.setBorder(new EmptyBorder(5,5,5,5));
		jp5.setLayout(new BorderLayout());
		JButton btn1 = new JButton("수업 시작");
		jp5.add(btn1, btn1.CENTER);
		add(jp5);
		
		//수업종료 이미지
		JPanel jp6 = new JPanel();
		jp6.setBounds(gap*2+w, gap*3+h*2,w/2,h);
		jp6.setBorder(new EmptyBorder(5,5,5,5));
		jp6.setLayout(new BorderLayout());
		String path3 = "img/start.png";
		JLabel lb4 = new JLabel(new ImageIcon(path3));
		//lb1.setOpaque(true); 색 입힐수 있게할 것인지
		jp6.add(lb4,JLabel.CENTER);		
		add(jp6);
		
		//수업종료
		JPanel jp7 = new JPanel();
		jp7.setBounds(gap*5+w, gap*3+h*2,w/2,h);
		jp7.setBorder(new EmptyBorder(5,5,5,5));
		jp7.setLayout(new BorderLayout());
		JButton btn2 = new JButton("수업 종료");
		jp7.add(btn2, btn2.CENTER);
		add(jp7);
		
		//출석상황 이미지
		JPanel jp8 = new JPanel();
		jp8.setBounds(gap, gap*5+h*4,w/2,h);
		jp8.setBorder(new EmptyBorder(5,5,5,5));
		jp8.setLayout(new BorderLayout());
		String path4 = "img/start.png";
		JLabel lb5 = new JLabel(new ImageIcon(path4));
		//lb1.setOpaque(true); 색 입힐수 있게할 것인지
		jp8.add(lb4,JLabel.CENTER);		
		add(jp8);
		
		//출석상황
		/*JPanel jp9 = new JPanel();
		jp9.setBounds(gap*2+w/2, gap*5+h*4,w/2,h);
		jp9.setBorder(new EmptyBorder(5,5,5,5));
		jp9.setLayout(new BorderLayout());
		JButton btn4 = new JButton("출석 상황");
		jp9.add(btn4, btn4.CENTER);
		add(jp9);*/
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	public static void main(String args[]){
		new ServerGUI();
	}
}
