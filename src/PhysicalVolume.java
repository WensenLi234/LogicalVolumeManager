public class PhysicalVolume extends Volume{
    private Drive drive;

    public PhysicalVolume(String name, Drive drive) {
        super(name);
        this.drive = drive;
    }

    public Drive getDrive() {
        return drive;
    }
}
