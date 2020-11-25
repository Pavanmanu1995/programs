package client;
import utilities.JdbcConnection;
import java.sql.*;

public class GameApp {
	static Connection connection = JdbcConnection.getConnection();
	
	public static void main(String[] args) {
		
		try
		{
			Statement s1 = connection.createStatement();
			ResultSet rs = s1.executeQuery("Select * from person;");
			
			while(rs.next())
			{
				int id = rs.getInt("p_id");
				String name = rs.getString("p_name");
				
				System.out.println(id+" "+name);
			}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
