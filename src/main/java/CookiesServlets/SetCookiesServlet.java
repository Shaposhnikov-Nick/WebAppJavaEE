package CookiesServlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // создаем куки и указываем их параметр
        Cookie cookie1 = new Cookie("some_id", "123");
        Cookie cookie2 = new Cookie("some_name", "nick");

        // устанавливаем срок жизни куки (в секундах)
        cookie1.setMaxAge(86400);
        cookie2.setMaxAge(86400);

        // передаем созданные куки в ответе
        response.addCookie(cookie1);
        response.addCookie(cookie2);

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<h1>" + "Cookie установлены" + "</h1>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
