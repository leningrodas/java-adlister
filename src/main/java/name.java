import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "nameServlet", urlPatterns = "/count")
public class name extends HttpServlet {
    private int counter = 0;



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");
        counter +=1;
        out.println(counter);
        if(name == null){
            counter += 1;
            out.println(counter);
        } else if (name.equals("reset")){
            counter = 0;
            out.println(counter);
        } else {
            counter +=1;
            out.println(counter);
        }



    }
}
