package org.walter.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Submit
 */
public class Submit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Submit() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		request.setCharacterEncoding("UTF-8");
		String code = request.getParameter("code");
		String realCode = (String) session.getAttribute("code");
		String tips = null;
		System.out.println("code now :"+code);
		System.out.println("real code :"+realCode);
		
		if(code.equals(realCode)) {
			tips = "验证成功";
		}else {
			tips = "验证失败";
		}
		request.setAttribute("tips",tips);
		request.getRequestDispatcher("/result.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
