package CompanyExersiceOne;

import Model.Department;

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

public class DepartmentController {

    // Here we make the attribut for making the link to the database.

    public final String database_url = "jdbc:mysql://localhost:3306/company";

    // Import the Connection class. That will make the connection between the sql and java.
    public Connection connection;

    // make the method that will print the whole list of the employees.

    public void viewDepartment() {
        try {
            connection = DriverManager.getConnection(database_url, "root", "sesame80");
            Statement st = connection.createStatement();  // This code will make the connection.
            String sql = "SELECT* FROM department";
            ResultSet resultSet = st.executeQuery(sql);

            if (st != null) {
                while (resultSet.next()) {
                    System.out.println("Department ID: " + resultSet.getString("department_id") +
                            " Department name: " + resultSet.getString("department_name") +
                            " Manager ID:" + resultSet.getString("manager_id"));

                }
            }

            st.close(); // close the statement
            connection.close(); // close the connection.

        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
    }

}
