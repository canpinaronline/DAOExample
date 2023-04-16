import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws SQLException {

      List<Customer> customers;
      CustomerDAO customerDAO = new CustomerDAOImplementation();
      customers = customerDAO.getAll();

      for(Customer customer : customers) {
          System.out.println(customer);
      }



    }
}