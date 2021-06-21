import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SessionServlet", value = "/SessionServlet")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // создаем сессию
        HttpSession session = request.getSession();

        // создаем атрибут сессии - счетчик посещений страницы для каждого клиента
        Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            session.setAttribute("count", 1);
            count = 1;
        } else
            session.setAttribute("count", count + 1);

        // выводим счетчик посещений
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<h1>" + "Your count is " + count + "</h1>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
