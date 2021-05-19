package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class tryjdbc 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/student";
		String uname="root";
		String pass="";
		String query="select name from details where class=5";
		
		Connection con=DriverManager.getConnection(url,uname,pass);
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery(query);
		
		rs.next();
		String name=rs.getString("name");
		
		System.out.println("name is "+name);
		
		st.close();
		con.close();
	}
}
