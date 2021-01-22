import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

<<<<<<< HEAD
@WebServlet(name="viewColorServlet", urlPatterns = "/viewcolor")
public class viewColorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String color = req.getParameter("color");
        req.setAttribute("color", color);
        req.getRequestDispatcher("/color-app/viewcolor.jsp").forward(req,resp);
=======

@WebServlet(name="viewColorServlet", urlPatterns = "/viewcolor")
public class viewColorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String color = req.getParameter("color");

        req.setAttribute("color", color);
        req.getRequestDispatcher("/color-app/viewcolor.jsp").forward(req,resp);



>>>>>>> daf2fb25b505df48ac22f1deb1ca387aad89251b
    }
}
