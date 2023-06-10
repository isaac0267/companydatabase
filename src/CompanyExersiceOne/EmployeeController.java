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

public class EmployeeController {

    public final String database_url="jdbc:mysql://localhost:3306/company";
    public Connection connection;

    public void viewAllEmployees() {
        try {
            connection = DriverManager.getConnection(database_url, "root", "sesame80");
            Statement st = connection.createStatement();
            String sql = "SELECT* FROM employee";
            ResultSet rs = st.executeQuery(sql);
            if (sql != null) {
                while (rs.next()) {
                    System.out.println("Employee_id:"+" "+ rs.getString("employee_id")+
                            " "+"Employees First name: "+" "+ rs.getString("employees_first_name")+
                            "  "+"Employees Address: "+" "+ rs.getString("addres"));
                }
            }
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("SQLException:"+e.getMessage());
        }
    }
}
