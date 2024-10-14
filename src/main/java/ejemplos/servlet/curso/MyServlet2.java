package ejemplos.servlet.curso;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request,
						 HttpServletResponse response) throws ServletException, IOException {


		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");


		request.setAttribute("fname", fname);
		request.setAttribute("lname", lname);


		RequestDispatcher dispatcher = request.getRequestDispatcher("/bienvenida.jsp");
		dispatcher.forward(request, response);
	}
}
