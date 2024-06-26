package bank_management_system;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

@SuppressWarnings("serial")
public class SignupOne extends JFrame implements ActionListener {

	// make variable global
	long random;
	JTextField nameTextField, fnameTextField, emailTextField, addressTextField, pincodeTextField, stateTextField,
			cityTextField;
	JRadioButton male, female, other, married, unmarried;
	JDateChooser dateChooser;
	JButton next;
	JLabel formno, personDetails, name, fname, city, pincode, address, state, marital, gender, dob, email;

	SignupOne() {

		// make layout Custom
		setLayout(null);

		// for random number
		Random ram = new Random();
		random = Math.abs(ram.nextLong() % 9000L) + 1000L;

		// to add text in frame
		formno = new JLabel("APPLICATION FORM NO. " + random);
		formno.setFont(new Font("Raleway", Font.BOLD, 38));
		formno.setBounds(140, 20, 600, 40);
		add(formno);

		personDetails = new JLabel("Page 1: Personal Details");
		personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		personDetails.setBounds(290, 80, 400, 30);
		add(personDetails);

		// name text
		name = new JLabel("Name:");
		name.setFont(new Font("Raleway", Font.BOLD, 20));
		name.setBounds(100, 140, 100, 30);
		add(name);
		// Text Box
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		nameTextField.setBounds(300, 140, 400, 30);
		add(nameTextField);

		// Father name text
		fname = new JLabel("Father's Name:");
		fname.setFont(new Font("Raleway", Font.BOLD, 20));
		fname.setBounds(100, 190, 200, 30);
		add(fname);
		// Text Box
		fnameTextField = new JTextField();
		fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		fnameTextField.setBounds(300, 190, 400, 30);
		add(fnameTextField);

		// date of birth
		dob = new JLabel("Date of Birth:");
		dob.setFont(new Font("Raleway", Font.BOLD, 20));
		dob.setBounds(100, 240, 200, 30);
		add(dob);
		// date chooser
		dateChooser = new JDateChooser();
		dateChooser.setBounds(300, 240, 400, 30);
		dateChooser.setForeground(new Color(105, 105, 105));
		add(dateChooser);

		// Gender text
		gender = new JLabel("Gender:");
		gender.setFont(new Font("Raleway", Font.BOLD, 20));
		gender.setBounds(100, 290, 200, 30);
		add(gender);
		// radio button
		male = new JRadioButton("Male");
		male.setBounds(300, 290, 60, 30);
		male.setBackground(Color.white);
		add(male);

		female = new JRadioButton("Female");
		female.setBounds(450, 290, 120, 30);
		female.setBackground(Color.white);
		add(female);
		// condition select only one
		ButtonGroup gendergroup = new ButtonGroup();
		gendergroup.add(male);
		gendergroup.add(female);

		// Email text
		email = new JLabel("Email Address:");
		email.setFont(new Font("Raleway", Font.BOLD, 20));
		email.setBounds(100, 340, 200, 30);
		add(email);
		// text box
		emailTextField = new JTextField();
		emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		emailTextField.setBounds(300, 340, 400, 30);
		add(emailTextField);

		// Marital text
		marital = new JLabel("Marital Status:");
		marital.setFont(new Font("Raleway", Font.BOLD, 20));
		marital.setBounds(100, 390, 200, 30);
		add(marital);
		// radio button
		married = new JRadioButton("Married");
		married.setBounds(300, 390, 100, 30);
		married.setBackground(Color.white);
		add(married);

		unmarried = new JRadioButton("Unmarried");
		unmarried.setBounds(450, 390, 100, 30);
		unmarried.setBackground(Color.white);
		add(unmarried);

		other = new JRadioButton("Other");
		other.setBounds(630, 390, 100, 30);
		other.setBackground(Color.white);
		add(other);
		// condition select only one
		ButtonGroup maritalgroup = new ButtonGroup();
		maritalgroup.add(married);
		maritalgroup.add(unmarried);
		maritalgroup.add(other);

		// Address text
		address = new JLabel("Address:");
		address.setFont(new Font("Raleway", Font.BOLD, 20));
		address.setBounds(100, 440, 200, 30);
		add(address);
		// text box
		addressTextField = new JTextField();
		addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		addressTextField.setBounds(300, 440, 400, 30);
		add(addressTextField);

		// City text
		city = new JLabel("City:");
		city.setFont(new Font("Raleway", Font.BOLD, 20));
		city.setBounds(100, 490, 200, 30);
		add(city);
		// text box
		cityTextField = new JTextField();
		cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		cityTextField.setBounds(300, 490, 400, 30);
		add(cityTextField);

		// State text
		state = new JLabel("State:");
		state.setFont(new Font("Raleway", Font.BOLD, 20));
		state.setBounds(100, 540, 200, 30);
		add(state);
		// text box
		stateTextField = new JTextField();
		stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		stateTextField.setBounds(300, 540, 400, 30);
		add(stateTextField);

		// Pin code text
		pincode = new JLabel("Pin Code:");
		pincode.setFont(new Font("Raleway", Font.BOLD, 20));
		pincode.setBounds(100, 590, 200, 30);
		add(pincode);
		// text box
		pincodeTextField = new JTextField();
		pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		pincodeTextField.setBounds(300, 590, 400, 30);
		add(pincodeTextField);

		// buttons
		next = new JButton("Next");
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setFont(new Font("Raleway", Font.BOLD, 14));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);

