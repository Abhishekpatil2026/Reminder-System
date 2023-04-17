import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class CreateReminder 
{
	void create()
	{
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-");
		System.out.println("=========Welcome to CREATE REMINDER SECTION==============");
		Scanner s=new Scanner(System.in);
		DbConnection dc=new DbConnection();
		Connection con=dc.connect();
		System.out.println("Write the Reminder");
	
		String Reminder=s.nextLine();
		Reminder+=s.nextLine();
		int Srno=0;
		try
		{
			String S="insert into reminder values(?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(S);
//			String email = Credential.getEmail();
//			int Aid = Credential.getId();
			pstmt.setInt(1, Srno);
			pstmt.setInt(2, Credential.getId());
			pstmt.setString(3, Credential.getEmail());
			pstmt.setString(4, Reminder);
			
			int i=pstmt.executeUpdate();
			if(i>0)
			{
				System.out.println("Reminder Created Successfully");
				System.out.println("===========================");
			}
			else
			{
				System.out.println("Not Created Successfully");
			}
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
