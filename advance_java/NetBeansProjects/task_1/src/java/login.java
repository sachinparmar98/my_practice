
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
//import javax.servlet.http.Cookie;

public class login extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
PrintWriter out=response.getWriter();
String s1=request.getParameter("u1");
String s2=request.getParameter("u2");
 out.println("<html>");
 out.println("<body>");
 try
 {
     Class.forName("com.mysql.cj.jdbc.Driver");    
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagment?useSSL=false","root","root");
 Statement st=con.createStatement();
 String q="select * from regis where UID='"+s1+"' AND UPASS='"+s2+"' ";
 ResultSet rs=st.executeQuery(q);
 if(rs.next())
 {
//     Cookie ck=new Cookie("cookiename",s1);
//      ck.setMaxAge(60);
//      response.addCookie(ck);
  HttpSession session= request.getSession();
     session.setAttribute("uname",s1);
     
     response.sendRedirect("MenuDemo1");
 }
 else
 {
 out.println("invalid id and password");
 }

 con.close();
 
 }
 catch(Exception e)
 {
 }
 out.println("</body>");
 out.println("</html>");
}
}