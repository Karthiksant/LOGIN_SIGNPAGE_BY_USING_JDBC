package DA0_TABLES;
import java.sql.*;
public class create
{
	public static void main(String[] args) 
	{
	  try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection	con= DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root", "Karthiksant143");
			PreparedStatement p=con.prepareStatement("create table signin(id int primary key, username varchar(40) not null, mobile_no bigint(10) not null, password varchar(40) not null,email_id varchar(40), otp int ,age int, gender varchar(10))");
			p.execute();
			System.out.println("table created succesfully");
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}		
	}
}
