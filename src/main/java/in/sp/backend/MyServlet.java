package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//super.doGet(request, response);
		// Backend Code
		System.out.println("I am DoGet() Method");
		
		}
}
