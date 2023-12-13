package in.project.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class App{
	
	public static void main(String args[]) {
		
		String url = "";
		String userName = "root";
		String password = "";
		
		try {
			
			Connection con = DriverManager.getConnection(url, userName, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM ");
			
			while(rs.next()) {
				
				System.out.println();
				
			}
			
			con.close();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
}