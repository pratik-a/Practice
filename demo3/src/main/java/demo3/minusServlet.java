package demo3;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/minus")
public class minusServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		int i=Integer.parseInt(request.getParameter("num1"));
		int j=Integer.parseInt(request.getParameter("num2"));
		
		int k=i-j;
		
		PrintWriter out=response.getWriter();
		out.println("sum is "+k);
		k=k/2;
		
Cookie cookie =new Cookie("k",k+"");
response.addCookie(cookie);
		
		
		response.sendRedirect("div");
		
		
		
		/*RequestDispatcher rd=request.getRequestDispatcher("sq");
		rd.forward(request, response);*/
	}
}
