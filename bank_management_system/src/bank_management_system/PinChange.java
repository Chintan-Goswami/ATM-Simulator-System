package bank_management_system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class PinChange extends JFrame implements ActionListener {

	// variable
	JPasswordField pin, rePin;
	JButton change, back;
	String pinNumber = null;

	PinChange(String PinNumber) {
		this.pinNumber = PinNumber;

		setLayout(null);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);

		// text title
		JLabel text = new JLabel("CHANGE YOUR PIN");
		text.setForeground(Color.white);
		text.setFont(new Font("System", Font.BOLD, 16));
		text.setBounds(250, 280, 500, 35);
		image.add(text);

		JLabel pinText = new JLabel("New PIN:");
		pinText.setForeground(Color.white);
		pinText.setFont(new Font("System", Font.BOLD, 16));
		pinText.setBounds(165, 320, 180, 25);
		image.add(pinText);
		// text box
		pin = new JPasswordField();
		pin.setFont(new Font("Raleway", Font.BOLD, 25));
		pin.setBounds(330, 320, 180, 25);
		image.add(pin);

		JLabel rePinText = new JLabel("Re-Enter New PIN:");
		rePinText.setForeground(Color.white);
		rePinText.setFont(new Font("System", Font.BOLD, 16));
		rePinText.setBounds(165, 360, 180, 25);
		image.add(rePinText);
		// text box
		rePin = new JPasswordField();
		rePin.setFont(new Font("Raleway", Font.BOLD, 25));
		rePin.setBounds(330, 360, 180, 25);
		image.add(rePin);

		// buttons

		change = new JButton("CHANGE");
		change.setBounds(355, 485, 150, 30);
		change.addActionListener(this);
		image.add(change);

		back = new JButton("BACK");
		back.setBounds(355, 520, 150, 30);
		back.addActionListener(this);
		image.add(back);

		setSize(900, 900);
		setLocation(300, 0);
		setUndecorated(true);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == change) {

			try {
				@SuppressWarnings("deprecation")
				String nPin = pin.getText();
				@SuppressWarnings("deprecation")
				String rPin = rePin.getText();

				if (!nPin.equals(rPin)) {
					JOptionPane.showMessageDialog(null, "Entered PIN Does Not Match");
					return;
				}
				if (nPin.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter New PIN");
					return;
				}
				if (rPin.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Re-Enter PIN");
					return;
				}

				connection c = new connection();
				String query1 = "update bank set pinNumber = '" + rPin + "' where pinNumber = '" + pinNumber + "'";
				String query2 = "update login set pinNumber = '" + rPin + "' where pinNumber = '" + pinNumber + "'";
				String query3 = "update signupthree set pinNumber = '" + rPin + "' where pinNumber = '" + pinNumber
						+ "'";

				c.s.executeUpdate(query1);
				c.s.executeUpdate(query2);
				c.s.executeUpdate(query3);

				JOptionPane.showMessageDialog(null, "PIN  Changed Successfully");

				setVisible(false);
				new Transactions(rPin).setVisible(true);

			} catch (Exception e) {
				System.out.println(e);
			}
		} else {
			setVisible(false);
			new Transactions(pinNumber).setVisible(true);
		}
	}

	public static void main(String[] args) {
		new PinChange("").setVisible(true);
	}

}
