package DA0_TABLES;
import java.sql.*;
import java.util.*;
public class features 
{
	public static void main(String[]args)
	{	Scanner sc=new Scanner(System.in);
		
		System.out.println("entered to application");
		boolean b=false;
		do {
			System.out.println("enter which operation to perform \n enter 1 for display \n enter 2 for search account \n enter 3 for update \n enter 4 for delete \n enter 5 for signout");
			int n=sc.nextInt();
			switch(n)
			{
				case 1:
						display_org.main(args);
						break;
				case 2:
						search.main(args);
						break;
				case 3:
						update_account.main(args);
						break;
				case 4:
						delete_account.main(args);
						break;
				case 5: System.out.println("end of application signedout");
						login_sign_case.main(args);
						break;
			}
			System.out.println("do you want to perform one more operation press \n 1 for yes \n 2 for no");
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
		System.out.println();
	}

}
