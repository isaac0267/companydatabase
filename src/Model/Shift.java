package Model;

public class Shift {
    private int shift_id;
    private int employee_id;
    private int department_id;
    private String start_time;
    private String end_time;

    public Shift(int shift_id, int employee_id, int department_id, String start_time, String end_time) {
        this.shift_id = shift_id;
        this.employee_id = employee_id;
        this.department_id = department_id;
        this.start_time = start_time;
        this.end_time = end_time;
    }

    public Shift() {

    }

    // getter
    public int getShift_id() {
        return shift_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public String getStart_time() {
        return start_time;
    }

    public String getEnd_time() {
        return end_time;
    }
    // setter

    public void setShift_id(int shift_id) {
        this.shift_id = shift_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }
}

