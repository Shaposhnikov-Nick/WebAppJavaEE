import logic.Shop;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ShopServlet", value = "/ShopServlet")
public class ShopServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // создаем сессию
        HttpSession session = request.getSession();

        // указываем параметр в get-запросе
        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        // создаем объект класса магазин
        Shop shop = (Shop) session.getAttribute("shop");

        // если объект еще не создан, записываем в его поля
        // значения из get-запроса
        if (shop == null) {
            shop = new Shop();
            shop.setName(name);
            shop.setQuantity(quantity);
        }

        // создаем атрибут сессии
        session.setAttribute("shop", shop);

        // создаем перенаправление на страницу, в которой
        // покажем содержимое корзины
        getServletContext().getRequestDispatcher("/ShopJSP.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
