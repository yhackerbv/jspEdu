package edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContextTest3Servlet
 */
@WebServlet("/context3")
public class ServletContextTest3Servlet extends HttpServlet {

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContextTest3Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		ServletContext sc = this.getServletContext();
		
		ShareObject obj1 = new ShareObject();
		obj1.SetCount(100);
		obj1.SetStr("객체 공유 테스트 - 1");
		sc.setAttribute("data1", obj1);
		
		ShareObject obj2 = new ShareObject();
		obj2.SetCount(200);
		obj2.SetStr("객체 공유 테스트 - 2");
		sc.setAttribute("data2", obj2);
		
		out.print("ServletContext 객체에 데이터 등록을 하였습니다!");
		
		out.close();
	}

	

}
