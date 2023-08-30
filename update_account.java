
package   DA0_TABLES;
import java.sql.*;
import java.util.Scanner;
public class update_account 
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
			dto_data obj=new dto_data();
			String r=obj.getPassword();
			System.out.println("enter 1 to update username \n 2 to update emailid \n 3 to update phoneno");
			int num=sc.nextInt();
			String nnme1=null;
			switch(num)
			{
			case 1: 
					System.out.println("enter new name");
					String	nnme=sc.next();
					nnme1="username= '"+nnme+"'";	
					break;
			case 2:
					System.out.println("enter new new email");
					String	nnme3=sc.next();
					nnme1="email_id= '"+nnme3+"'";
					break;
			case 3:	
					System.out.println("enter new phno");
					long ph1=sc.nextLong();
					nnme1="mobile_no= "+ph1+"";
					break;
			}
			System.out.println("updated to new || "+nnme1);
			st.executeUpdate("update signin set "+nnme1+" where password='"+r+"'");
			System.out.println("updated successfully");
			features.main(args);
			con.close();
		}
			catch(ClassNotFoundException | SQLException obj)
			{
				obj.printStackTrace();
			}
		}
}
