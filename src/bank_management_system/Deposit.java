package bank_management_system;

import java.awt.Image;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

@SuppressWarnings("serial")
public class Deposit extends JFrame implements ActionListener {

	// global variable
	JTextField amount;
	JButton deposit, back;
	String pinNumber = null;

	Deposit(String pinNumber) {

		this.pinNumber = pinNumber;
		// make layout Default
		setLayout(null);
		// for Image
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);

		JLabel text = new JLabel("Enter the amount you want to deposit");
		text.setForeground(Color.white);
		text.setFont(new Font("System", Font.BOLD, 16));
		text.setBounds(170, 300, 400, 20);
		image.add(text);

		// add text
		amount = new JTextField();
		amount.setFont(new Font("Raleway", Font.BOLD, 22));
		amount.setBounds(170, 350, 320, 25);
		image.add(amount);

		// button
		deposit = new JButton("Deposit");
		deposit.setBounds(355, 485, 150, 30);
		deposit.addActionListener(this);
		image.add(deposit);

		back = new JButton("Back");
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
		if (ae.getSource() == deposit) {
			String number = amount.getText();
			Date date = new Date();
			if (number.equals("")) {
				JOptionPane.showMessageDialog(null, "PLEASE ENTER THE AMOUNT YOU WANT TO DEPOSIT");
			} else {
				connection conn = new connection();
				String query = "insert into bank values('" + pinNumber + "','" + date + "', 'Deposit','" + number
						+ "')";
				try {
					conn.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Rs " + number + " Deposited Successfully");
					setVisible(false);
					new Transactions(pinNumber).setVisible(true);
				} catch (Exception e) {

					System.out.println(e);
				}

			}
		} else if (ae.getSource() == back) {
			setVisible(false);
			new Transactions(pinNumber).setVisible(true);
		}
	}

	public static void main(String[] args) {
		new Deposit("");
	}

}
