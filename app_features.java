package DA0_TABLES;
import java.sql.*;
import java.util.*;
public class app_features 
{
	public static void main(String[] args)
	{	Scanner sc=new Scanner(System.in);	
		System.out.println("login successfull");
		System.out.println("entered to application");
		System.out.println("enter which operation to perform \n enter 1 for display \n enter 2 for search account \n enter 3 for update \n enter 4 for delete");
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
		}
	}	
}
