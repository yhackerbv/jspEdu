package edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/headerInfo")
public class HeaderInfoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<head><title>Request ���� ��� Servlet </title></head>");
		out.print("<body>");
		out.print("<h3>��û ��İ� �������� ����</h3>");
		Enumeration<String> em = req.getHeaderNames();
		
		while(em.hasMoreElements())
		{
			String s = em.nextElement();
			out.println(s + " : " + req.getHeader(s) + "<br/>");
		}

		out.print("</body></html>");
		out.close();
	}
}
