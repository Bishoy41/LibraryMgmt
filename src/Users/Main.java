package Users;

import java.sql.Statement;

import SQL.Driver;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame{
	
	public static void main(String[] args) {
	
		
		loadLogin();
		
        
	}
	
	private static void loadLogin(){
		JFrame frame = new JFrame();
		frame.setSize(600, 600);
		frame.getContentPane().setBackground( Color.cyan);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JLabel label = new JLabel();
        label.setText("User Name:");
        label.setSize(100, 100);
        label.setFont(new Font("Courier New", Font.ITALIC, 16));
        label.setLocation(100, 85);
        frame.add(label);
        label.setVisible(true);
 
		
		JLabel passLabel = new JLabel();
		passLabel.setText("Password:");
		passLabel.setSize(100, 360);
		passLabel.setFont(new Font("Courier New", Font.ITALIC, 16));
		passLabel.setLocation(100, 105);
        frame.add(passLabel);
        passLabel.setVisible(true);
		
		JTextField field = new JTextField(20);
		frame.add(field);
		field.setLocation(150, 150);
		field.setSize(250, 50);
        field.setVisible(true);
        
        
        
        
        
        JTextField field1 = new JTextField(20);
		frame.add(field1);
		field1.setLocation(150, 300);
		field1.setSize(250, 50);
        field1.setVisible(true);
        
        JButton button = new JButton("Sign In");
        frame.add(button);
        button.setLocation(150, 500);
        button.setSize(100, 50);
        button.setVisible(true);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                  // this makes sure the button you are pressing is the button variable
                  if(e.getSource() == button) {
                	  String user = field.getText();
                      String pass = field1.getText();
                      Employee LoggedIn = new Employee(user,pass);
                      if (LoggedIn.getPriv().equals("A")){
                    	  System.out.println("Access granted");
                    	  LoggedIn();
                      }
                      
                      
                   }
            }
      });
        
	}
	
	private static void LoggedIn(){
		JFrame frame = new JFrame();
		frame.setSize(600, 600);
		frame.getContentPane().setBackground( Color.black);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JLabel label = new JLabel();
        label.setText("User Name:");
        label.setSize(100, 100);
        label.setFont(new Font("Courier New", Font.ITALIC, 16));
        label.setLocation(100, 85);
        frame.add(label);
        label.setVisible(true);
 
		
		JLabel passLabel = new JLabel();
		passLabel.setText("Password:");
		passLabel.setSize(100, 360);
		passLabel.setFont(new Font("Courier New", Font.ITALIC, 16));
		passLabel.setLocation(100, 105);
        frame.add(passLabel);
        passLabel.setVisible(true);
		
		JTextField field = new JTextField(20);
		frame.add(field);
		field.setLocation(150, 150);
		field.setSize(250, 50);
        field.setVisible(true);
        
        
        
        
        
        JTextField field1 = new JTextField(20);
		frame.add(field1);
		field1.setLocation(150, 300);
		field1.setSize(250, 50);
        field1.setVisible(true);
        
        JButton button = new JButton("Sign In");
        frame.add(button);
        button.setLocation(150, 500);
        button.setSize(100, 50);
        button.setVisible(true);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                  // this makes sure the button you are pressing is the button variable
                  if(e.getSource() == button) {
                	  String user = field.getText();
                      String pass = field1.getText();
                      Employee LoggedIn = new Employee(user,pass);
                      if (LoggedIn.getPriv().equals("A")){
                    	  System.out.println("Access granted");
                      }
                      
                      
                   }
            }
      });
	}
	
}
