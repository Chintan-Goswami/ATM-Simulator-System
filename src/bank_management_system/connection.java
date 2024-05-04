package bank_management_system;

import java.sql.*;

//JDBC Connecter
public class connection {

	Connection c;
	Statement s;

	connection() {
		// exception Handling
		try {

			// Step-2: Create Connection //location of MySql //database name //Password of MySql
			c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Chintan@2570");
			// Step-3: Create Statement
			s = c.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}