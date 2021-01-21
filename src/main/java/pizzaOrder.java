import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "orderPizza", urlPatterns = "/pizza-order")
public class pizzaOrder extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/pizza-app/pizza-order.jsp").forward(req,resp);



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String crust = req.getParameter("crust");
        req.setAttribute("crust", crust);
        String size = req.getParameter("size");
        req.setAttribute("size", size);
        String toppings[] = req.getParameterValues("toppings");
        req.setAttribute("toppings", toppings);
        String address = req.getParameter("address");
        req.setAttribute("address", address);

        for (int i=0; i < toppings.length; i++){
            System.out.println(toppings[i]);
        }


//        enhanced for loop:1
//        for (String topping : toppings) {
//System.out.println(topping);




        System.out.printf("\nYour pizza is a: %s, %s, %s\n",crust, size, Arrays.toString(toppings));


//        System.out.println("crust " + crust);
//        System.out.println("size " + size);
//        System.out.println("toppings " + toppings);
        System.out.println("address " + address);

        req.getRequestDispatcher("/pizza-app/pizza-order.jsp").forward(req,resp);


    }
}
