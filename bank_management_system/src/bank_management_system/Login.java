package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener {

	// Define buttons as a global
	JButton login, clear, singup;
	// Define text box as a global
	JTextField cardTextField;
	JPasswordField pinTextField;

	Login() {
		// for title
		setTitle("AUTOMATED TELLER MACHINE");

		// make layout custom
		setLayout(null);

		// to get image
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		// to set image in frame
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		// to add image in frame
		JLabel label = new JLabel(i3);
		// resize image in frame
		label.setBounds(70, 10, 100, 100);
		add(label);

		// to add text in frame
		JLabel text = new JLabel("Welcome to ATM");
		text.setFont(new Font("Osward", Font.BOLD, 38));
		text.setBounds(200, 40, 400, 40);
		add(text);

		JLabel cardno = new JLabel("Card No:");
		cardno.setFont(new Font("Raleway", Font.BOLD, 28));
		cardno.setBounds(120, 150, 150, 30);
		add(cardno);

		// card text box
		cardTextField = new JTextField();
		cardTextField.setBounds(300, 150, 230, 30);
		cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
		add(cardTextField);

		// to add text in frame
		JLabel pin = new JLabel("PIN:");
		pin.setFont(new Font("Raleway", Font.BOLD, 28));
		pin.setBounds(120, 220, 250, 30);
		add(pin);

		// pin text box
		pinTextField = new JPasswordField();
		pinTextField.setBounds(300, 220, 230, 30);
		pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
		add(pinTextField);

		// add Buttons
		login = new JButton("SIGN IN");
		login.setBounds(300, 300, 100, 30);
		login.setBackground(Color.black);
		login.setForeground(Color.white);
		// to add actions in button
		login.addActionListener(this);
		add(login);

		clear = new JButton("CLEAR");
		clear.setBounds(430, 300, 100, 30);
		clear.setBackground(Color.black);
		clear.setForeground(Color.white);
		clear.addActionListener(this);
		add(clear);

		singup = new JButton("SING UP");
		singup.setBounds(300, 350, 230, 30);
		singup.setBackground(Color.black);
		singup.setForeground(Color.white);
		singup.addActionListener(this);
		add(singup);

		// to change color of frame
		getContentPane().setBackground(Color.white);
		// for set size of frame
		setSize(800, 480);
		// for show frame
		setVisible(true);
		// for set frame in to center
		setLocation(350, 200);
	}

	// this method for perform actions
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == clear) {

			cardTextField.setText("");
			pinTextField.setText("");

		} else if (ae.getSource() == login) {
			connection conn = new connection();
			String cardNumber = cardTextField.getText();
			@SuppressWarnings("deprecation")
			String pinNumber = pinTextField.getText();
			String query = "select * from login where cardNumber = '" + cardNumber + "' and pinNumber = '" + pinNumber
					+ "' ";

			try {
				ResultSet rs = conn.s.executeQuery(query);
				if (rs.next()) {
					setVisible(false);
					new Transactions(pinNumber).setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (ae.getSource() == singup) {
			setVisible(false);
			new SignupOne().setVisible(true);

		}
	}

	public static void main(String[] args) {

		new Login();

	}

}
