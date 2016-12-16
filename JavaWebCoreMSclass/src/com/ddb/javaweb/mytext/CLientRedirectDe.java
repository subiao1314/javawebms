package com.ddb.javaweb.mytext;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CLientRedirectDe
 */
@WebServlet("/CLientRedirectDe")
public class CLientRedirectDe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CLientRedirectDe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("location", "hefei");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session=request.getSession();
		session.setAttribute("name", "subiao");
		ServletContext context=getServletConfig().getServletContext();
		context.setAttribute("age", "24");
	//	response.sendRedirect("/JavaWebCoreMSclass/JavaWebCore1/servlet/get_info.jsp");
		//写死的路径！！不包含（/WebContent）这一层路径 相当于-Java Resources这一层路径也是不用包含的！！
		response.sendRedirect(request.getContextPath()+"/JavaWebCore1/servlet/get_info.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
