package service;

import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
public class BookService {
   public boolean saveBook book){
    String query ="INSERT INTO" +table_name+" (name, author, category, isbn, price, purchased_date) VALUES(?,?,?,?,?);
            PreparedStatement pst =null;
    try{
        pst = connection.prepareStatement(query);
        pst.setString(1, book.getName());
        pst.setString(2, book.getAuthor());
        pst.setString(3, book.getCategory());
        pst.setString(4, book.getIsbn());
        pst.setString(5, Double.parseDouble(book.getPrice()));
        pst.setString(6, book.getPurchased_date());
        return pst.excuteUpdate()!=0;
    }catch(SQLException e){
        e.printStackTrace();
    }
    System.out.println("query=" +query);
    return false;

    }
}
*/
