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
	
	//��ư
	public MyFrame(){
		setTitle("�⼮�������α׷�(����)");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		p.setLayout(null);
		
	//�̹�������
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
		
		//��¥���ù�ư
		b1 = new JButton("��¥ ����");
		p.add(b1);
		b1.setEnabled(false); //���� ��Ȱ��ȭ
		
		//�������� ��ư
		b2 = new JButton("��������");
		p.add(b2);
		b2.setEnabled(false); //���� ��Ȱ��ȭ
		b3 = new JButton("Button");
		p.add(b3);
		
		//�������� ��ư
		b4 = new JButton("��������");
		p.add(b4);
		b4.setEnabled(false);
		b5 = new JButton("Button");
		p.add(b5);
		
		//�⼮��Ȳ ��ư
		b6 = new JButton("�⼮��Ȳ");
		p.add(b6);
		b6.setEnabled(false);
		b7 = new JButton("Button");
		p.add(b7);
		
		//��ġ
		b1.setBounds(30,240,95,30);	//��¥����
		b2.setBounds(30, 360, 95, 30);	//��������
		b3.setBounds(150, 360, 95, 30);	//�������� ��ư
		b4.setBounds(270, 360, 95, 30);	//��������
		b5.setBounds(390,360,95,30);	//�������� ��ư
		b6.setBounds(30, 480, 95, 30);	//�⼮��Ȳ
		b7.setBounds(150,480,95,30);	//�⼮��Ȳ ��ư
		
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
