package du.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import du.db.MemberDAO;
import du.db.MemberDTO;

@WebServlet("/")
public class DuController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DuController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String view = null;
		// 주소 가져오기
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		System.out.println(uri);
		System.out.println(conPath);
		System.out.println(com);
		
		if(com.equals("/")) {
			view = "main.jsp";
			
		} else if (com.equals("/loginForm")) {
			view = "/sign-in/loginForm.jsp";
			
		} else if (com.equals("/login")) {
			request.setCharacterEncoding("utf-8");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			System.out.println(email + ", " + password);
			MemberDTO dto = new MemberDTO(0, "", email, password, "");
			MemberDAO dao = new MemberDAO();
			int login = dao.isMember(dto);
			if (login == 1) {
				System.out.println("성공");
				dto = dao.findMember(dto);
				System.out.println(dto);
				HttpSession session = request.getSession();	// 세션 객체 가져오기
				session.setAttribute("customInfo", dto);	// 세션에 값 담기
				request.setAttribute("userLoggedIn", true);
			
			}
			view = "main.jsp";
		} 
		
		// view에 담긴 문자열에 따라 리다이렉트 또는 포워드
		if(view.startsWith("redirect:")) {
			response.sendRedirect(view.substring(9));
		} else {
			request.getRequestDispatcher(view).forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}