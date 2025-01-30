/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maria.rayane;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author 20221074010071
 */
public class CustomerDAO {
    
    private Connection con;
    
    public CustomerDAO() throws SQLException {
        this.con = new ConnectionFactory() .getConnection();
        System.out.println("Connection OK!");
    }
    
    public void insertCustomer(Customer c) throws SQLException{
        String sql = "insert into customer"
                    + "(store_id, first_name, last_name, email, address_id, active)"
                    + "values"
                    + "(?, ?, ?, ?, ?, ?)";
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setInt(1, c.getStore_id());
            pst.setString(2, c.getFirst_name());
            pst.setString(3, c.getLast_name());
            pst.setString(4, c.getEmail());
            pst.setInt(5, c.getAddress_id());
            pst.setInt(6, c.getActive());
            
            pst.execute();
            pst.close();
            System.out.println("Customer ADDED!");
            
    }
    
    public void deleteCustomer(int id) throws SQLException{
        String sql = "delete from customer"
                    + "where customer_id=?"
                
                 try{
                    preparedStatement stmt = connection.preparedStatement(sql);
                    stmt.getString(2, new date(c.getStore_id()));
                    stmt.getString(2, c.getEmail());
                    stmt.getString(5, new date(c.getAddress_id()));
                    stmt.getString(4, c.getActive());
                    stmt.getExecute();
                    stmt.getClose();
                  }catch (SQLException e) {
                    throw new RuntimeException(e) {
                  }
                  }
                    
    }
    
    public void updateCustomer(int id) throws SQLException{
         String sql = "update customer"
                 + "set store_id=?, first_name=?, last_name=?, email=?, address_id=?, active=?"
                 + "where customer_id=?"
    }
    
    public void showCustomers () throws SQLException {
        Statement st = con.createStatement();

            String query = "select * from customer"
                    + " order by customer_id desc"
                    + " limit 5";

            ResultSet rs = st.executeQuery(query);

            ResultSetMetaData md = rs.getMetaData();

            int col = md.getColumnCount();
            
            System.out.println("Tabela: "+md.getTableName(1));

            for (int i = 1; i <= col; i++) {
                System.out.print(md.getColumnName(i) + "\t");
            }
            System.out.println("");
            
            while (rs.next()) {
                for (int i = 1; i <= col; i++) {
                    System.out.print(rs.getString(i)+"\t");
                }
                System.out.println("");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        } finally {
            con.close();
        }
    }
    
}
