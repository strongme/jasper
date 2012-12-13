package org.walter.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CookieCounter() {
        super();
    }

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		boolean cookieFound = false;
		Cookie cookieNow = null;
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				cookieNow = cookies[i];
				if (cookieNow.getName().equals("CookieCount")) {
					cookieFound = true;
					break;
				}
			}
		}

		if (!cookieFound) {
			cookieNow = new Cookie("CookieCount", "1");
			cookieNow.setMaxAge(10);
			response.addCookie(cookieNow);
		}
		out.write("<h1 align='center'>欢迎来到Walter的家</h1>");

		if (cookieFound) {
			int cookieCount = Integer.parseInt(cookieNow.getValue());
			cookieCount++;
			cookieNow.setValue(String.valueOf(cookieCount));
			cookieNow.setMaxAge(10);
			response.addCookie(cookieNow);
			out.println("这是您在近" + 10
					* (Integer.parseInt((cookieNow.getValue())) - 1) + "秒钟内第 "
					+ cookieNow.getValue() + " 次光临寒舍！");
		} else {
			out.println("您至少已经10秒钟没有光临寒舍了！");
		}
		out.println("");
	}
		
		
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
