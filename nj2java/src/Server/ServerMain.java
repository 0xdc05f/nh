package Server;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ServerMain extends JFrame{
	private JTextField txtSelectDate;
	private JTextField txtStart;
	private JTextField txtEnd;
	private JTextField textField;
	private JTextField textField_1;
	private JButton button_1;
	private JTextField txtAttendanceAdminSystem;
	private JTextField textField_2;
	public ServerMain() {
		getContentPane().setEnabled(false);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		txtSelectDate = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, txtSelectDate, 20, SpringLayout.WEST, getContentPane());
		txtSelectDate.setText("Select Date");
		getContentPane().add(txtSelectDate);
		txtSelectDate.setColumns(10);
		
		txtStart = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, txtSelectDate, -23, SpringLayout.NORTH, txtStart);
		springLayout.putConstraint(SpringLayout.EAST, txtSelectDate, 0, SpringLayout.EAST, txtStart);
		springLayout.putConstraint(SpringLayout.NORTH, txtStart, 104, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, txtStart, 20, SpringLayout.WEST, getContentPane());
		txtStart.setText("Start");
		getContentPane().add(txtStart);
		txtStart.setColumns(10);
		
		JButton btnStart = new JButton("Start");
		springLayout.putConstraint(SpringLayout.WEST, btnStart, 124, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnStart, -135, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, txtStart, -23, SpringLayout.WEST, btnStart);
		getContentPane().add(btnStart);
		
		txtEnd = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, btnStart, -34, SpringLayout.WEST, txtEnd);
		springLayout.putConstraint(SpringLayout.NORTH, txtEnd, 0, SpringLayout.NORTH, txtStart);
		springLayout.putConstraint(SpringLayout.WEST, txtEnd, 235, SpringLayout.WEST, getContentPane());
		txtEnd.setText("End");
		getContentPane().add(txtEnd);
		txtEnd.setColumns(10);
		
		JButton btnEnd = new JButton("End");
		springLayout.putConstraint(SpringLayout.EAST, txtEnd, -27, SpringLayout.WEST, btnEnd);
		springLayout.putConstraint(SpringLayout.NORTH, btnEnd, 103, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnEnd, 343, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnEnd, -10, SpringLayout.EAST, getContentPane());
		getContentPane().add(btnEnd);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, 19, SpringLayout.SOUTH, txtStart);
		springLayout.putConstraint(SpringLayout.WEST, textField, 0, SpringLayout.WEST, txtStart);
		springLayout.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, txtStart);
		textField.setText("\uC0C1\uD669");
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\uC0C1\uD669");
		springLayout.putConstraint(SpringLayout.NORTH, button, -1, SpringLayout.NORTH, textField);
		springLayout.putConstraint(SpringLayout.WEST, button, 0, SpringLayout.WEST, btnStart);
		springLayout.putConstraint(SpringLayout.EAST, button, -229, SpringLayout.EAST, getContentPane());
		getContentPane().add(button);
		
		textField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 22, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.WEST, textField_1, 20, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, txtStart);
		textField_1.setText("\uBA54\uC138\uC9C0\uD568");
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		button_1 = new JButton("\uBA54\uC138\uC9C0\uD568");
		springLayout.putConstraint(SpringLayout.NORTH, button_1, -1, SpringLayout.NORTH, textField_1);
		springLayout.putConstraint(SpringLayout.EAST, button_1, 0, SpringLayout.EAST, button);
		getContentPane().add(button_1);
		
		txtAttendanceAdminSystem = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtAttendanceAdminSystem, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, txtAttendanceAdminSystem, 0, SpringLayout.WEST, btnStart);
		springLayout.putConstraint(SpringLayout.EAST, txtAttendanceAdminSystem, -123, SpringLayout.EAST, getContentPane());
		txtAttendanceAdminSystem.setText("Attendance Admin System");
		getContentPane().add(txtAttendanceAdminSystem);
		txtAttendanceAdminSystem.setColumns(10);
		
		textField_2 = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textField_2, 23, SpringLayout.EAST, txtSelectDate);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_2, -22, SpringLayout.NORTH, btnStart);
		springLayout.putConstraint(SpringLayout.EAST, textField_2, 139, SpringLayout.EAST, txtSelectDate);
		textField_2.setText("2015 / 04 / 19");
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
