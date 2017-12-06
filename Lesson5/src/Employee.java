/**
 * Java1. Home Work 5
 * class Emploee
 *
 * @author Aleksandr Konditerov
 * @version date 05.12.2017
 * @link https://github.com/konditerovAa
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

    Employee() {
        System.out.print("set surname: ");
        this.surname = sc.next();

        System.out.print("set name: ");
        this.name = sc.next();

        System.out.print("set middlename: ");
        this.middle = sc.next();

        while (true) {
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
            if (age >= 14 && age <= 122) {
                this.age = age;
                break;
            }
        }

        while (true) {
            System.out.print("enter phone(8(XXX)XXXXXXX | +7(XXX)XXXXXXX): ");
            String setPhone = sc.next();
            if (Pattern.matches("(.+7|8)([.(]{0,1}?)(\\d{3})([.)]{0,1}?)(\\d{7})", setPhone)) {
                this.phone = setPhone;
                break;
            }
        }

        while (true) {
            System.out.print("enter email: ");
            email = sc.nextLine();
            if (Pattern.matches("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}", email)) {
                this.email = email;
                break;
            }
        }

        System.out.print("set position: ");
        this.position = sc.nextLine();

        System.out.print("set salary: ");
        this.salary = sc.nextInt();
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return "surname : " + surname + " name: " + name + " middlename: " + middle + " age: " + age + " email: " + email + " phone: " + phone + " position: " + position + " salary: " + salary;
    }
}
