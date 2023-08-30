package DA0_TABLES;
import java.sql.*;
import java.util.Scanner;
public class delete_account
{
	public static void main(String[]args)
	{
		try
		{	Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url_link="jdbc:mysql://localhost:3306/login";
			String user_name="root";
			String password="Karthiksant143";	
			Connection con=DriverManager.getConnection(url_link,user_name,password);
			Statement st=con.createStatement();	
			System.out.println("delete operation ");
			dto_data obj=new dto_data();
			String r=obj.getPassword();
			st.executeUpdate("delete from signin  where password='"+r+"'");		
			System.out.println(" Account deleted successfully");
			con.close();
		}
			catch(ClassNotFoundException | SQLException obj)
			{
				obj.printStackTrace();
			}
		}
}
