package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestingDBConnection {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java31", "root", "AaaBbbCcc");
            Statement stmt = con.createStatement(); //creating a statement
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            System.out.println(rs);

            while (rs.next()){
                System.out.printf("UserID: %d, username: %s, password %s, full name: %s, email: %s\n",
                        rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5) );
            }
        } catch(Exception e){
            System.out.println(e);
        }

    }
}

