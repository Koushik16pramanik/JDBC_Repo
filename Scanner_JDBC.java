package Com.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Scanner_JDBC {
		public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
			System.out.println("enter s_id");
			String s_id= s.next();
			
			System.out.println("enter s_name");  
			String s_name= s.next();
			
			System.out.println("enter phone");  
			String phone= s.next();
			
			System.out.println("enter city");
			String city= s.next();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");//1.registering
				//2.connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Koushik@123");
				//3.create statement
				PreparedStatement stmt;
				// inserting data in database table
				String sql= "insert into student_manage values(?,?,?,?)";
				stmt= con.prepareStatement(sql);
				stmt.setString(1, s_id);
				stmt.setString(2, s_name);
				stmt.setString(3, phone);
				stmt.setString(4, city);
				stmt.execute();
				System.out.println("inserted successfully.");
				//5.closing connection
				con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}			
	}

}
