package login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class TeamProcess1 extends TeamProcess{
	
	Connection c=database();
	boolean b=false;
	public boolean login(String username,String password)
	
	{
		try{
			
		Statement s=c.createStatement();
		String query ="select * from userdata where email='"+username+"' and password='"+password+"'";
		System.out.println(query);
		ResultSet k=s.executeQuery(query);
		if(k.next())
		{
			b= true;
		}else
		{
			b= false;
		}
		}
		catch(SQLException e)
		{
			System.out.println(e);
			return false;
		}
	return b;
	}
	


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	
	
	}

}
