package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.example.model.BeerExpert;
import java.util.*;

public class BeerSelect extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// from ServletRequest getParameter to get form parameter what you chose
		// remeber always parameter get String value:
		String param_color = request.getParameter("color");
		String param_body = request.getParameter("body");
		String one_size = "";
		// you can even get array values:
		String[] paramValues_size = request.getParameterValues("sizes");
		if (paramValues_size == null) {
			one_size = "no information";
			paramValues_size = new String[] { one_size };
		} else {
			one_size = request.getParameterValues("sizes")[0];
		}
		// created model object, which can help do business logic
		BeerExpert model = new BeerExpert();
		
		// using form send information we pass this details to model method
		// which return suggested brand_list of beers:
		List brand_list = model.getBrands(param_color, param_body);
		
		// using same variable because we one same thing one_size, but now 
		// we using model class to getOneSize() :
	    one_size = model.getOneSize(one_size);
	    
	    // get from array paramValues_size , full list of String with count number
	    //again using model class logic:
		 List all_size_list = model.getAllSize(paramValues_size);
		 
		// using ServletRequest interface method setAttribute() we set attribute 
		// on request scope:
		request.setAttribute("styles", brand_list);
		request.setAttribute("test_one", one_size);
		request.setAttribute("test_all",all_size_list );
		
		// ServletRequest interface has method getRquestDispatcher() to get this object
		// then you can use method which can forward request and response to another
		// servlet(jsp) to print view
		 RequestDispatcher requestDispatcher =
		 request.getRequestDispatcher("result.jsp");
		 
		 requestDispatcher.forward(request,response);
	}
}
