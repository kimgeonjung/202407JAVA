package du;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SumServelt")
public class SumServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SumServelt() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>1~10까지 합</title>");
		out.println("</head>");
		out.println("<body>");
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			out.println("<h2>" + sum + "</h2>");
			sum += i;
		}

		out.println("1 ~ 10까지 합은");
		out.println(sum);
		out.println("</body>");
		out.println("</html>");
	}
}
