package db;

import java.sql.*;
import java.util.Scanner;

public class Users {
    public static void main(String[] args) {

        String dbURL = "jdbc:mysql://localhost:3306/java31";
        String username = "root";
        String password = "AaaBbbCcc";
        Scanner scanner = new Scanner(System.in);
        char again = 'y';


        try (Connection con = DriverManager.getConnection(dbURL,username,password)){
            System.out.println("Connected to db");

            while(again == 'y'){
                System.out.println("Choose one option (r, i, d): ");
                System.out.println("r - reading data");
                System.out.println("i - inserting data");
                System.out.println("d - delete data");

                char action = scanner.next().charAt(0);

                if (action == 'r'){
                    readData(con);
                } else if (action == 'i'){
                    System.out.println("Enter username: ");
                    String newUsername = scanner.next() + scanner.nextLine();
                    System.out.println("Enter password: ");
                    String newPassword = scanner.nextLine();
                    System.out.println("Enter full name: ");
                    String newFullName = scanner.nextLine();
                    System.out.println("Enter email: ");
                    String newEmail = scanner.nextLine();
                    insertData(con, newUsername, newPassword, newFullName, newEmail);
                } else if (action == 'd') {
                    System.out.println("Enter username: ");
                    String delUsername = scanner.next() + scanner.nextLine();
                    deleteData(con,delUsername);
                }

                System.out.println("Do you want to do something more y/n?");
                again = scanner.next().charAt(0);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    public static void readData (Connection conn) throws SQLException {
        String sql = "SELECT * FROM users;";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        int count = 0;

        while(resultSet.next()){

            String username = resultSet.getString(2);
            String password = resultSet.getString(3);
            String fullName = resultSet.getString("fullname");
            String email = resultSet.getString("email");

            String output = "User #%d: %s   -   %s    -    %s    -    %s ";
            System.out.println(String.format(output,++count,username,password,fullName,email));
        }
    }

    public static void insertData (Connection conn, String username, String password, String fullname, String email) throws SQLException{

        String sql = "INSERT INTO users (username, password, fullname, email) VALUE (?,?,?,?)";

        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1,username);
        preparedStatement.setString(2,password);
        preparedStatement.setString(3, fullname);
        preparedStatement.setString(4, email);

        int rowsInserted = preparedStatement.executeUpdate();

        if (rowsInserted>0){
            System.out.println("A new user was inserted successfully");
        } else {
            System.out.println("Something went wrong");
        }
    }

    public static void deleteData (Connection conn, String username) throws SQLException{

        String sql = "DELETE FROM users WHERE username = ?";

        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1,username);

        int rowsInserted = preparedStatement.executeUpdate();

        if (rowsInserted>0){
            System.out.println("User was deleted successfully");
        } else {
            System.out.println("Something went wrong");
        }
    }
}

