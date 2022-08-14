import java.util.ArrayList;
import java.util.List;

class EmployeeNotFoundException extends Exception{
    public EmployeeNotFoundException(String m){
        System.out.println(m);
    }
}

public class EmplyeeData {
    public static void main(String[] args) {
        List<String> employeeNames = new ArrayList<>(List.of("Naveen","venkat","Madan","Bachu","Sai"));
        try{
            wheatherEmployeeExist("Durga",employeeNames);
        } catch (EmployeeNotFoundException e){}


    }
    static void wheatherEmployeeExist(String name , List<String> arr) throws EmployeeNotFoundException {
        if (!arr.contains(name)){
            throw new EmployeeNotFoundException("Employee not found");
        } else {
            System.out.println("Employee found");
        }
    }
}
