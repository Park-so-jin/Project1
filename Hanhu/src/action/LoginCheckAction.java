package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginCheckAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberDao dao = new MemberDao();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(dao.loginCheck(new MemberDto(id,pw,""))) {
			//location.href = "mainpage.jsp"
			HttpSession session = request.getSession();
			session.setAttribute("session", id);
			response.sendRedirect("mainpage.jsp");
		}else {
			response.sendRedirect("signIn.jsp");
		}
		
		
	}

}
