package com.api.response.header.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Order(1)
public class RequestResponseFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		log.info("{} doFilter method", RequestResponseFilter.class.getName());

		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		httpServletResponse.setHeader("response-header-2", "response-header-value-2");
		chain.doFilter(request, response);
	}
}