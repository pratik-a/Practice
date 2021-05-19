package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class try1jdbc 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/student";
		String uname="root";
		String pass="";
		String query="select * from details";
		
		Connection con=DriverManager.getConnection(url,uname,pass);
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery(query);
		String userData="";
		rs.next();
		
		while(rs.next())
		{
			userData="name : "+rs.getString(1)+", number : "+rs.getInt(2)+", class : "+rs.getInt(3)+", subject : "+rs.getString(4);
			System.out.println(userData);
		}
		
		st.close();
		con.close();
	}
}
