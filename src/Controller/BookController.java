package Controller;

import dbUtils.DBConnection;
import domain.Book;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "BookController")
public class BookController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String table_name = "book";//table name
        Connection con = new DBConnection().getConnection();
        String query = "SELECT * FROM " + table_name;//query
        Book book = new Book(); //new book object
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(query); //excute query

            while (rs.next()) {
                book.setId(rs.getString("id"));
                book.setName(rs.getString("name"));
                book.setAuthor(rs.getString("author"));
                book.setCategory(rs.getString("category"));
                book.getIsbn(rs.getString("isbn"));
                book.getPrice(rs.getString("price"));

            }
        }
        catch(SQLException e){
                e.printStackTrace();
            }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        request.setAttribute("booklist",book);
        RequestDispatcher rd = request.getRequestDispatcher("/booklist.jsp");
        rd.forward(request,response);
    }
}



