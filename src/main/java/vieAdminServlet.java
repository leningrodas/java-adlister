import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = "vieAdminServlet", urlPatterns = "/admin")
public class vieAdminServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        boolean isAdmin = (boolean) session.getAttribute("isAdmin");
        if(isAdmin == false){
            resp.sendRedirect("/profile");
            return;
        }

        req.getRequestDispatcher("/admin.jsp").forward(req, resp);





    }
}
