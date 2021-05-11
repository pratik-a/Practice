package demo1;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class addservlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		int i=Integer.parseInt(request.getParameter("num1"));
		int j=Integer.parseInt(request.getParameter("num2"));
		
		int k=i+j;
		
		PrintWriter out=response.getWriter();
		out.println("sum is "+k);
		k=k*k;
		
Cookie cookie =new Cookie("k",k+"");
response.addCookie(cookie);
		
		
		response.sendRedirect("sq");
		
		
		
		/*RequestDispatcher rd=request.getRequestDispatcher("sq");
		rd.forward(request, response);*/
	}
}
