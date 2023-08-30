package  DA0_TABLES;
import java.sql.*;
import java.util.*;
public class  phne_vrfy2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		  	long ph1=12;
		    String pswd="karu";
		    long phv=12;
		    String pswdv="karu";
		System.out.println("enter the mobile number");
		long mbs=sc.nextLong();
		System.out.println("enter your password");
		String pswd1=sc.next();		
		Connection con=null;
		dto_data obj=new dto_data();
	    obj.setPassword(pswd1);
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "Karthiksant143");
			PreparedStatement p=con.prepareStatement("select mobile_no from signin ");
			PreparedStatement p1=con.prepareStatement("select password from signin ");
			PreparedStatement ps=con.prepareStatement("select * from signin where mobile_no= "+mbs+" and password='"+pswd1+"'");
			ResultSet res=p.executeQuery();
			ResultSet resp1=p1.executeQuery();
			ResultSet res1=ps.executeQuery();
			while(res.next())
			{
				 ph1=res.getLong(1);
				if (ph1==mbs)
				{	phv=ph1;
					System.out.println("with phno "+mbs+"  user is present");
					break;			
				}
				else
				{
					// System.out.println("with phoneno "+mb1+" user is not present");}
		       
				}
			}
			if((phv==12))
			{
				System.out.println("with phoneno "+mbs+" user is not present");
			}
			 while(resp1.next())
		      {
		        pswd=resp1.getString(1);
		        if (pswd.equals(pswd1))
		        {	pswdv=pswd;
		          System.out.println("with pswd ******* user is present");
		          break;          
		        }
		        else
		        {
		        	//System.out.println("with pwsd "+pswd1+" user is not present");
		        }
		       
		      }
			 if(pswdv.equals("karu"))
				{
					System.out.println("with pwsd "+pswd1+" user is not present");
				}
			if((phv==mbs)&&(pswdv.equals(pswd1)))
			{}					
			else
			{
				System.out.println("User logindata mismatches or not exists");
				System.out.println("enter 1 to go for signup/login again \n 2 for forgotpassword");
		        int n=sc.nextInt();
		        switch(n)
		        {
		        case 1:          
		          login_sign_case.main(args); 
		          break;
		        case 2:
		        	forgotpassword.main(args);
		        	break;
		        }
			}
			System.out.println("login successfull");
			 features.main(args);
			
		
			
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}

