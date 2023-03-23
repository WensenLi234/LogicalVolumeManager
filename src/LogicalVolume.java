public class LogicalVolume extends Drive{
    private VolumeGroup group;

    public LogicalVolume(String name, double space, VolumeGroup group) {
        super(name, space);
        this.group = group;
    }

    public VolumeGroup getGroup() {
        return group;
    }
}
