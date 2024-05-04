package bank_management_system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class SignupTwo extends JFrame implements ActionListener {

	// make variable global
	JTextField panTextField, aadharTextField, seniorCitizenTextField, existingAccountTextField;
	JButton next;
	JRadioButton eyes, eno, syes, sno;
	JLabel additionalDetails, religion, category, aadhar, pan, seniorCitizen, occupation, educational, income,
			qualification, existingAccount;
	// <?> added for warnings (if you want to remove, you can)
	JComboBox<?> Religion, Category, Income, Qualification, Occupation;
	String formno = null;

	SignupTwo(String formno) {
		this.formno = formno;

		// make layout Custom
		setLayout(null);

		// add title
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

		// add title in form
		additionalDetails = new JLabel("Page 2: Additional Details");
		additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		additionalDetails.setBounds(290, 80, 400, 30);
		add(additionalDetails);

		// Religion text
		religion = new JLabel("Religion:");
		religion.setFont(new Font("Raleway", Font.BOLD, 20));
		religion.setBounds(100, 140, 100, 30);
		add(religion);
		// combo box
		String valreligion[] = { "Hindu", "Muslim", "Sikh", "Christian", "Other" };
		Religion = new JComboBox<Object>(valreligion);
		Religion.setBounds(300, 140, 400, 30);
		Religion.setBackground(Color.white);
		add(Religion);

		// Category text
		category = new JLabel("Category:");
		category.setFont(new Font("Raleway", Font.BOLD, 20));
		category.setBounds(100, 190, 200, 30);
		add(category);
		// combo box
		String valcategory[] = { "General", "OBC", "SC", "ST", "Other" };
		Category = new JComboBox<Object>(valcategory);
		Category.setBounds(300, 190, 400, 30);
		Category.setBackground(Color.white);
		add(Category);

		// Income Text
		income = new JLabel("Income:");
		income.setFont(new Font("Raleway", Font.BOLD, 20));
		income.setBounds(100, 240, 200, 30);
		add(income);
		// combo box
		String valincome[] = { "NULL", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000" };
		Income = new JComboBox<Object>(valincome);
		Income.setBounds(300, 240, 400, 30);
		Income.setBackground(Color.white);
		add(Income);

		// Educational text
		educational = new JLabel("Educational");
		educational.setFont(new Font("Raleway", Font.BOLD, 20));
		educational.setBounds(100, 290, 200, 30);
		add(educational);
		// Qualification text
		qualification = new JLabel("Qualification:");
		qualification.setFont(new Font("Raleway", Font.BOLD, 20));
		qualification.setBounds(100, 315, 200, 30);
		add(qualification);
		// combo box
		String valqualification[] = { "Non-Graduation", "Graduate", "Post-Graduation", "Doctrate", "Other" };
		Qualification = new JComboBox<Object>(valqualification);
		Qualification.setBounds(300, 315, 400, 30);
		Qualification.setBackground(Color.white);
		add(Qualification);

		// Occupation text
		occupation = new JLabel("Occupation:");
		occupation.setFont(new Font("Raleway", Font.BOLD, 20));
		occupation.setBounds(100, 390, 200, 30);
		add(occupation);
		// combo box
		String valoccupation[] = { "Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Other" };
		Occupation = new JComboBox<Object>(valoccupation);
		Occupation.setBounds(300, 390, 400, 30);
		Occupation.setBackground(Color.white);
		add(Occupation);

		// PAN Number text
		pan = new JLabel("PAN Number:");
		pan.setFont(new Font("Raleway", Font.BOLD, 20));
		pan.setBounds(100, 440, 200, 30);
		add(pan);
		// text box
		panTextField = new JTextField();
		panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		panTextField.setBounds(300, 440, 400, 30);
		add(panTextField);

		// Aadhar Number text
		aadhar = new JLabel("Aadhar Number:");
		aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
		aadhar.setBounds(100, 490, 200, 30);
		add(aadhar);
		// text box
		aadharTextField = new JTextField();
		aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		aadharTextField.setBounds(300, 490, 400, 30);
		add(aadharTextField);

		// Senior Citizen text
		seniorCitizen = new JLabel("Senior Citizen:");
		seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
		seniorCitizen.setBounds(100, 540, 200, 30);
		add(seniorCitizen);
		// Radio Button
		syes = new JRadioButton("Yes");
		syes.setBounds(300, 540, 100, 30);
		syes.setBackground(Color.white);
		add(syes);

		sno = new JRadioButton("No");
		sno.setBounds(450, 540, 100, 30);
		sno.setBackground(Color.white);
		add(sno);
		// condition select only one
		ButtonGroup sButton = new ButtonGroup();
		sButton.add(syes);
		sButton.add(sno);

		// Existing Account text
		existingAccount = new JLabel("Existing Account:");
		existingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
		existingAccount.setBounds(100, 590, 200, 30);
		add(existingAccount);
		// Radio Button
		eyes = new JRadioButton("Yes");
		eyes.setBounds(300, 590, 100, 30);
		eyes.setBackground(Color.white);
		add(eyes);

		eno = new JRadioButton("No");
		eno.setBounds(450, 590, 100, 30);
		eno.setBackground(Color.white);
		add(eno);
		// condition select only one
		ButtonGroup eButton = new ButtonGroup();
		eButton.add(eyes);
		eButton.add(eno);

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

		// String type variable to save data into database
		String religion = (String) Religion.getSelectedItem();
		String category = (String) Category.getSelectedItem();
		String income = (String) Income.getSelectedItem();
		String qualification = (String) Qualification.getSelectedItem();
		String occupation = (String) Occupation.getSelectedItem();

		String seniorCitizen = null;
		if (syes.isSelected()) {
			seniorCitizen = "Yes";
		} else if (sno.isSelected()) {
			seniorCitizen = "No";
		}

		String existingAccount = null;
		if (eyes.isSelected()) {
			existingAccount = "Yes";
		} else if (eno.isSelected()) {
			existingAccount = "No";
		}
		String pan = panTextField.getText();
		String aadhar = aadharTextField.getText();

		try {

			if (religion.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is required");
			} else if (category.equals("")) {
				JOptionPane.showMessageDialog(null, "Father Name is required");
			} else if (income.equals("")) {
				JOptionPane.showMessageDialog(null, "Date of birth is required");
			} else if (qualification.equals("")) {
				JOptionPane.showMessageDialog(null, "Gender is required");
			} else if (occupation.equals("")) {
				JOptionPane.showMessageDialog(null, "Email is required");
			} else if (seniorCitizen.equals("")) {
				JOptionPane.showMessageDialog(null, "Marital is required");
			} else if (existingAccount.equals("")) {
				JOptionPane.showMessageDialog(null, "Address is required");
			} else if (pan.equals("")) {
				JOptionPane.showMessageDialog(null, "City is required");
			} else if (aadhar.equals("")) {
				JOptionPane.showMessageDialog(null, "Pin Code is required");
			} else {
				// Steps to connect JDBC into Mysql
				// Step-1 : Register the Driver
				connection c = new connection();
				String query = "insert into signupTwo values ('" + formno + "' , '" + religion + "' , '" + category
						+ "' , '" + income + "' , '" + qualification + "' , '" + occupation + "' , '" + seniorCitizen
						+ "' , '" + existingAccount + "' , '" + pan + "' , '" + aadhar + "')";

				// Step-4: Execute Query
				c.s.executeUpdate(query);
				
				//Signup three object
				setVisible(false);
				new SignupThree(formno).setVisible(true);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String args[]) {

		new SignupTwo("");
	}

}