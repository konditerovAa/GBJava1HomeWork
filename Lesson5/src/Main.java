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
            System.out.println("set employee № " + (i + 1) + " :");
            employeeList.add(i, new Employee());
        }
        for (Employee i : employeeList){
            if (i.getAge() >= 40)
            System.out.println(i);
        }
    }
}
