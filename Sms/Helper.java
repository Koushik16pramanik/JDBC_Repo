package Com.Sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxCrud.Delete;
import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;
import com.mysql.cj.x.protobuf.MysqlxCursor.Fetch;

public class Helper {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");


		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static Connection con() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Koushik@123");
		
	}
	 public static void main(String...args) throws Exception {
		 Fetch it = new Fetch();
		 Insert ft = new Insert();
		 Delete ut = new Delete();
		Scanner scan =new Scanner(System.in); 
		System.out.println("""
				Press 1 for Insert : 
				Press 2 for Display :
				Press 3 for Update :
				Press 4 for Delete :
				Press 5 for Exit : 
				""");
		int variable = scan.nextInt();
		System.out.println("-------------------------------");
		switch(variable) {
		case 2 : 
		  it.fetchMenuDriven();
		  break;
		case 1 :  
			ft.saveMenuDriven();
	 break;
		case 3 :
			ut.updateMenuDriven();
			break;
		case 4 :
			ut.deleteMenuDriven();
			break;
		case 5 :
			System.exit(0);
			break;
		}
	}
		
	}
