package DataAccessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    public static void main(String[] args) {

        //example string, proper string will be added when database is finalised
        String connectionUrl = "jdbc:sqlserver://yourserver.database.windows.net:1433;" + "database=AdventureWorks;"
                + "user=yourusername@yourserver;" + "password=yourpassword;" + "encrypt=true;"
                + "trustServerCertificate=false;" + "loginTimeout=30;";

        try (Connection connection = DriverManager.getConnection(connectionUrl)) {

        } catch (SQLException e) {
            e.printStackTrace();
        }

        
    //the following will be methods that receive values from tables or deletes them
    // It should be noted that this is a proof of concept with placeholder values and future additions to this file will be me moving these
    // pieces of code into appropriate methods after finalization of classes and the Database. - Albert 27/02/2021

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
                Statement statement = connection.createStatement();) {

            // Create and execute a SELECT SQL statement from specified table

            String selectSql = "SELECT Title, FirstName, LastName from DB.Table";
            resultSet = statement.executeQuery(selectSql);

            // Print results from select statement
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
            }
        }
        catch (SQLException e) {
            System.out.println("An SQL error occured");
            e.printStackTrace();
        }
    }

    
}
