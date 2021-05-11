package demo2;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class myServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		
		ServletContext ctx=getServletContext();
		String str=ctx.getInitParameter("name");
		out.println("hello "+str);
		
		str=ctx.getInitParameter("phone");
		out.println("phone is "+str);
		
		ServletConfig cg=getServletConfig();
		str=cg.getInitParameter("name");
		out.println("name in config "+str);
	}
}
