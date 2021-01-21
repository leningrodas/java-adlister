import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "viewPizzaOrder", urlPatterns = "/vieworder")
public class viewPizzaOrder extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       String crust = req.getParameter("crust");

       String size = req.getParameter("size");

       String toppings = req.getParameter("toppings");

       String customer = req.getParameter("customer");

        req.setAttribute("crust", crust);

       req.getRequestDispatcher("/pizza-app/vieworder.jsp").forward(req,resp);

        System.out.println("crust" + crust);
        System.out.println("size" + size);
        System.out.println("toppings" + toppings);
        System.out.println("customer" + customer);

    }
}
