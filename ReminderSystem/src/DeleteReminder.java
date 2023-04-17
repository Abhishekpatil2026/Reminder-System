import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteReminder 
{
	void delete()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Serial Number");
		int Srno=s.nextInt();
		
		try
		{
		DbConnection dc=new DbConnection();
		Connection con=dc.connect();
		String S="delete from reminder where Srno=? and Aid=?";
		PreparedStatement pstmt=con.prepareStatement(S);
		pstmt.setInt(1, Srno);
		pstmt.setInt(2, Credential.getId());
		int i=pstmt.executeUpdate();
		if(i>0)
		{
			System.out.println("Deleted");
		}
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
