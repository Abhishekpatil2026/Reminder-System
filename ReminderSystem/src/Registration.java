import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Registration 
{
	void register()
	{
		DbConnection dc=new DbConnection();
		Connection con=dc.connect();
	Scanner s=new Scanner(System.in);
	int id=0;
	System.out.println("Enter your name : ");
	String name=s.next();
	System.out.println("Enter your mobile number : ");
	String mob=s.next();
	System.out.println("Enter your Email id : ");
	String email=s.next();
	System.out.println("Enter your City name : ");
	String city=s.next();
	System.out.println("Enter your Password");
	String password=s.next();
	
	try
	{
		String S="insert into user values(?,?,?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(S);
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, mob);
		pstmt.setString(4, email);
		pstmt.setString(5,city);
		pstmt.setString(6, password);
		
		int i=pstmt.executeUpdate();
		if(i>0)
		{
			System.out.println("Registration Completed........");
		}
		
			Login l=new Login();
			l.login();

		
		
		
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
			
			
			
			
	}

}
