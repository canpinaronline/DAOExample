import java.sql.SQLException;
import java.util.List;

public class CustomerDAOImplementation implements CustomerDAO{
    @Override
    public Customer get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Customer> getAll() throws SQLException {
        return null;
    }

    @Override
    public int save(Customer customer) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Customer customer) throws SQLException {
        return 0;
    }

    @Override
    public int update(Customer customer) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Customer customer) {
        return 0;
    }
}
