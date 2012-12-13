package org.walter.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DefenseReverseRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DefenseReverseRequest() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String refer = request.getHeader("referer");
		if(refer==null||!refer.endsWith(request.getContextPath()+"/index.jsp")) {
			response.sendRedirect(request.getContextPath()+"/index.jsp");
			return;
		}
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter printWriter = response.getWriter();
		printWriter.write("喜剧片《东成西就》");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
