package  DA0_TABLES;
import java.sql.*;
import java.util.Scanner;
public class  forgotpassword 
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
			
			System.out.println("forgot password question");
			System.out.println("what is your  pet name");
			String q=sc.nextLine();
			if(q.equalsIgnoreCase("rn_idt"))
			{
			//	System.out.println("enter tablename");
				String tname="signin";
				ResultSet rs3=st.executeQuery("select * from "+tname+"");				
				System.out.println("enter 1 to update password by name \n  2 to update password by email \n  3 to update password by phoneno ");
				int num=sc.nextInt();
				String onme1=null;
				String nnme1=null;
				switch(num)
				{
				case 1: System.out.println("enter  name");
						String onme=sc.next();
						onme1="username= '"+onme+"'";
						System.out.println("enter new password");
						String	nnme=sc.next();
						nnme1="password= '"+nnme+"'";	
						break;
				case 2:System.out.println("enter  email");
						String onme3=sc.next();
						onme1="email_id= '"+onme3+"'";
						System.out.println("enter new password");
						String	nnme3=sc.next();
						nnme1="password= '"+nnme3+"'";
						break;
				case 3:	
						System.out.println("enter phone");
						String onme2=sc.next();
						onme1="mobile_no= '"+onme2+"'";
						System.out.println("enter new password");
						String	nnme2=sc.next();
						nnme1="password= '"+nnme2+"'";
						break;
				}
				PreparedStatement ps=con.prepareStatement("update "+tname+" set "+nnme1+" where "+onme1+"");
				ps.execute();
				System.out.println("password updated successfully");
				
			}
			else 
			{	System.out.println("your answer is wrong createnewaccount or login by remembering correct data");
				login_sign_case.main(args);
			}
			
			con.close();
		}
			catch(ClassNotFoundException | SQLException obj)
			{
				obj.printStackTrace();
			}
		}
}
