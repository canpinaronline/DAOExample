import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

      try {
            CustomerDAO customerDAO = new CustomerDAOImplementation();

            Customer customer = customerDAO.get(1);
            int result = customerDAO.delete(customer);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }




    }
}
