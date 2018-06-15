package hung.com.jstl.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hung.com.jstl.dao.PersonDao;

/**
 * http://www.apekshit.com/JSTL-Tutorial-for-beginners-with-Example/c/26
 */
@WebServlet(urlPatterns = { "/persons", "/test"})
public class PersonsSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PersonsSevlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("*********** jstl: List");
		//add Model to request
		request.setAttribute("persons", PersonDao.getPersons());
		
		//call view
		request.getRequestDispatcher("/jsp/personList.jsp").forward(request, response);
	}

}
