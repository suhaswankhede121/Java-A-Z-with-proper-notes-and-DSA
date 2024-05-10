
package com.data;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class fetchdata extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<h1> Registered form details</h1>");
        
        String name=request.getParameter("user_name");
        String pass=request.getParameter("user_password");
        String mail=request.getParameter("user_email");
        String gen=request.getParameter("user_gender");
        String course=request.getParameter("select_course");
        String cod=request.getParameter("condition");
        
        if(cod.equals("checked")){
            out.println("<h2>Name: "+name+"</h2>");
            out.println("<h2>Password: "+pass+"</h2>");
            out.println("<h2>Email: "+mail+"</h2>");
            out.println("<h2>Gender: "+gen+"</h2>");
            out.println("<h2>Course: "+course+"</h2>");
           // out.println("<h2>Name: "+name+"</h2>");
        }else{
            out.println("not match with terms and condition");
        }
    }
}
