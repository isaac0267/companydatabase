package CompanyExersiceOne;

import java.sql.*;

public class PriceController {
    public final String database_url = "jdbc:mysql://localhost:3306/company";
    public Connection connection;

    public void viewPriceTable() {
        try {
            connection = DriverManager.getConnection(database_url, "root", "sesame80");
            Statement st = connection.createStatement();
            String sql = "SELECT* FROM price";
            ResultSet rs = st.executeQuery(sql);

            if (st != null) {
                while (rs.next()) {
                    System.out.println("Price ID: " + rs.getString("price_id") + " " +
                            "Product Name: " + rs.getString("proudct_name") + " " +
                            "Price: " + rs.getString("price") + " " +
                            " employee_id: " + rs.getString("employee_id"));

                }
            }
            st.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());

        }
    }
}
