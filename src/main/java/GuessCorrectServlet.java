import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="correctServlet", urlPatterns = "/correct")

public class GuessCorrectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = "you guess the correct number, noob.";

        req.setAttribute("message", message);



        req.getRequestDispatcher("/guess-app/view.jsp").forward(req,resp);
    }
}
