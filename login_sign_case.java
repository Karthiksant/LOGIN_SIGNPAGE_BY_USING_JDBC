package DA0_TABLES;
import java.util.*;
public class login_sign_case
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		// \n breaking the line
		
		boolean b=false;
		do
		{	System.out.println("enter 1 for signup \n      2 for login");
			int n=sc.nextInt();
			switch(n)
			{
			case 1: //signup
					signin_data_entry.main(args);
					//  signin_data_entry mthd
					//2 main sameclass main
					b=false;
					break;
			case 2: //login
					b=false;
					boolean b1=false;
					do
					{	
						System.out.println("how you want to login \n enter 1 for login by gmail \n enter 2 for login by phneno");
						int n1=sc.nextInt();
						switch(n1)
						{
						case 1: //gmail
								System.out.println("enter gmail");
								gmail_verify_org.main(args);
								b1=false;
								break;
						case 2: //phoneno
								System.out.println("enter phoneno");
								phne_vrfy2.main(args);
								b1=false;
								break;
						default :
								b1=true;
								System.out.println("enter valid input 1/2");
								break;
						}
					}while(b1);
					break;
			default :
					b=true;
					System.out.println("enter valid input 1/2");
					break;
			}
		}while(b);
	}
}
