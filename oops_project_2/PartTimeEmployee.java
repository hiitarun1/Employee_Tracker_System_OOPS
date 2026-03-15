package oops_project_2;

public class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlySalary;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlySalary){
        super(name,id);
        this.hourlySalary=hourlySalary;
        this.hoursWorked=hoursWorked;
    }

    @Override
    public double calculateSalary(){
        return hoursWorked*hourlySalary;
    }
}
