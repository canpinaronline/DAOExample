import java.sql.Connection;
import java.sql.SQLException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws SQLException {

        Connection con = Database.getConnection();

        if(con != null) {
            System.out.println("Success");
        }

    }
}