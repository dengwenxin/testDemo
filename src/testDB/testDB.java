package testDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testDB {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("驱动加载成功");
            
            String url = "jdbc:mysql://localhost:3306/testdb";
            String user = "root";
            String pwd = "";
            conn = DriverManager.getConnection(url, user, pwd);
            stmt = conn.createStatement();
            
            String sql = "Select * from country";
            
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                System.out.println("name: " + rs.getString("name"));
            }
            
        } catch (ClassNotFoundException e) {
            System.out.println("驱动加载失败");
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            } 
            
            if (stmt != null) {
                stmt.close();
            }
            
            if (rs != null) {
                rs.close();
            }
        }
        
    }
}
