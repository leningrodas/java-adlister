import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "GuessNumberServlet", urlPatterns = "")
public class GuessNumberServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/guess-app/guess.jsp").forward(req,resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int userNumber = Integer.parseInt(req.getParameter("number"));
        int min = 1;
        int randomNumber = (int)(Math.random() * 3) + min;

        if(userNumber == randomNumber){
            resp.sendRedirect("/correct");
        } else {
            resp.sendRedirect("/incorrect");
        }







    }
}
