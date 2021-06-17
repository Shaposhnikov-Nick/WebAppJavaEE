import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet", value = "/FirstServlet")
public class FirstServlet extends HttpServlet {
    private String message = "Hello from my first servlet!";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // параметры get-запроса
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        // записываем то, что будет в ответе на запрос
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>" + "Hello " + name + " " + surname + "</h1>");
        out.println("<h1>" + "Enter in the get-request next parameters: name & surname" + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
