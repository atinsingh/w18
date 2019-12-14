public class Candian implements Human {
    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public String speak() {
        return "Blah Blah";
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }

    @Override
    public double getWeight() {
        return 20;
    }
}
