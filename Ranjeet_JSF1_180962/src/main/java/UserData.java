

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class UserData
 */
@WebServlet("/UserData")
public class UserData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		try {
			  
            // Initialize the database
            Connection con = DbConnection.initializeDatabase();
  
            // Create a SQL query to insert data into demo table
            // demo table consists of two columns, so two '?' is used
            PreparedStatement st = (PreparedStatement) con
                   .prepareStatement("insert into userdetail values( ?,?,?,?,?,?,?,?,?,?,?,?)");
  
            // For the first parameter,
            // get the data using request object
            // sets the data to st pointer
           // st.setInt(1, Integer.valueOf(request.getParameter("id")));
  
            // Same for second parameter
            st.setString(1, request.getParameter(""));
            st.setString(2, request.getParameter("name"));
            st.setString(3, request.getParameter("username"));
            st.setString(4, request.getParameter("password"));
            st.setString(5, request.getParameter("gender"));
            st.setString(6, request.getParameter("skills"));
            st.setString(7, request.getParameter("contact"));
            st.setString(8, request.getParameter("email"));
            st.setString(9, request.getParameter("college"));
            st.setString(10, request.getParameter("skills2"));
            st.setString(11, request.getParameter("skills3"));
            st.setString(12, request.getParameter("skills4"));
  
            // Execute the insert command using executeUpdate()
            // to make changes in database
            st.executeUpdate();
  
            // Close all the connections
            st.close();
            con.close();
            response.sendRedirect("./ViewData");
            // Get a writer pointer 
            // to display the successful result
//            PrintWriter out = response.getWriter();
//            out.println("<html><body><b>Successfully Inserted"
//                        + "</b></body></html>");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}
	

}
