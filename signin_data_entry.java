package DA0_TABLES;
import java.util.*;
public class signin_data_entry  
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();		
		boolean nme_b=false;
		String username=null;
		do
		{ 	System.out.println("enter the username");
			username=sc.next();
			int los=username.length();
			for(int i=0;i<los;i++)
				{  char ch=username.charAt(i);
					if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
					{
						if(los>=3)
						{
							nme_b=false;
						}
						else
						{
							{ 	nme_b=true;
								System.out.println("enter >3 alpha");
							}
						}
					}
					else
					{ nme_b=true; System.out.println("enter alpha only");}
				}		
		}while(nme_b);
		
		boolean b=false;
		long mobile_no=0;
		do 
		{ System.out.println("enter the mobile_no");
			mobile_no=sc.nextLong();
			long cpy=mobile_no;
			int count=0;
			while(cpy!=0)
			{
				cpy=cpy/10;
				count++;
			}
			if(count==10)
			{ b=false; }
			else
			{b=true; System.out.println("enter 10digits");}			
		}while(b);
        boolean b1=false;
        String password=null;
        do{
        	System.out.println("Enter the password");
    		password=sc.next();
    		int los=password.length();
    		if(los>=10)
    		{ 	int c1=0;
    			int c2=0;
    			int c3=0;
    			int c4=0;
    			for(int i=0;i<los;i++)
    			{ char ch=password.charAt(i);				
    				for(int j='0';j<='9';j++)
    				{ if(ch==j)
    					{c1++;}   				
    				}
    				for(int j='A';j<='Z';j++)
    				{ if(ch==j)
    					{c2++;}   				
    				}
    				for(int j='a';j<='z';j++)
    				{ if(ch==j)
    					{c3++;}   				
    				}  
    				for(int j='a';j<='z';j++)
    				{ if(ch==j)
    					{c3++;}   				
    				}
    				if( !((ch>='0')&&(ch<='9')||(ch>='A')&&(ch<='Z')||(ch>='a')&&(ch<='z')) )
    				{ c4++;}
    			} 
		    		if(c1>=1)
					{b1=false;}
					else { b1=true; System.out.println("Enter atleast one digit");}
		    		if(c2>=1)
					{b1=false;}
					else { b1=true; System.out.println("Enter atleast one upcase");}
		    		if(c3>=1)
					{b1=false;}
					else { b1=true; System.out.println("Enter atleast one locase");}
		    		if(c4>=1)
					{b1=false;}
					else { b1=true; System.out.println("Enter atleast one spchar");}
    		}
    		else {b1=true; System.out.println("Enter the >10chars"); }
        }while(b1);
		
        boolean b2=false;
        String email_id=null;
        do
        {
        	System.out.println("Enter the  email_id");
    		email_id=sc.next();
    		int los=email_id.length();
    		if(los>=8)
    		{
    			if(email_id.contains("@gmail.com"))
    			{ b2=false;}
    			else { b2=true; System.out.println("Enter @gmail.com");}	    			
    		}
    		else { b2=true; System.out.println("Enter atleast 8char");}       	
        }while(b2);
        
		System.out.println("enter the otp");
		int otp=sc.nextInt();
		System.out.println("enter the age");
		int age=sc.nextInt();
		System.out.println("Enter the gender");
		String gender=sc.next();
		// dt 
		dto_data dt=new dto_data();
		dt.setId(id);
		dt.setUsername(username);
		dt.setMobile_no(mobile_no);
		dt.setPassword(password);
		dt.setEmail_id(email_id);
		dt.setOtp(otp);
		dt.setAge(age);
		dt.setGender(gender);
		dao_get_set.project(dt);
		System.out.println("rowdata inserted sucessfully");
		login_sign_case.main(args);
	}
}
