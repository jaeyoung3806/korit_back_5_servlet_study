package com.study.servlet_study.filter;

import java.io.IOException;
import java.net.http.HttpResponse;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebFilter("/*")
public class ResponseCharactorEncodingFilter extends HttpFilter implements Filter {

	
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		
		httpServletResponse.setCharacterEncoding("utf-8");
		//전처리 영역
		chain.doFilter(request, response);
		//후처리
//		httpServletResponse.getWriter().println("무조건 후처리함");
		}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
