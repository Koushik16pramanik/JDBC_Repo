package Com.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Helper {
static {
	 try {
	 	Class.forName("com.mysql.cj.jdbc.Driver");//registering my sql driver
}
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 }
public static Connection con()throws SQLException{
	 return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Koushik@123");
	 
}

public static void main(String...args) throws SQLException {
	ManuDrivenEg mde=new ManuDrivenEg();
	mde.saveMenudriven();
	mde.fetchMenudriven();
	mde.updateMenudriven();
	mde.deleteMenudriven();
}}
