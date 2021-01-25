import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = ( username.equals("admin") || username.equals("user") )  && password.equals("password");

        HttpSession session = request.getSession();

        if (validAttempt && username.equals("admin")) {
//            admin path- the person who is logged in is an admin
            session.setAttribute("isAdmin", true);
            response.sendRedirect("/admin"); // will be linked to a servlet
        } else if (validAttempt && username.equals("user")) {
            // this is the user path - a regula joe smcho login in
            session.setAttribute("isAdmin", false);
            response.sendRedirect("/profile");

        } else {
            response.sendRedirect("/login");
        }
    }
}