		// change color of frame
		getContentPane().setBackground(Color.white);

		// create frame
		setSize(850, 800);
		// set location of frame
		setLocation(350, 10);
		// show frame
		setVisible(true);

	}

	public void actionPerformed(ActionEvent ae) {

		String formno = "" + random;
		String name = nameTextField.getText();
		String fname = fnameTextField.getText();
		String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

		String gender = null;
		if (male.isSelected()) {
			gender = "Male";
		} else if (female.isSelected()) {
			gender = "Female";
		}
		String email = emailTextField.getText();

		String marital = null;
		if (married.isSelected()) {
			marital = "Married";
		} else if (unmarried.isSelected()) {
			marital = "Unmarried";
		} else if (other.isSelected()) {
			marital = "Other";
		}
		String address = addressTextField.getText();
		String city = cityTextField.getText();
		String pincode = pincodeTextField.getText();
		String state = stateTextField.getText();

		try {

			if (name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is required");
			} else if (fname.equals("")) {
				JOptionPane.showMessageDialog(null, "Father Name is required");
			} else if (dob.equals("")) {
				JOptionPane.showMessageDialog(null, "Date of birth is required");
			} else if (gender.equals("")) {
				JOptionPane.showMessageDialog(null, "Gender is required");
			} else if (email.equals("")) {
				JOptionPane.showMessageDialog(null, "Email is required");
			} else if (marital.equals("")) {
				JOptionPane.showMessageDialog(null, "Marital is required");
			} else if (address.equals("")) {
				JOptionPane.showMessageDialog(null, "Address is required");
			} else if (city.equals("")) {
				JOptionPane.showMessageDialog(null, "City is required");
			} else if (pincode.equals("")) {
				JOptionPane.showMessageDialog(null, "Pin Code is required");
			} else if (state.equals("")) {
				JOptionPane.showMessageDialog(null, "State is required");
			} else {
				// Steps to connect JDBC into Mysql
				// Step-1 : Register the Driver
				connection c = new connection();
				String query = "insert into signup values ('" + formno + "' , '" + name + "' , '" + fname + "' , '"
						+ dob + "' , '" + gender + "' , '" + email + "' , '" + marital + "' , '" + address + "' , '"
						+ city + "' , '" + pincode + "' , '" + state + "')";

				// Step-4: Execute Query
				c.s.executeUpdate(query);

				setVisible(false);
				new SignupTwo(formno).setVisible(true);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		new SignupOne();

	}

}
