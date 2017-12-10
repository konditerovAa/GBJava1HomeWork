public class Main {

    public static void main(String[] args) {

    Dog dog1 =  new Dog("Барбос", "черный" );

        System.out.println(dog1.jump(0.3) + " " + dog1.run(15) + " " + dog1.swim(9));
        System.out.println(dog1.jump(10) + " " + dog1.run(1000) + " " + dog1.swim(1000));
    }
}
