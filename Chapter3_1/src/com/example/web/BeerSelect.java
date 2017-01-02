package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class BeerSelect extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
	IOException {
		// from ServletRequest getParameter to get form parameter what you chose
		// remeber always parameter get String value:
		String param_color = request.getParameter("color");
        String param_body = request.getParameter("body");
        String result = "";
        // you can even get array values:
        String[] paramValues_size = request.getParameterValues("sizes");
        if (paramValues_size == null) {
            result = "no information";
            paramValues_size = new String[]{result};
        } else {
            result = request.getParameterValues("sizes")[0];
        }
        // BeerExpert beerExpert = new BeerExpert();
        //List list = beerExpert.getBrands(string, string2);
        //String string4 = beerExpert.getOneSize(string3);
        //List list2 = beerExpert.getAllSize(arrstring);
        //httpServletRequest.setAttribute("styles", (Object)list);
       // httpServletRequest.setAttribute("test_one", (Object)string4);
        //httpServletRequest.setAttribute("test_all", (Object)list2);
       // RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("result.jsp");
        //requestDispatcher.forward((ServletRequest)httpServletRequest, (ServletResponse)httpServletResponse);
	}
}
