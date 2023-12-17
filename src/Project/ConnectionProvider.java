
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author cragl
 */
public class ConnectionProvider {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Исправьте имя класса здесь
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "qweqwe123");
            return con;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

