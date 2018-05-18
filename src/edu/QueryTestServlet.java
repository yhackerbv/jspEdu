package edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/queryTest")
public class QueryTestServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String id = req.getParameter("id");
		String[] hobbies = req.getParameterValues("hobby");
		
		
		resp.setContentType("text/html;charset=UTF-8");
		
		
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Query ���ڿ� �׽�Ʈ</title></head>");
		out.print("<body>");
		out.print("<h1>GET ������� ��û�Ǿ����ϴ�.</h1>");
		out.print("ID : " + id + "<br/>");
		for(int i = 0; i < hobbies.length; i++) {
			out.print(hobbies[i] + " ");
		}
		out.print("<br/>");
		out.println("</body></html>");
		out.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Query ���ڿ� �׽�Ʈ</title></head>");
		out.print("<body>");
		out.print("<h1> POST ������� ��û�Ǿ����ϴ�.</h1>");
		out.println("</body></html>");
		out.close();
	}
	
}
