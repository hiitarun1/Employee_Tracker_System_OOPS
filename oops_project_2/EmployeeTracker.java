package oops_project_2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTracker {
    private List<Employee> empliList;

    public EmployeeTracker(){
        empliList=new ArrayList<>();
    }

    public void addEmployee(Employee emp){
        empliList.add(emp);
    }

    public void removeEmployee(int id){
        Employee temp=null;
        for(Employee em : empliList){
            if(em.getId()==id){
                temp=em;
                break;
            }
        }
        if(temp!=null){
            empliList.remove(temp);
        }
    }
    
    public void displayEmployee(){
        for(Employee em : empliList){
            System.out.println(em);
        }
    }

}
