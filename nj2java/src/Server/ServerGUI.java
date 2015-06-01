package Server;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;

class MyFrame extends JFrame {	
	
	private JButton b1, b2, b3, b4, b5, b6, b7;
	BufferedImage img=null;	
	
	//버튼
	public MyFrame(){
		setTitle("출석관리프로그램(서버)");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		p.setLayout(null);
		
	//이미지삽입
		try{
			img = ImageIO.read(new File("img/Title.png"));
		}catch(IOException e){
			System.out.println(e.getMessage());
			System.exit(0);
		}
		add(new MyPanel());
		setSize(1000,1000);
		pack();
		setVisible(true);
		
		//날짜선택버튼
		b1 = new JButton("날짜 선택");
		p.add(b1);
		b1.setEnabled(false); //선택 비활성화
		
		//수업시작 버튼
		b2 = new JButton("수업시작");
		p.add(b2);
		b2.setEnabled(false); //선택 비활성화
		b3 = new JButton("Button");
		p.add(b3);
		
		//수업종료 버튼
		b4 = new JButton("수업종료");
		p.add(b4);
		b4.setEnabled(false);
		b5 = new JButton("Button");
		p.add(b5);
		
		//출석상황 버튼
		b6 = new JButton("출석상황");
		p.add(b6);
		b6.setEnabled(false);
		b7 = new JButton("Button");
		p.add(b7);
		
		//위치
		b1.setBounds(30,240,95,30);	//날짜선택
		b2.setBounds(30, 360, 95, 30);	//수업시작
		b3.setBounds(150, 360, 95, 30);	//수업시작 버튼
		b4.setBounds(270, 360, 95, 30);	//수업종료
		b5.setBounds(390,360,95,30);	//수업종료 버튼
		b6.setBounds(30, 480, 95, 30);	//출석상황
		b7.setBounds(150,480,95,30);	//출석상황 버튼
		
		add(p);
		setVisible(true);
		
	}
	class MyPanel extends JPanel{
		public void paint(Graphics g){
			g.drawImage(img,0,0,null);
		}
		
		public Dimension getPreferredSize(){
			if(img==null){
				return new Dimension(100, 100);
			}else{
				return new Dimension(img.getWidth(null), img.getHeight(null));
			}
		}
	}
}

public class ServerGUI {
	public static void main(String args[]){
		MyFrame f = new MyFrame();
	}
}
