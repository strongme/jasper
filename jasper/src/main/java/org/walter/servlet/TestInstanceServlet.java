package org.walter.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class TestInstanceServlet
 */
public class TestInstanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestInstanceServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("**************构造函数初始实例化Servlet*********************");
    }
    
    @Override
    public void init() throws ServletException {
    	super.init();
    	System.out.println("---------------------Init 出师实例化Servlet---------------");
    	
    }
    
    @Override
    public void service(ServletRequest arg0, ServletResponse arg1)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	super.service(arg0, arg1);
    	PrintWriter printWriter = arg1.getWriter();
    	printWriter.write("Hello World ");
    	printWriter.flush();
    }
    
    
    @Override
    public void destroy() {
    	// TODO Auto-generated method stub
    	super.destroy();
    	System.out.println("容器销毁Servlet");
    	
    }

}
