import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Login 
{
	void login()
	{
		
		System.out.println("*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-"); 
		System.out.println("============Welcome to LOGIN SECTION==================");
		DbConnection dc=new DbConnection();
		Connection con=dc.connect();
		Scanner s=new Scanner(System.in);
		int choice=1;
		
		
		System.out.println("Enter your email id");
		String email=s.next();
		System.out.println("Enter your password");
		String password=s.next();
		
		try
		{
			String S="select * from user where email=? and password=?";
			PreparedStatement pstmt=con.prepareStatement(S);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				Credential.setEmail(email);
				Credential.setId(rs.getInt(1));
				System.out.println("Login Successfully");
				Mp3 mp=new Mp3();
				mp.play();

				System.out.println("===================");
				System.out.println("What you want to do Create Reminder or View Reminder");
				do{
					System.out.println("Choose 1) for Create Reminder\n2)Choose 2 for View Reminder");
					choice=s.nextInt();
					
				switch(choice)
				{
				case 1 :  CreateReminder cr = new CreateReminder();
							cr.create();
							break;
				case 2 :ViewReminder vr=new ViewReminder();
						vr.view();
						break;
						
				case 3 : DeleteReminder dr=new DeleteReminder();
						dr.delete();
						break;
				
					
				
				}
				
				}while(choice!=0);
				Mp3 m=new Mp3();
				m.play1();
				
				//CreateReminder cr = new CreateReminder();
				//cr.create();
				//ViewReminder vr=new ViewReminder();
				//vr.view();
				
				
			}
			else
			{
				System.out.println("Access Denied ....please Register first and then Login");
				Registration r=new Registration();
				r.register();
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
