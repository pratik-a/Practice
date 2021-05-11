package demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class squareservlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		
		int k=(int)session.getAttribute("k");
		out.println("hello squaaare"+k);
	}
}
