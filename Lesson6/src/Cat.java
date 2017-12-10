public class Cat extends Animal {

    Cat(String name){
        super(name);
    }

    @Override
    public boolean run(int distance) {
        return distance <= 200 ? true : false;
    }

    @Override
    public boolean swim(int distance) {
        return false;
    }

    @Override
    public boolean jump(double height) {
        return height <= 2 ? true : false;
    }
}
