package edu;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet Filter implementation class FlowFilterTwo
 */
@WebFilter(
		filterName = "flow2",
		urlPatterns = "/*",
		initParams = {@WebInitParam(name = "en", value = "UTF-8"),
						@WebInitParam(name = "kor", value = "zxcvxzcv")
		}
		
)
public class FlowFilterTwo implements Filter {

	String charset;
	public void destroy() {
		// TODO Auto-generated method stub
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding(charset);
		response.setContentType("text/html;charset=UTF-8");
		
		System.out.println("doFilter 호출 전... two");
		chain.doFilter(request, response);
		System.out.println("doFilter 호출 후... two");
		
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		charset = fConfig.getInitParameter("en");
		
	}

}
