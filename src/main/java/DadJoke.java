import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "DadJokeServlet", urlPatterns = "/dadjoke")
public class DadJoke extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

       String joke = req.getParameter("joke");
       if(joke == null){
           joke = "Hungry";
       }
       out.println("<h1>Hi " + joke + " , I am Dad!</h1>");




    }
}
