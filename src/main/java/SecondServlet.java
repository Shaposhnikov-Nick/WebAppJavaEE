import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SecondServlet", value = "/SecondServlet")
public class SecondServlet extends HttpServlet {
    private String message = "Hello from my second servlet!";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // устанавливаем тип возвращаемых данных
        response.setContentType("text/html");

        String id = request.getParameter("id");

        if (id == null){
            response.sendRedirect("https://www.google.com");
        } else {

            // записываем то, что будет в ответе на запрос
            PrintWriter out = response.getWriter();

            out.println("<html><body>");
            out.println("<h1>" + message + "</h1>");
            out.println("<h1>" + "id " + id + "</h1>");
            out.println("</body></html>");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
