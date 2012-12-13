package org.walter.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.walter.pojo.People;

/**
 * Servlet implementation class MyOgnlServlet
 */
public class MyOgnlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyOgnlServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		People people = new People();
		people.setId(1);
		people.setName("Jack");
		people.setAddress("Beijing");
		people.setTelphone("13109908789");
		session.setAttribute("people", people);
		people.setName("Mary");
		request.setAttribute("people", people);
		request.getRequestDispatcher("/test.jsp").forward(request, response);
	}

}
