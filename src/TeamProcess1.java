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
		ResultSet k=s.executeQuery("select * from login where username="+username+" and password="+password);
		if(k.next()==true)
		{
			b= true;
		}else
		{
			b= false;
		}
		}
		catch(SQLException e)
		{
			return false;
		}
	return b;
	}
	


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	
	
	}

}
