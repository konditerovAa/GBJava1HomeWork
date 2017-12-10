public class Dog extends Animal {
    String colur;

    Dog(String name, String colur) {
        super(name);
        this.colur = colur;
    }

    @Override
    public boolean run(int distance) {
        return distance <= 500 ? true : false;
    }

    @Override
    public boolean swim(int distance) {
        return distance <= 10 ? true : false;
    }

    @Override
    public boolean jump(double height) {
        return height <= 0.5 ? true : false;
    }
}
