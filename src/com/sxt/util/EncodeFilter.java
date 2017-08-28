
package com.sxt.util;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class EncodeFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest request2 = (HttpServletRequest)request;
		if("POST".equals(request2.getMethod())){
			request2.setCharacterEncoding("UTF-8");
		}else{
			
			Map map = request.getParameterMap();
			
			Set keySet = map.keySet();
			Iterator it = keySet.iterator();
			while(it.hasNext()){
				Object value = map.get(it.next());
				
				if(value instanceof String[]){
					String[] values = (String[]) value;
					for(int i=0;i<values.length;i++){
						values[i] = new String(values[i].getBytes("ISO-8859-1"),"utf-8");
					}
				}else if(value instanceof String){
					String strValue = (String) value;
					strValue = new String(strValue.getBytes("ISO-8859-1"),"utf-8");
				}
			}
		}
	
		response.setCharacterEncoding("UTF-8");
		
		chain.doFilter(request2, response);
	}

	
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
