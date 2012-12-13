package org.walter.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DataReqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DataReqServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		response.setContentType("application/json");
//		response.setContentType("text/xml");
		writer.write("[{name:'Jack'},{name:'Mary'}]");
		byte[] buf = new byte[1024];
		FileInputStream in = new FileInputStream(new File(DataReqServlet.class.getResource("").toString().substring(6)+"../data/data.xml"));
		int length = 0;
		StringBuilder builder = new StringBuilder();
		while((length=in.read(buf))!=-1) {
			builder.append(new String(buf));
		}
//		writer.write(builder.toString());
		writer.flush();
	}

}
