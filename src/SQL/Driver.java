package SQL;

import java.sql.*;

public class Driver {

	public Statement Connects(){
		// TODO Auto-generated method stub

		//Get a Connection to Data Base
		
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "Bish/1478");

			//String userName = "Mina";
			//String Password = "Mina";

			Statement myStat = myConn.createStatement();
			//myStat.executeUpdate("INSERT INTO Employees " + "VALUES ( , "+ userName + ", " + Password +", 'A')");

			return myStat;
			
			//statement.executeUpdate("INSERT INTO Customers " + "VALUES (1001, 'Simpson', 'Mr.', 'Springfield', 2001)");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
		//Create a statement
		
		//Execute a SQL query
		
		//Process resultset
		
		
		
	}

}
