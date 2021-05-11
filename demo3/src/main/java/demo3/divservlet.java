package demo3;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/div")
public class divservlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		PrintWriter out=response.getWriter();
		int k=0;
		Cookie cookie[]=request.getCookies();
		
		for(Cookie c:cookie)
		{
			if(c.getName().equals("k"))
					{
				k=Integer.parseInt(c.getValue());
					}
		}
		out.println("hello squaaare"+k);
	}
}
