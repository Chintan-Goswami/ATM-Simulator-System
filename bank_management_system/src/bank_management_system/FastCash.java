
package bank_management_system;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

@SuppressWarnings("serial")
public class FastCash extends JFrame implements ActionListener {

	JLabel text;
	JButton five100, two1000, ten1000, back, five1000, one1000, one100;
	String pinNumber = null;

	FastCash(String pinNumber) {

		this.pinNumber = pinNumber;
		// make layout default
		setLayout(null);

		// Get Image
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);

		// add text
		text = new JLabel("SELECT WITHDRAWL AMOUNT");
		text.setBounds(210, 300, 700, 35);
		text.setForeground(Color.white);
		text.setFont(new Font("System", Font.BOLD, 16));
		image.add(text);

		// Buttons
		one100 = new JButton("Rs 100");
		one100.setBounds(170, 415, 150, 30);
		one100.addActionListener(this);
		image.add(one100);

		five100 = new JButton("Rs 500");
		five100.setBounds(355, 415, 150, 30);
		five100.addActionListener(this);
		image.add(five100);

		one1000 = new JButton("Rs 1000");
		one1000.setBounds(170, 450, 150, 30);
		one1000.addActionListener(this);
		image.add(one1000);

		two1000 = new JButton("Rs 2000");
		two1000.setBounds(355, 450, 150, 30);
		two1000.addActionListener(this);
		image.add(two1000);

		ten1000 = new JButton("Rs 10000");
		ten1000.setBounds(355, 485, 150, 30);
		ten1000.addActionListener(this);
		image.add(ten1000);

		five1000 = new JButton("Rs 50000");
		five1000.setBounds(170, 485, 150, 30);
		five1000.addActionListener(this);
		image.add(five1000);

		back = new JButton("BACK");
		back.setBounds(355, 520, 150, 30);
		back.addActionListener(this);
		image.add(back);

		// create frame
		setSize(900, 900);
		setLocation(300, 0);
		setUndecorated(true);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == back) {
			setVisible(false);
			new Transactions(pinNumber).setVisible(true);
		} else {
			String amount = ((JButton) ae.getSource()).getText().substring(3);

			try {
				connection c = new connection();
				ResultSet rs = c.s.executeQuery("select * from bank where pinNumber = '" + pinNumber + "'");
				int balance = 0;
				while (rs.next()) {
					if (rs.getString("type").equals("Deposit")) {
						balance += Integer.parseInt(rs.getString("amount"));
					} else {
						balance -= Integer.parseInt(rs.getString("amount"));
					}
				}

				if (ae.getSource() != back && balance < Integer.parseInt(amount)) {
					JOptionPane.showMessageDialog(null, "Insufficient Balance");
					System.out.println(amount);
					System.out.println(balance);
					return;
				}
				Date date = new Date();
				String query = "insert into bank values('" + pinNumber + "', '" + date + "','Withdraw', '" + amount
						+ "')";
				c.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Rs " + amount + " Debited Successfully");

				setVisible(false);
				new Transactions(pinNumber).setVisible(true);

			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

	public static void main(String[] args) {
		new FastCash("");

	}

}
