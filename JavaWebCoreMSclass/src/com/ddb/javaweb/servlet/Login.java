package com.ddb.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/servlet/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		 System.out.println("这是servlet Login的 init() 初始化...");
	        System.out.println("load-on-startup 为2");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    	  // response.setContentType("text/html;charset=UTF-8");
    	   PrintWriter out=response.getWriter();
    	   out.println("<html>");//输入相应的hyml源文件
    	   out.println("<head><title>用servlet测试get和post方法</title></head>");
    	   out.println("<h2>调用doGet()方法</h2>");
    	   out.println("<h2>用户输入信息如下：</h2>");
    	   String username=request.getParameter("userName");
    	   if (username==null||username=="") {
    		username="未输入";
    	}
    	   String password=request.getParameter("passWord");
    	   if (password==null||password=="") {
    			password="未输入";
    		}   
    	   out.println("<h2>用户名："+username+"</h2>");
    	   out.println("<h2>密 码："+password+"</h2>");
    	   out.println("</body>");
    	   out.println("</html>");
           out.close();	
    }
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	 
	 // response.setContentType("text/html,charset=UTF-8"); //正常情况下都要给定服务器的返回MIME类型
    	 //设置文档类型及字符集
	 // request.setCharacterEncoding("UTF-8"); //设定服务器响应客户端请求的编码方式
    	//解决中文参数乱码方式一：设定Request对象的字符集
	  response.setCharacterEncoding("UTF-8"); //服务端编码方式
	  
	   PrintWriter out=response.getWriter();
	   out.println("<html>");//输入相应的hyml源文件
	   out.println("<head><title>用servlet测试get和post方法</title></head>");
	   out.println("<h2>调用doGet()方法</h2>");
	   out.println("<h2>用户输入信息如下：</h2>");
	   String username=request.getParameter("userName");
	    username=new String(username.getBytes("ISO8859-1"),"UTF-8");
	   
	   if (username==null||username=="") {
		username="未输入";
	}
	   String password=request.getParameter("passWord");
	   password=new String(password.getBytes("ISO8859-1"),"UTF-8");
	 //解决中文参数乱码方式一：new一个新的字符集
	   if (password==null||password=="") {
			password="未输入";
		}   
	   out.println("<h2>用户名："+username+"</h2>");
	   out.println("<h2>密 码："+password+"</h2>");
	   out.println("</body>");
	   out.println("</html>");
       out.close();	
	//   doGet(request, response);
	
	}
    

}
