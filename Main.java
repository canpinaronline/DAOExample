import java.sql.Connection;
import java.sql.SQLException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws SQLException {

       CustomerDAO customerDAO = new CustomerDAOImplementation();
       Customer customer = new Customer(1,167347,"Test username", "Cuz");
       customerDAO.update(customer);

       System.out.println(customer);

    }
}