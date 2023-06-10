package CompanyExersiceOne;

import java.sql.*;

/**
 * Make a connection to java without using the spring boot.
 * The code display all the data from the department table which is exists in the company database.
 * @author Isaac Levy
 * @program display all the info.
 * Import Connection class, DriverManager, Statement,ResultSet class. for each of them we make an instance.
 * Use the tray and catch
 * use the if and while loop.
 * close the connection.
 */

public class ShiftController {
    public final String database_url="jdbc:mysql://localhost:3306/company";
    public Connection connection;

    public void viewShiftList() {
        try {
            connection = DriverManager.getConnection(database_url, "root", "sesame80");
            Statement st = connection.createStatement();
            String sql = "SELECT* FROM shift";
            ResultSet rs = st.executeQuery(sql);
            if (st != null) {
                while (rs.next()) {
                    System.out.println("Shift ID: " + rs.getString("shift_id")+"" +
                            " Employee ID: " + rs.getString("employee_id") + " " +
                            "Department ID: " + rs.getString("department_id") + " " +
                            ",Start Time: " + rs.getString("start_time") + " " +
                            ",end Time: " + rs.getString("end_time"));
                }
            }
            st.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("SQLException: "+e.getMessage());
        }
    }
}
