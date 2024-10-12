package ejemplos.servlet.curso;

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

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");

		// send HTML page to client

		out.println("<h2 > Servlet2 </h2 >");
		out.println("");
		out.println("<html>");
		out.println("<head><title>Ejemplo HTML desde Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>Bienvenido/a!! </h1>" + fname + " " + lname);
	}

}
