package Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import SQL.Driver;

public class Employee {
	
	private int id;
	private String userName;
	private String password;
	private String priv;
	
	public Employee (String userN, String userP){
		Driver D = new Driver();
		Statement myStat = D.Connects();
		try {
			ResultSet rs = myStat.executeQuery("SELECT * FROM Employees WHERE userName='"+ userN + "' AND Password='" + userP +"';");
			
			while (rs.next()) {
					
				  this.id = rs.getInt("id");
				  this.userName = rs.getString("userName");
				  this.password = rs.getString("Password");
				  this.priv = rs.getString("privalage");
				}
			
			} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getUserName(){
		return this.userName;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public String getPriv(){
		return this.priv;
	}
	
	public void addAdmin(String userName, String Password){
		
		if (this.getPriv().equals("A")){
			Driver D = new Driver();
			Statement myStat = D.Connects();
			try {
				myStat.executeUpdate("INSERT INTO Employees (userName, Password, privalage) VALUES ('"+ userName + "', '" + Password +"', 'A')");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else{
			System.out.println("No Access");
		}
		
	}
	

}
