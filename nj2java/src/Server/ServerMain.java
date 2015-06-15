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


//����ȭ��
public class ServerMain extends JFrame{
	int w = 280;
	int h = 40;
	int gap = 10;
	public ServerMain() {
		
		setBounds(100,200,700,500); // x��ǥ, y��ǥ, ����, ����
		setLayout(null);
		setTitle("���� �����(������ȭ��)");
		
		//����
		/*JPanel jp1 = new JPanel();
		jp1.setBounds(gap, gap, 660, h);
		jp1.setBorder(new BevelBorder(BevelBorder.RAISED));
		JLabel lb1 = new JLabel("���������");
		//lb1.setOpaque(true); �� ������ �ְ��� ������
		jp1.add(lb1,BorderLayout.CENTER);
		add(jp1);*/
		
		JPanel jp1 = new JPanel();
		jp1.setBounds(gap, gap,660,h);
		jp1.setBorder(new EmptyBorder(5,5,5,5));
		jp1.setLayout(new BorderLayout());
		String path = "img/tt.png";
		JLabel lb1 = new JLabel(new ImageIcon(path));
		//lb1.setOpaque(true); �� ������ �ְ��� ������
		jp1.add(lb1,JLabel.CENTER);
		add(jp1);
		
		
		//�޷��̹���
		JPanel jp2 = new JPanel();
		jp2.setBounds(gap, gap*2+h,w/2,h);
		jp2.setBorder(new EmptyBorder(5,5,5,5));
		jp2.setLayout(new BorderLayout());
		String path1 = "img/cal.png";
		JLabel lb2 = new JLabel(new ImageIcon(path1));
		//lb1.setOpaque(true); �� ������ �ְ��� ������
		jp2.add(lb2,JLabel.CENTER);		
		add(jp2);
		
		//�ؽ�Ʈâ
		JPanel jp3 = new JPanel();
		jp3.setBounds(gap*2+w/2, gap*2+h,w/2,h);
		jp3.setBorder(new EmptyBorder(5,5,5,5));
		jp3.setLayout(new BorderLayout());
		
		JTextField tf1 = new JTextField(10);
		jp3.add(tf1,tf1.CENTER);		
		add(jp3);
		
		
		//�������� �̹���
		JPanel jp4 = new JPanel();
		jp4.setBounds(gap, gap*3+h*2,w/2,h);
		jp4.setBorder(new EmptyBorder(5,5,5,5));
		jp4.setLayout(new BorderLayout());
		String path2 = "img/start.png";
		JLabel lb3 = new JLabel(new ImageIcon(path2));
		//lb1.setOpaque(true); �� ������ �ְ��� ������
		jp4.add(lb3,JLabel.CENTER);		
		add(jp4);
		
		//��������
		JPanel jp5 = new JPanel();
		jp5.setBounds(gap*2+w/2, gap*3+h*2,w/2,h);
		jp5.setBorder(new EmptyBorder(5,5,5,5));
		jp5.setLayout(new BorderLayout());
		JButton btn1 = new JButton("����");
		StartAction startaction = new StartAction();	//�̺�Ʈ
		btn1.addActionListener(startaction);
		jp5.add(btn1, btn1.CENTER);
		add(jp5);
		
		//�������� �̹���
		JPanel jp6 = new JPanel();
		jp6.setBounds(gap*3+w, gap*3+h*2,w/2,h);
		jp6.setBorder(new EmptyBorder(5,5,5,5));
		jp6.setLayout(new BorderLayout());
		String path3 = "img/start.png";
		JLabel lb4 = new JLabel(new ImageIcon(path3));
		//lb1.setOpaque(true); �� ������ �ְ��� ������
		jp6.add(lb4,JLabel.CENTER);		
		add(jp6);
		
		//��������
		JPanel jp7 = new JPanel();
		jp7.setBounds(gap*4+w*3/2, gap*3+h*2,w/2,h);
		jp7.setBorder(new EmptyBorder(5,5,5,5));
		jp7.setLayout(new BorderLayout());
		JButton btn2 = new JButton("����");
		EndAction endaction = new EndAction();	//�̺�Ʈ
		btn2.addActionListener(endaction);
		jp7.add(btn2, btn2.CENTER);
		add(jp7);
		
		//�⼮��Ȳ �̹���
		JPanel jp8 = new JPanel();
		jp8.setBounds(gap, gap*4+h*3,w/2,h);
		jp8.setBorder(new EmptyBorder(5,5,5,5));
		jp8.setLayout(new BorderLayout());
		String path4 = "img/sit.png";
		JLabel lb5 = new JLabel(new ImageIcon(path4));
		//lb1.setOpaque(true); �� ������ �ְ��� ������
		jp8.add(lb5,JLabel.CENTER);		
		add(jp8);
		
		//�⼮��Ȳ
		JPanel jp9 = new JPanel();
		jp9.setBounds(gap*2+w/2, gap*4+h*3,w/2,h);
		jp9.setBorder(new EmptyBorder(5,5,5,5));
		jp9.setLayout(new BorderLayout());
		JButton btn4 = new JButton("�⼮ ��Ȳ");
		AttendanceSitAction attendancesitframe = new AttendanceSitAction();	//�̺�Ʈ
		btn4.addActionListener(attendancesitframe);	//�̺�Ʈ
		jp9.add(btn4, btn4.CENTER);
		add(jp9);
		
		//�޼��� ��� �̹���
		JPanel jp10 = new JPanel();
		jp10.setBounds(gap, gap*5+h*4,w/2,h);
		jp10.setBorder(new EmptyBorder(5,5,5,5));
		jp10.setLayout(new BorderLayout());
		String path5 = "img/message.png";
		JLabel lb6 = new JLabel(new ImageIcon(path5));
		//lb1.setOpaque(true); �� ������ �ְ��� ������
		jp10.add(lb6,JLabel.CENTER);		
		add(jp10);
		
		//�޼���
		JPanel jp11 = new JPanel();
		jp11.setBounds(gap*2+w/2, gap*5+h*4,w/2,h);
		jp11.setBorder(new EmptyBorder(5,5,5,5));
		jp11.setLayout(new BorderLayout());
		JButton btn5 = new JButton("�޼���");
		MessageFrame messageframe = new MessageFrame();	//�̺�Ʈ
		btn5.addActionListener(messageframe);	//�̺�Ʈ
		jp11.add(btn5, btn5.CENTER);
		add(jp11);
		
		JPanel jp12 = new JPanel();
		jp12.setBounds(gap, gap*9+h*5,660,h*4);
		jp12.setBorder(new EmptyBorder(5,5,5,5));
		jp12.setLayout(new BorderLayout());
		JTextField tf2 = new JTextField(10);
		jp12.add(tf2,tf2.CENTER);		
		add(jp12);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	public static void main(String args[]){
		new ServerMain();
	}
}

