package DataAccessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
    }
}
