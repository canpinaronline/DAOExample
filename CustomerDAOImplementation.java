import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CustomerDAOImplementation implements CustomerDAO{
    @Override
    public Customer get(int id) throws SQLException {
        Connection con = Database.getConnection();
        Customer customer = null;
        String preparedSQL = "SELECT id, customer_id, first_name, last_name FROM customer WHERE id=?";
        PreparedStatement ps = con.prepareStatement(preparedSQL);
        ps.setInt(1,id);

        ResultSet rs = ps.executeQuery();

        /* If we have record in DB*/
        if(rs.next()) {
            int dbId = rs.getInt("id");
            int customerId = rs.getInt("customer_id");
            String customerName = rs.getString("first_name");
            String customerLastname = rs.getString("last_name");

            /* Init values to customer object and return it.*/
            customer = new Customer(dbId,customerId,customerName,customerLastname);
        }
        return customer;
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
        Connection con = Database.getConnection();
        String preparedSQL = "INSERT INTO customer (customer_id, first_name, last_name) VALUES(?,?,?)";

        PreparedStatement ps = con.prepareStatement(preparedSQL);
        ps.setInt(1,customer.getCustomerId());
        ps.setString(2,customer.getFirstName());
        ps.setString(3,customer.getLastName());

        /* Returns: x rows affected. x is number of records that were affected.*/
        int result = ps.executeUpdate();

        Database.closePreparedStatement(ps);
        Database.closeConnection(con);
        return result;
    }

    @Override
    public int update(Customer customer) throws SQLException {
        Connection con = Database.getConnection();

        String preparedSQL = "UPDATE customer SET customer_id = ?, first_name = ?, last_name = ? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(preparedSQL);

        ps.setInt(1,customer.getCustomerId());
        ps.setString(2,customer.getFirstName());
        ps.setString(3,customer.getLastName());
        ps.setInt(4,customer.getId());

        int result = ps.executeUpdate();

        Database.closePreparedStatement(ps);
        Database.closeConnection(con);

        return result;
    }

    @Override
    public int delete(Customer customer) {
        return 0;
    }
}
