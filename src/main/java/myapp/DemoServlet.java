/*
*
*Author: Parag Sanyashiv
*
*/
package myapp;

import java.io.IOException;
import java.io.*; 
import java.util.*; 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import javax.servlet.http.*;

public class DemoServlet extends HttpServlet {
  @Override
  public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
    PrintWriter out = resp.getWriter(  );  
    resp.setContentType("text/html");
    //resp.getWriter().println("{ \"name\": \"World\" }");
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String num1=req.getParameter("num1");
    String num2=req.getParameter("num2");
    String result;
    double number1, number2;
    number1 = Double.parseDouble(num1);
    number2 = Double.parseDouble(num2);
    double res;
    String act=req.getParameter("act"); 
    if(act.equals("+"))
    {
    	 res = number1+number2;
    	 result=Double.toString(res);
    	// resp.getWriter().println("\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t"+result);
    	 out.println("<br><br><h1> Result: "+result+"</h1>");
    	 req.getRequestDispatcher("index.html").forward(req, resp);
    	 
    	 
    	// rs.forward(req, resp);
    }
    else if(act.equals("-"))
    {
    	 res = number1-number2;
    	 result=Double.toString(res);
    	 out.println("<br><br><h1> Result: "+result+"</h1>");
    	 req.getRequestDispatcher("index.html").forward(req, resp);
    }
    else if(act.equals("/"))
    {
    	 res = number1/number2;
    	 result=Double.toString(res);
    	 out.println("<br><br><h1> Result: "+result+"</h1>");
    	 req.getRequestDispatcher("index.html").forward(req, resp);
    }
    else if(act.equals("*"))
    {
    	 res = number1*number2;
    	 result=Double.toString(res);
    	 out.println("<br><br><h1> Result: "+result+"</h1>");
    	 req.getRequestDispatcher("index.html").forward(req, resp);
    }
    else
    {
    	if(num1=="" || num2=="" || (num1=="" && num2== ""))
    	out.println("<br><br><h1>Invalid Input. Empty Input not allowed</h1>");
    	 req.getRequestDispatcher("index.html").forward(req, resp);
    	
    }
  }
}
