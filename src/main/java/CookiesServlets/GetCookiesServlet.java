package CookiesServlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class GetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //делаем запрос у клиента, чтобы получить куки
        Cookie[] cookies = request.getCookies();

        //выводим куки
        PrintWriter out = response.getWriter();

        out.println("<html>");
        for (Cookie cookie: cookies) {
            out.println("<h1>" + cookie.getName() + " : " + cookie.getValue() + "</h1>");
        }
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
