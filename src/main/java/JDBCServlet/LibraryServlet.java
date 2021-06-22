package JDBCServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "LibraryServlet", value = "/LibraryServlet")
public class LibraryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        PrintWriter out = response.getWriter();

        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java_ee_db",
                "postgres", "QWErty1234")) {
            if (connection == null)
                out.println("Not success connection to DB\n");
            else
                out.println("Success connection to DB");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from books");

            while (resultSet.next()) {

                out.printf("ID %d title %s author %s quantity %d\n",
                        resultSet.getInt("id"),
                        resultSet.getString("title"),
                        resultSet.getString("author"),
                        resultSet.getInt("quantity"));
            }

            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
