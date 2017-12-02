/**
 *
 * Java1. Home Work 1
 * @author Aleksandr Konditerov
 * @version date 02.12.2017
 */

public class HomeWork {

    public static void main(String[] args) {
	    byte abyte = 120;
	    short ashort = 500;
	    int aint = 700;
	    long along = 150L;
	    float afloat = 167.0f;
	    double adouble = 3.1416;
	    boolean aboolean = true;
	    char achar = 'M';

        System.out.println(calc(5,8,43,2));
        System.out.println(check10and20(10,3));
        System.out.println(check10and20(10,11));
        checkPositiv(0);
        checkPositiv(4);
        checkPositiv(-1);
        System.out.println(checkNegativ(-1));
        hiName("Кира");
        checkYear(1600);
        checkYear(2000);
        checkYear(2100);
        checkYear(2200);
        checkYear(2300);
        checkYear(2016);
        checkYear(2020);
    }

    public static int calc(int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    public static boolean check10and20(int a, int b){
        return (a >= 10 && a <= 20) ? true : false;
    }

    public static void checkPositiv(int a){
        System.out.println( a >= 0 ? "Положительное" : "Отрицательное");
    }

    public static boolean checkNegativ(int a){
        return a < 0 ? true : false;
    }

    public static void hiName(String name){
        System.out.println("Привет, " + name + "!");
    }

    public static void checkYear(int year){
        System.out.println((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)  ? "високосный" : "не високосный");
    }
}
