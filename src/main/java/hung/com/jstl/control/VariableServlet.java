package hung.com.jstl.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hung.com.jstl.dao.PersonDao;

/**
 * Servlet implementation class PersonsSevlet
 */
@WebServlet(urlPatterns = { "/variable"})
public class VariableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public VariableServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("*********** jstl: variable");
		//add Model to request
		request.setAttribute("author", PersonDao.getAuthor());
		
		//call view
		request.getRequestDispatcher("/jsp/variable.jsp").forward(request, response);
	}

}
