import java.sql.Connection;
import java.sql.SQLException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws SQLException {

        CustomerDAO customerDAO = new CustomerDAOImplementation();
        /* ID is 0 -> Id provided by the database (auto-increment) */
        Customer customer = new Customer(0,865432,"Cherry","Berries");
        int affectedRows = customerDAO.insert(customer);
        /* Returns x record inserted into our database into the customer table*/
        System.out.println(affectedRows);

    }
}