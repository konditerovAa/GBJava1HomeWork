import java.util.ArrayList;

/**
 *
 * Java1. Home Work 5
 * class Main
 * @author Aleksandr Konditerov
 * @version date 05.12.2017
 * @link https://github.com/konditerovAa
 *
 */


public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        for (int i = 0; i < 5; i++){
            System.out.println("set params for emoloyee " + i + 1 + ": ");
            employeeList.add(i, new Employee());
            employeeList.get(i).setSurname("Konditerova");
            employeeList.get(i).setName("Kira");
            employeeList.get(i).setMiddle("Andreyvna");
            employeeList.get(i).setAge();
            employeeList.get(i).setPhone();
            employeeList.get(i).setSalary();
            employeeList.get(i).setPosition();
        }
        System.out.println(employeeList.get(0).toString());
    }
}
