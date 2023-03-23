public class Drive extends Volume{
    private double space;

    public Drive(String name, double space) {
        super(name);
        this.space = space;
    }

    public double getSpace() {
        return space;
    }
}
