package oops_project_2;

public class Main {
    public static void main(String[] args) {
        EmployeeTracker employeeTracker=new EmployeeTracker();

        FullTimeEmployee empFull=new FullTimeEmployee("Tarun",  1 , 67000.98);

        PartTimeEmployee empPart=new PartTimeEmployee("Mukesh", 2, 67, 566.34);

        employeeTracker.addEmployee(empFull);
        employeeTracker.addEmployee(empPart);

        System.out.println("**** Initial Employee Details ****");
        System.out.println();

        employeeTracker.displayEmployee();

        System.out.println("\nRemoving Employee");
        employeeTracker.removeEmployee(2);

        System.out.println("**** Employee Remaining ****");
        employeeTracker.displayEmployee();
    }
}
