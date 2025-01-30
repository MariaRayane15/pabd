/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maria.rayane;

import java.sql.*;

/**
 *
 * @author 20221074010071
 */
public class MariaRayane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        Customer c = new Customer(1, "Dimitri", "Toistoy", "Dmitri@aplle.com", 10, 1);
        
        customerDAO dao = new CustomerDAO();
        
        dao.insertCustomer(c);
        dao.updateCustomer(615);
        dao.deleteCustomer(612);
        dao.showCustomers();
            
      

    }

}
