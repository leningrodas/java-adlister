import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name="viewColorServlet", urlPatterns = "/viewcolor")
public class viewColorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String color = req.getParameter("color");

        req.setAttribute("color", color);
        req.getRequestDispatcher("/color-app/viewcolor.jsp").forward(req,resp);



    }
}
