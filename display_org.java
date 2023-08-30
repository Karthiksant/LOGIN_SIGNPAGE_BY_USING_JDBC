package DA0_TABLES;
import java.sql.*;
import java.util.Scanner;
public class display_org 
{
	public static void main(String[]args)
	{		Scanner sc=new Scanner(System.in);
		try
		{	
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url_link="jdbc:mysql://localhost:3306/login";
			String user_name="root";
			String password="Karthiksant143";	
			Connection con=DriverManager.getConnection(url_link,user_name,password);
			Statement st=con.createStatement();
			System.out.println("display operation start");
			dto_data obj=new dto_data();
			String r=obj.getPassword();		
			ResultSet rs=st.executeQuery("select * from signin where password='"+r+"'");
			while(rs.next())
			{
				int id=rs.getInt(1);
				String username=rs.getString(2);
				long phone=rs.getLong(3);
				System.out.println("displaying only non-confidential data of user");
				System.out.println(id+" | "+username+" | "+phone);
				break;
			}
			System.out.println("display operation end");
			features.main(args);
			con.close();
		}
			catch(ClassNotFoundException | SQLException obj)
			{
				obj.printStackTrace();
			}		
			System.out.println();
	}
}
