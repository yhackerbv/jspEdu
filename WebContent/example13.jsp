<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>pageContext</title>
</head>
<body>
	<%! public void work(String p, PageContext pc)
	{
		try{
			JspWriter out = pc.getOut();
			if(p.equals("include")){
				out.print("-- include �� -- <br>");
				pc.include("test.jsp");
				out.print("<br>");
				out.print("-- include �� -- <br>");
				
			} else if(p.equals("forward"))
			{
				pc.forward("test.jsp");
				
			}
			
		}
		catch(Exception e){
			System.out.println("���� �߻�!!");
			
		}
	
	
	}%>
	
	<%
		String p = request.getParameter("p");
		this.work(p, pageContext);
	%>

</body>
</html>