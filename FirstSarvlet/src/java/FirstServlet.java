import java.io.IOException;
import javax.servlet.*;

public abstract class FirstServlet implements Servlet{
    
    //Life cycle methods
    ServletConfig conf;
    public void init(ServletConfig conf){
        this.conf=conf;
        System.out.println("Here is init method...");
    }
    
    public void service(ServletRequest rqt, ServletResponse resp)throws ServletException, IOException{
        System.out.println("Here is Serveices...");
    }
    
    public void distroy(){
        System.out.println("Here is destroyed");
        
    }
    
    // Non life cycle methods
    
    public ServletConfig getServletConfig(){
        return this.conf;
    }
    
    public String getServletInfo(){
        return "Here is return server";
    }

}

