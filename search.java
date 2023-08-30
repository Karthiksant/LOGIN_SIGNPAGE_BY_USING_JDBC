package DA0_TABLES;
import java.sql.*;
import java.util.Scanner;
public class search
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
			System.out.println("search operation start");
			//System.out.println("enter tablename");
			String tname="signin";   //sc.nextLine();
			boolean b=false;
			do 
				{
				System.out.println("select\n 1 for id search\n 2 for name search\n 3 for phone search");
				int num=sc.nextInt();
				String qry=null;
				if(num==1)
				{
					System.out.println("enter id");
					int id=sc.nextInt();
					qry="id ="+id;
				}
				if(num==2)
				{
					System.out.println("enter name");
					String str1=sc.next();
					qry="username = '"+str1+"'";
				}
				if(num==3)
				{
					System.out.println("enter phone");
					long id2=sc.nextLong();
					qry="mobile_no= "+id2;
					
				}
				ResultSet rs1=st.executeQuery("select * from "+tname+" where "+qry+"");
				while(rs1.next())
				{	
					int id1=rs1.getInt(1);
					String ename=rs1.getString(2);
					long ph=rs1.getLong(3);
					System.out.println("searched details of user another account");
					System.out.println(id1+" | "+ename+" | "+ph);
					break;
				}
				System.out.println("do you want to perform one more search press \n 1 for yes \n 2 for no");
				int n1=sc.nextInt();
				switch(n1)
				{
					case 1:
							b=true;
							break;
					case 2:
							b=false;
							break;
				}
			}while(b);
			System.out.println("search operation end");
			features.main(args);
			con.close();			
		}
			catch(ClassNotFoundException | SQLException obj)
			{
				obj.printStackTrace();
			}
		}

}

