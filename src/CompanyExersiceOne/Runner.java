package CompanyExersiceOne;

public class Runner {
    public static void main(String[] args) throws Exception {
        System.out.println("\n"+"The Department table"+"\n");
        new Runner().runDC();
        System.out.println("\n"+"The Employee table"+"\n");
        new Runner().runED();
        System.out.println("\n"+"The Shift table table"+"\n");
        new Runner().runSHC();
        System.out.println("\n"+"The Price table"+"\n");
        new Runner().runPC();
    }

    // a method for tun the whole Department controller
    public void runDC() {
        DepartmentController DC = new DepartmentController();
        DC.viewDepartment();
    }
    // a method that will run the whole employee controller.

    public void runED() {
        EmployeeController EC = new EmployeeController();
        EC.viewAllEmployees();
    }

    // a method to show the shift list
    public void runSHC() {
        ShiftController SHC = new ShiftController();
        SHC.viewShiftList();
    }

    // a method that will show the whole price list
    public void runPC() {
        PriceController PC = new PriceController();
        PC.viewPriceTable();
    }
}
