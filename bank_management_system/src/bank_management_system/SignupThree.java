package bank_management_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class SignupThree extends JFrame implements ActionListener {

	// variables
	JRadioButton r1, r2, r3, r4;
	JCheckBox c1, c2, c3, c4, c5, c6, c7;
	JButton submit, cancel;
	String formno = null;

	SignupThree(String formno) {
		this.formno = formno;

		setLayout(null);

		// text label
		JLabel l1 = new JLabel("ACCOUNT DETAILS - PAGE 3");
		l1.setFont(new Font("Raleway", Font.BOLD, 22));
		l1.setBounds(280, 40, 400, 40);
		add(l1);

		JLabel type = new JLabel("Account Type");
		type.setFont(new Font("Raleway", Font.BOLD, 22));
		type.setBounds(100, 140, 200, 30);
		add(type);

		// Radio Buttons

		r1 = new JRadioButton("Saving Account");
		r1.setFont(new Font("Raleway", Font.BOLD, 16));
		r1.setBackground(Color.white);
		r1.setBounds(100, 180, 150, 20);
		add(r1);

		r2 = new JRadioButton("Fixed Deposit Acoount");
		r2.setFont(new Font("Raleway", Font.BOLD, 16));
		r2.setBackground(Color.white);
		r2.setBounds(350, 180, 250, 20);
		add(r2);

		r3 = new JRadioButton("Current Account");
		r3.setFont(new Font("Raleway", Font.BOLD, 16));
		r3.setBackground(Color.white);
		r3.setBounds(100, 220, 150, 20);
		add(r3);

		r4 = new JRadioButton("Reccuring Deposit Account");
		r4.setFont(new Font("Raleway", Font.BOLD, 16));
		r4.setBackground(Color.white);
		r4.setBounds(350, 220, 250, 20);
		add(r4);

		// for Card number
		JLabel cardNumber = new JLabel("Card Number");
		cardNumber.setFont(new Font("Raleway", Font.BOLD, 22));
		cardNumber.setBounds(100, 300, 200, 30);
		add(cardNumber);

		JLabel number = new JLabel("XXXX-XXXX-XXXX- 4184");
		number.setFont(new Font("Raleway", Font.BOLD, 22));
		number.setBounds(330, 300, 300, 30);
		add(number);

		JLabel carddetail = new JLabel("Your 16 Digit Card Number");
		carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
		carddetail.setBounds(100, 330, 200, 20);
		add(carddetail);

		// For pin number

		JLabel pin = new JLabel("PIN ");
		pin.setFont(new Font("Raleway", Font.BOLD, 22));
		pin.setBounds(100, 370, 200, 30);
		add(pin);

		JLabel pinNumber = new JLabel("XXXX");
		pinNumber.setFont(new Font("Raleway", Font.BOLD, 22));
		pinNumber.setBounds(330, 370, 300, 30);
		add(pinNumber);

		JLabel pinDetail = new JLabel("Your 4 Digit PIN");
		pinDetail.setFont(new Font("Raleway", Font.BOLD, 12));
		pinDetail.setBounds(100, 400, 200, 20);
		add(pinDetail);

		// for service require

		JLabel services = new JLabel("Services required");
		services.setFont(new Font("Raleway", Font.BOLD, 22));
		services.setBounds(100, 450, 400, 30);
		add(services);
		// check box
		c1 = new JCheckBox("ATM CARD");
		c1.setBackground(Color.white);
		c1.setFont(new Font("Raleway", Font.BOLD, 16));
		c1.setBounds(100, 500, 200, 30);
		add(c1);
		c2 = new JCheckBox("Internet Banking");
		c2.setBackground(Color.white);
		c2.setFont(new Font("Raleway", Font.BOLD, 16));
		c2.setBounds(350, 500, 200, 30);
		add(c2);
		c3 = new JCheckBox("Mobile Banking");
		c3.setBackground(Color.white);
		c3.setFont(new Font("Raleway", Font.BOLD, 16));
		c3.setBounds(100, 550, 200, 30);
		add(c3);
		c4 = new JCheckBox("EMAIL & SMS Alerts");
		c4.setBackground(Color.white);
		c4.setFont(new Font("Raleway", Font.BOLD, 16));
		c4.setBounds(350, 550, 200, 30);
		add(c4);
		c5 = new JCheckBox("Cheque Book");
		c5.setBackground(Color.white);
		c5.setFont(new Font("Raleway", Font.BOLD, 16));
		c5.setBounds(100, 600, 200, 30);
		add(c5);
		c6 = new JCheckBox("E-Statement");
		c6.setBackground(Color.white);
		c6.setFont(new Font("Raleway", Font.BOLD, 16));
		c6.setBounds(350, 600, 200, 30);
		add(c6);
		c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my Knowledge");
		c7.setBackground(Color.white);
		c7.setFont(new Font("Raleway", Font.BOLD, 12));
		c7.setBounds(100, 680, 550, 30);
		add(c7);

		// Buttons
		submit = new JButton("Submit");
		submit.setBackground(Color.black);
		submit.setForeground(Color.white);
		submit.setFont(new Font("Raleway", Font.BOLD, 14));
		submit.setBounds(250, 720, 100, 30);
		submit.addActionListener(this);
		add(submit);
		cancel = new JButton("Cancel");
		cancel.setBackground(Color.black);
		cancel.setForeground(Color.white);
		cancel.setFont(new Font("Raleway", Font.BOLD, 14));
		cancel.setBounds(420, 720, 100, 30);
		cancel.addActionListener(this);
		add(cancel);

		ButtonGroup groupAccount = new ButtonGroup();
		groupAccount.add(r1);
		groupAccount.add(r2);
		groupAccount.add(r3);
		groupAccount.add(r4);
		// frame
		setSize(850, 820);
		getContentPane().setBackground(Color.white);
		setLocation(350, 0);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == submit) {

			String accountType = null;
			if (r1.isSelected()) {
				accountType = "Saving Account";
			} else if (r2.isSelected()) {
				accountType = "Fixed Deposit Account";
			} else if (r3.isSelected()) {
				accountType = "Current Acoount";
			} else if (r4.isSelected()) {
				accountType = "Reccuring Deposit Account";
			}

			Random random = new Random();
			String cardNumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);

			String pinNumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);

			String facility = "";
			if (c1.isSelected()) {
				facility = facility + " ATM Card";
			} else if (c2.isSelected()) {
				facility = facility + " Internate Banking";
			} else if (c3.isSelected()) {
				facility = facility + " Mobile Banking";
			} else if (c4.isSelected()) {
				facility = facility + " EMAIL & SMS Alerts";
			} else if (c5.isSelected()) {
				facility = facility + " Cheque Book";
			} else if (c6.isSelected()) {
				facility = facility + " E-Statement";
			}

			try {
				if (accountType.equals("")) {
					JOptionPane.showMessageDialog(null, "Account Type Required");
				} else if (c7.equals("")) {
					JOptionPane.showMessageDialog(null, "Declaration Check Box is Required");
				} else {
					connection conn = new connection();
					String query1 = "insert into signupThree values('" + formno + "', '" + accountType + "' , '"
							+ cardNumber + "', '" + pinNumber + "', '" + facility + "')";

					String query2 = "insert into login values('" + formno + "','" + cardNumber + "', '" + pinNumber
							+ "')";

					conn.s.executeUpdate(query1);
					conn.s.executeUpdate(query2);
					JOptionPane.showMessageDialog(null, "Card Number : " + cardNumber + "\nPIN : " + pinNumber);
				}
				setVisible(false);
				new Deposit(pinNumber).setVisible(true);

			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (ae.getSource() == cancel) {
			setVisible(false);
			new Login().setVisible(true);
		}
	}

	public static void main(String[] args) {
		new SignupThree("");

	}

}
