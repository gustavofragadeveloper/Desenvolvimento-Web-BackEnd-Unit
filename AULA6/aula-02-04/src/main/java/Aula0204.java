

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Aula0204
 */
public class Aula0204 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Aula0204() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");
		String [] comidasFavoritas = request.getParameterValues("comidasFavoritas");
		
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1> Nome recebido: " + nome + "</h1>");
		out.println("<h4> Idade recebida: " + idade + "</h4>");
		for (int x=0;x< comidasFavoritas.length; x++) {
			out.println("<p> Comida que gosta: " + comidasFavoritas[x] + "</p>");
		}
		
		out.println("</body>");
		out.println("</html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
