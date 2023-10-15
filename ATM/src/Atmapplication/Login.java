package Atmapplication;

import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener {
	JButton Login, signup, clear;
	JTextField cardTextField;
	JPasswordField pinTextField;

	Login() {
		setTitle("Atm Machine");
		setLayout(null);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons1/logo.jpg"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		label.setBounds(70, 10, 100, 100);
		add(label);

		JLabel text = new JLabel("Welcome To ATM");
		text.setFont(new Font("osward", Font.BOLD, 38));
		text.setBounds(200, 40, 400, 40);
		add(text);

		JLabel cardno = new JLabel("CardNo");
		cardno.setFont(new Font("osward", Font.BOLD, 38));
		cardno.setBounds(120, 150, 150, 30);
		add(cardno);

		cardTextField = new JTextField();
		cardTextField.setBounds(300, 150, 250, 30);
		cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
		add(cardTextField);

		JLabel pin = new JLabel("PinNo");
		pin.setFont(new Font("osward", Font.BOLD, 38));
		pin.setBounds(120, 220, 230, 30);
		add(pin);

		pinTextField = new JPasswordField();
		pinTextField.setBounds(300, 220, 250, 30);
		pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
		add(pinTextField);

		Login = new JButton("SIGN IN");
		Login.setBounds(300, 300, 100, 30);
		Login.setBackground(Color.BLACK);
		Login.setForeground(Color.WHITE);
		Login.addActionListener(this);
		add(Login);

		clear = new JButton("CLEAR");
		clear.setBounds(430, 300, 100, 30);
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.WHITE);
		clear.addActionListener(this);
		add(clear);

		signup = new JButton("SIGN UP");
		signup.setBounds(300, 350, 230, 30);
		signup.setBackground(Color.BLACK);
		signup.setForeground(Color.WHITE);
		signup.addActionListener(this);
		add(signup);

		getContentPane().setBackground(Color.WHITE);
		setSize(800, 450);
		setVisible(true);
		setLocation(350, 250);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == clear) {
			cardTextField.setText("");
			pinTextField.setText("");

		}

		else if (ae.getSource() == Login) {
			Conn conn = new Conn();
			String cardnumber = cardTextField.getText();
			String pinnumber = pinTextField.getText();
			String query = "select * from login where cardnumber = '" + cardnumber + "' and pinnumber = '" + pinnumber
					+ "'";

			try {
				ResultSet rs = conn.s.executeQuery(query);
				if (rs.next()) {
					setVisible(false);
					new Transcation(pinnumber).setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Incorrect card number or pin");
				}
			} catch (Exception e) {
				System.out.println(e);

			}

		} else if (ae.getSource() == signup) {
			setVisible(false);
			new Signup().setVisible(true);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();

	}

}
