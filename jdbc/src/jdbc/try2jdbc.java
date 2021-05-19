package jdbc;
import java.sql.*;

public class try2jdbc 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/student";
		String uname="root";
		String pass="";
		String query="INSERT INTO details VALUES('facebook', NULL, '4', 'social media')";
		
		Connection con=DriverManager.getConnection(url,uname,pass);
		
		Statement st=con.createStatement();
		
		int count=st.executeUpdate(query);
		System.out.println("rows affected after update : "+count);
		
		String name="google";
		int number=2;
		String clas="search";
		query="INSERT INTO details VALUES('"+name+"', NULL, '"+number+"', '"+clas+"')";
		count=st.executeUpdate(query);
		System.out.println("rows affected after update : "+count);
		
		name="netflix";
		
		number=11;
		clas="story content";
		
		query="INSERT INTO details VALUES(?,null,?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, name);
	
		pst.setInt(2, number);
		pst.setString(3, clas);
		count=pst.executeUpdate();
		System.out.println("rows affected after update : "+count);
		
		st.close();
		con.close();
	}
}
