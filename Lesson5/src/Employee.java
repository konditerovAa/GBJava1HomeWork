/**
 *
 * Java1. Home Work 5
 * class Emploee
 * @author Aleksandr Konditerov
 * @version date 05.12.2017
 * @link https://github.com/konditerovAa
 *
 */
import java.util.Scanner;
import java.util.regex.Pattern;

public class Employee {

    Scanner sc = new Scanner((System.in));
    private String name;
    private String surname;
    private String middle;
    private String email;
    private String phone;
    private String position;
    private int age;
    private int salary;

    Employee(){
        this.surname = "Konditerov";
        this.name = "Aleksandr";
        this.middle = "Andreevich";
        this.age = 26;
        this.email = "konditerov.a.a@gmail.com";
        this.phone = "+79032748021";
        this.salary = 109750;
        this.position = "chief specialist";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public void setEmail() {
        while (true){
            System.out.print("enter email: ");
            email = sc.nextLine();
            if(Pattern.matches("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}", email)){
                this.email = email;
                break;
            }
        }
    }

    public void setPhone() {
        while (true){
            System.out.print("enter phone(8(XXX)XXXXXXX | +7(XXX)XXXXXXX): ");
            String setPhone = sc.next();
            if(Pattern.matches("(.+7|8)?(.()?(\\d{3})(.))?(\\d{7})" , setPhone)) {
                this.phone = setPhone;
                break;
            }
        }
    }

    public void setPosition() {
        System.out.print("set position: ");
        this.position = sc.next();
    }

    public void setAge() {
        while (true){
            System.out.print("set age: ");
            this.age = sc.nextInt();
            /**
             *
             * Минимальный возраст для заключения трудового договора – 14 лет.
             * @link https://working-papers.ru/so-skolki-let-mozhno-rabotat
             *
             * Рекорд долгожительства принадлежит француженке Жанне Кальман, она прожила 122 года.
             * @link www.nat-geo.ru/fact/35786-rekord-dolgozhitelstva/
             *
             */
            if (age >= 14 && age <= 122){
                this.age = age;
                break;
            }
        }
    }

    public void setSalary() {
        System.out.print("set salary: ");
        this.salary = sc.nextInt();
    }

}
