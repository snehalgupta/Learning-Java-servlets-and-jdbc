import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
//simport java.util.*;
import java.util.Enumeration;
public class ShowHeaders extends HttpServlet {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws IOException, ServletException {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      
      out.println("<p>HTTP headers sent by your client:</p>");
      
	Enumeration<String> enu = request.getHeaderNames();
        while (enu.hasMoreElements()) {
        String headerName = enu.nextElement();
        String headerValue = request.getHeader(headerName);
        out.print("<b>"+headerName + "</b>: ");
        out.println(headerValue + "<br>");
      }
      
      }
}
