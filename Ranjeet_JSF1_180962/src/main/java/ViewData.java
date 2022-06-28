

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewData
 */
@WebServlet("/ViewData")
public class ViewData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    private UserDao userDao;

    public void init() {
    	userDao = new UserDao();
    }

    public ViewData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		  response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        out.print("<body style='background-color:Tomato;'>"); 
	        out.println("<a  href='index.jsp'>Add New User</a>");  
	        out.println("<h1 style='text-align: center;'>User List</h1>");  
	          
	        List<User> list=UserDao.getAllUser();  
	        
	        out.print("<table border='1' width='100%'>");  
	        out.print("<tr><th>Name</th><th>User Name</th><th>Password</th><th>Gender</th><th>Programming Skill</th><th>Contact No</th><th>Email Address</th><th>College Name</th></tr>");  
	        for(User e:list){  
	         out.print("<tr><td>"+e.getName()+"</td><td>"+e.getUsername()+"</td><td>"+e.getPassword()+"</td> <td>"+e.getGender()+"</td><td>"+e.getProgrammingskill()+","+e.getSkills2()+"</td><td>"+e.getContact()+"</td><td>"+e.getEmail()+"</td><td>"+e.getCollege()+"</td></tr>");  
	        }  
	        out.print("</table>");  
	       
	        out.close();  
	    
	        out.print("</body"); 
    }  
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
