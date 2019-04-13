import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TeamProcess {
	

	Connection database()
	{
		Connection c=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 c =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	
		
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}

		
		return c;
		
	}
	
		
	}
