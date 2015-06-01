package Server;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ServerMain extends JFrame{



	private JButton button_1;
	private JTextField textField_2;
	private JLabel lblAttendanceAdminSystem;
	private JLabel lblSelectDate;
	private JLabel lblStart;
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel lblEnd;
	private Canvas canvas;
	public ServerMain() {
		getContentPane().setEnabled(false);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JButton btnStart = new JButton("Start");
		springLayout.putConstraint(SpringLayout.SOUTH, btnStart, -135, SpringLayout.SOUTH, getContentPane());
		getContentPane().add(btnStart);
		
		JButton btnEnd = new JButton("End");
		springLayout.putConstraint(SpringLayout.EAST, btnStart, -142, SpringLayout.WEST, btnEnd);
		springLayout.putConstraint(SpringLayout.NORTH, btnEnd, 103, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnEnd, 343, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnEnd, -10, SpringLayout.EAST, getContentPane());
		getContentPane().add(btnEnd);
		
		JButton button = new JButton("\uC0C1\uD669");
		springLayout.putConstraint(SpringLayout.NORTH, button, 16, SpringLayout.SOUTH, btnStart);
		springLayout.putConstraint(SpringLayout.WEST, button, 0, SpringLayout.WEST, btnStart);
		springLayout.putConstraint(SpringLayout.EAST, button, -229, SpringLayout.EAST, getContentPane());
		getContentPane().add(button);
		
		button_1 = new JButton("\uBA54\uC138\uC9C0\uD568");
		springLayout.putConstraint(SpringLayout.NORTH, button_1, 20, SpringLayout.SOUTH, button);
		springLayout.putConstraint(SpringLayout.EAST, button_1, 0, SpringLayout.EAST, button);
		getContentPane().add(button_1);
		
		textField_2 = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textField_2, 124, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, textField_2, -22, SpringLayout.NORTH, btnStart);
		springLayout.putConstraint(SpringLayout.EAST, textField_2, -194, SpringLayout.EAST, getContentPane());
		textField_2.setText("2015 / 04 / 19");
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		//Á¦¸ñ
		lblAttendanceAdminSystem = new JLabel("Attendance Admin System");
		springLayout.putConstraint(SpringLayout.NORTH, lblAttendanceAdminSystem, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblAttendanceAdminSystem, -118, SpringLayout.EAST, getContentPane());
		lblAttendanceAdminSystem.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		getContentPane().add(lblAttendanceAdminSystem);
		
		lblSelectDate = new JLabel("Select Date");
		springLayout.putConstraint(SpringLayout.WEST, lblSelectDate, 20, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblSelectDate, -35, SpringLayout.WEST, textField_2);
		springLayout.putConstraint(SpringLayout.NORTH, lblSelectDate, 3, SpringLayout.NORTH, textField_2);
		getContentPane().add(lblSelectDate);
		
		lblStart = new JLabel("Start");
		springLayout.putConstraint(SpringLayout.WEST, btnStart, 49, SpringLayout.EAST, lblStart);
		springLayout.putConstraint(SpringLayout.NORTH, lblStart, 4, SpringLayout.NORTH, btnStart);
		springLayout.putConstraint(SpringLayout.WEST, lblStart, 40, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblStart, 75, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblStart);
		
		lblNewLabel = new JLabel("\uC0C1\uD669");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 1, SpringLayout.NORTH, button);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, lblStart);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 41, SpringLayout.SOUTH, lblStart);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 109, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblNewLabel);
		
		label = new JLabel("\uBA54\uC138\uC9C0\uD568");
		springLayout.putConstraint(SpringLayout.NORTH, label, 4, SpringLayout.NORTH, button_1);
		springLayout.putConstraint(SpringLayout.EAST, label, 0, SpringLayout.EAST, lblStart);
		getContentPane().add(label);
		
		lblEnd = new JLabel("End");
		springLayout.putConstraint(SpringLayout.NORTH, lblEnd, 4, SpringLayout.NORTH, btnStart);
		springLayout.putConstraint(SpringLayout.EAST, lblEnd, -42, SpringLayout.WEST, btnEnd);
		getContentPane().add(lblEnd);
		
		canvas = new Canvas();
		springLayout.putConstraint(SpringLayout.SOUTH, canvas, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, canvas, 0, SpringLayout.EAST, btnEnd);
		getContentPane().add(canvas);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
