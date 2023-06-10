package Model;

public class Employee {
    private int employee_id;
    private String employees_first_name;
    private String addres;

    public Employee(int employee_id, String employees_first_name, String addres) {
        this.employee_id = employee_id;
        this.employees_first_name = employees_first_name;
        this.addres = addres;
    }
    // getter

    public int getEmployee_id() {
        return employee_id;
    }

    public String getEmployees_first_name() {
        return employees_first_name;
    }

    public String getAddres() {
        return addres;
    }
    // setter

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public void setEmployees_first_name(String employees_first_name) {
        this.employees_first_name = employees_first_name;

    }

    public void setAddres(String addres) {
        this.addres = addres;
    }
}
