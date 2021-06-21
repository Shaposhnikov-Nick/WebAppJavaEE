package CookiesServlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class DeleteCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // удаляем куки методом их перезаписывания на другие куки со временем действия 0
        Cookie cookie = new Cookie("some_id", "");
        cookie.setMaxAge(0);
        response.addCookie(cookie);

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<h1>" + "Cookie удалены" + "</h1>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
