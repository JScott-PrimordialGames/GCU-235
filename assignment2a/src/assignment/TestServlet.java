package assignment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Init Running");
		
		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy Running");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet Running");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String destination = "";
		
		// Get Parameters From The Request
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
 
        if(firstname == null || lastname == null) {
            // The Request Parameters Were Not Present In The Query String. Do Something Or Exception Handling !!
        	destination = "TestError.jsp";
        } else if ("".equals(firstname) || "".equals(lastname)) {
            // The Request Parameters Were Present In The Query String But Has No Value. Do Something Or  Exception Handling !!
        	destination = "TestError.jsp";
        } else {
        	System.out.println("Firstname: " + firstname + "\nLastname: " + lastname);
        	destination = "TestResponse.jsp";
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
        requestDispatcher.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("firstname"));
		System.out.println(request.getParameter("lastname"));
		doGet(request, response);
	}

}
