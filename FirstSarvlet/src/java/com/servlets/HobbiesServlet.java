
package com.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HobbiesServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String[] hobbies = request.getParameterValues("hobbies");
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Selected Hobbies</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Selected Hobbies</h1>");
		
		if (hobbies != null && hobbies.length > 0) {
			out.println("<ul>");
			
			for (String hobby : hobbies) {
				out.println("<li>" + hobby + ": " + getHobbyDetails(hobby) + "</li>");
			}
			
			out.println("</ul>");
		} else {
			out.println("<p>No hobbies selected.</p>");
		}
		
		out.println("</body>");
		out.println("</html>");
	}
	
	private String getHobbyDetails(String hobby) {
		// You can replace this with a method that retrieves details about the hobby from a database or other source.
		// For simplicity, we'll just return a hardcoded value here.
		switch (hobby) {
			case "reading":
				return "Reading books is a great way to expand your knowledge and imagination.";
			case "painting":
				return "Painting is a creative and relaxing hobby that can help you express yourself.";
			case "cooking":
				return "Cooking is a fun and rewarding hobby that lets you explore different flavors and cuisines.";
			case "sports":
				return "Sports are a great way to stay fit and healthy while having fun and making friends.";
			default:
				return "";
		}
	}
}
