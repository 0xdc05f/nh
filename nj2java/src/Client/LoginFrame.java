package Client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

public class LoginFrame extends JFrame{
 
    BufferedImage img = null;
    static JTextField loginTextField;
    static JPasswordField passwordField;
    JButton bt, ct, dt;
    String id, pw;
    public static void main(String[] args){
        new LoginFrame();
    }
    
    public LoginFrame(){
    	setBounds(200, 200, 400, 400);
    	setTitle("수업도우미");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 
        setLayout(null);
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 400, 400);
        layeredPane.setLayout(null);

        JPanel jp1 = new JPanel();
		jp1.setBounds(147, 39, 100, 50);
		jp1.setBorder(new  EmptyBorder(5,5,5,5));
		JLabel lb1 = new JLabel("수업도우미(학생)");
		jp1.add(lb1,BorderLayout.CENTER);
		add(jp1);
        
		JPanel jp2 = new JPanel();
		jp2.setBounds(145, 145, 111, 40);
		jp2.setBorder(new EmptyBorder(5,5,5,5));
		jp2.setLayout(new BorderLayout());
		
		JTextField tf1 = new JTextField(10);
		jp2.add(tf1,tf1.CENTER);		
		add(jp2);
		
		JPanel jp3 = new JPanel();
		jp3.setBounds(145, 195, 111, 40);
		jp3.setBorder(new EmptyBorder(5,5,5,5));
		jp3.setLayout(new BorderLayout());
		
		JPasswordField tf2 = new JPasswordField(10);
		jp3.add(tf2,tf2.CENTER);		
		add(jp3);
		
		
		JPanel jp4 = new JPanel();
		jp4.setBounds(40, 10, 100, 100);
		jp4.setBorder(new EmptyBorder(5,5,5,5));
		jp4.setLayout(new BorderLayout());
		String path1 = "img/login.png";
		JLabel lb2 = new JLabel(new ImageIcon(path1));
		jp4.add(lb2, JLabel.CENTER);		
		add(jp4);
		
        try{
            img = ImageIO.read(new File("img/login.png"));
        } catch (IOException e){
            System.out.println("이미지 불러오기 실패");
            System.exit(0);
        }
        
        
        loginTextField = new JTextField(15);
        loginTextField.setBounds(150, 150, 280, 30);
        layeredPane.add(loginTextField);
        loginTextField.setOpaque(false);
        loginTextField.setForeground(Color.black);
        loginTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
  
        
        passwordField = new JPasswordField(15);
        passwordField.setBounds(150, 200, 280, 30);
        passwordField.setOpaque(false);
        passwordField.setForeground(Color.black);
        passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        layeredPane.add(passwordField);
 
      //로그인버튼
        bt = new JButton(new ImageIcon("img/btlogin_hud.jpg"));
        bt.setBounds(147, 250, 104, 48);
        LoginAction LA = new LoginAction();
		bt.addActionListener(LA);
        bt.setBorderPainted(false);
        bt.setFocusPainted(false);
        bt.setContentAreaFilled(false);
        layeredPane.add(bt);
        
        ct = new JButton(new ImageIcon("img/number.jpg"));
        ct.setBounds(50, 140, 104, 48);

        ct.setBorderPainted(false);
        ct.setFocusPainted(false);
        ct.setContentAreaFilled(false);
        layeredPane.add(ct);
        
        dt = new JButton(new ImageIcon("img/password.jpg"));
        dt.setBounds(50, 190, 104, 48);

        dt.setBorderPainted(false);
        dt.setFocusPainted(false);
        dt.setContentAreaFilled(false);
        layeredPane.add(dt);

        layeredPane.add(jp4);
        add(layeredPane);
        setVisible(true);
    }
}