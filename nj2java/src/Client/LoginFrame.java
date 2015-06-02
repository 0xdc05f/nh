package Client;

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
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class LoginFrame extends JFrame implements ActionListener {
 
    BufferedImage img = null;
    JTextField loginTextField;
    JPasswordField passwordField;
    JButton bt, ct, dt, et, ft;
 
    public static void main(String[] args){
        new LoginFrame();
    }
    
    public LoginFrame(){
        setTitle("로그인 테스트");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 
        setLayout(null);
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);
        layeredPane.setLayout(null);
        
        try{
            img = ImageIO.read(new File("img/login.jpg"));
        } catch (IOException e){
            System.out.println("이미지 불러오기 실패");
            System.exit(0);
        }
        
        MyPanel panel = new MyPanel();
        panel.setBounds(0, 0, 500, 500);
        
        loginTextField = new JTextField(15);
        loginTextField.setBounds(250, 200, 280, 30);
        layeredPane.add(loginTextField);
        loginTextField.setOpaque(false);
        loginTextField.setForeground(Color.black);
        loginTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        
        passwordField = new JPasswordField(15);
        passwordField.setBounds(250, 250, 280, 30);
        passwordField.setOpaque(false);
        passwordField.setForeground(Color.black);
        passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        layeredPane.add(passwordField);
 
        bt = new JButton(new ImageIcon("img/btlogin_hud.jpg"));
        bt.setBounds(197, 300, 104, 48);

        bt.setBorderPainted(false);
        bt.setFocusPainted(false);
        bt.setContentAreaFilled(false);
        bt.addActionListener(this);
        layeredPane.add(bt);
        
        ct = new JButton(new ImageIcon("img/number.jpg"));
        ct.setBounds(125, 190, 104, 48);

        ct.setBorderPainted(false);
        ct.setFocusPainted(false);
        ct.setContentAreaFilled(false);
        layeredPane.add(ct);
        
        dt = new JButton(new ImageIcon("img/password.jpg"));
        dt.setBounds(125, 240, 104, 48);

        dt.setBorderPainted(false);
        dt.setFocusPainted(false);
        dt.setContentAreaFilled(false);
        layeredPane.add(dt);

        layeredPane.add(panel);
        add(layeredPane);
        setVisible(true);
    }
 
    class MyPanel extends JPanel {
        public void paint(Graphics g) {
            g.drawImage(img, 207, 20, null);
        }
    }
    
    public void actionPerformed(ActionEvent e) {
        String id = loginTextField.getText();
        char[] pass = passwordField.getPassword();
        String password = new String(pass);
 
        if (id.equals("") || password.equals("")) {
        	JOptionPane.showMessageDialog(null, "학번/비밀번호를 입력하세요.");
        } else {
            boolean existLogin = LoginService.loginTest(id,  password);
 
            if (existLogin) {
                JOptionPane.showMessageDialog(null, "로그인 성공");
            } else {
                JOptionPane.showMessageDialog(null, "로그인 실패");
            }
        }
        
        password = null;
        
    }
}