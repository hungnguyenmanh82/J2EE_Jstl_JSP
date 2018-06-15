package hung.com.jstl.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hung.com.jstl.dao.PersonDao;
import hung.com.jstl.model.Salary;

/**
 * Servlet implementation class PersonsSevlet
 */
@WebServlet(urlPatterns = { "/if"})
public class IfServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public IfServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("*********** jstl: if");
		//add Model to request
		request.setAttribute("salary", new Salary(100, 10));
		
		//call view
		request.getRequestDispatcher("/jsp/if.jsp").forward(request, response);
	}

}
