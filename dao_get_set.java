package DA0_TABLES;
import java.sql.*;
public class dao_get_set
{
	public static void project(dto_data d1)
	{
	  try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Karthiksant143");
		PreparedStatement p=con.prepareStatement("insert into signin values(?,?,?,?,?,?,?,?)");
		
		int id=d1.getId();
		String username=d1.getUsername();
		long mobile_no=d1.getMobile_no();
		String password=d1.getPassword();
		String mail_id=d1.getEmail_id();
		int otp=d1.getOtp();
		int age=d1.getAge();
		String gender=d1.getGender();
		
		p.setInt(1,id);
		p.setString(2,username);
		p.setLong(3,mobile_no);
		p.setString(4,password);
		p.setString(5,mail_id);
		p.setInt(6,otp);
		p.setInt(7,age);
		p.setString(8,gender);
		
		p.executeUpdate();
		
		
		}
		catch(ClassNotFoundException | SQLException obj)
		{
			obj.printStackTrace();
		}
	}
}
