import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name ="pickColorServlet", urlPatterns = "/pick-color")
public class pickColorServlet extends HttpServlet {
<<<<<<< HEAD
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/color-app/pick-color.jsp").forward(req,resp);
    }
=======


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    req.getRequestDispatcher("/color-app/pick-color.jsp").forward(req,resp);

    }


>>>>>>> daf2fb25b505df48ac22f1deb1ca387aad89251b
}
