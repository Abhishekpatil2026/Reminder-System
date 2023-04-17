import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewReminder 
{
	void view()
	{
		
		try
		{
			DbConnection dc=new DbConnection();
			Connection con=dc.connect();
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*--*--*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-");
			System.out.println("==========Welcome to VIEW REMINDER===========");
			String S="select * from reminder where Aid=?";
			PreparedStatement pstmt=con.prepareStatement(S);
			pstmt.setInt(1, Credential.getId());
			System.out.println(Credential.getId());
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				System.out.println("Reminder is  "+rs.getString(4) );
			}
			
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
