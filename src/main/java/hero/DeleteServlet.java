package hero;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class DeleteServlet extends HttpServlet {  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)   
             throws ServletException, IOException {  
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        EmpDao.delete(id);  
        response.sendRedirect("ViewServlet");  
    }  
}