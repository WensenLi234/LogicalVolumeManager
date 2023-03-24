import java.util.ArrayList;

public class VolumeGroup extends Volume{
    private ArrayList<PhysicalVolume> physicalArr;
    private ArrayList<LogicalVolume> logicalArr;

    public VolumeGroup(String name) {
        super(name);
        physicalArr = new ArrayList<PhysicalVolume>();
        logicalArr = new ArrayList<LogicalVolume>();
    }

    public double getTotalSpace() {
        int sum = 0;
        for(PhysicalVolume volume : physicalArr) {
            sum += volume.getDrive().getSpace();
        }
        return sum;
    }

    public double getLogicalSpace() {
        int sum = 0;
        for(LogicalVolume volume : logicalArr) {
            sum += volume.getSpace();
        }
        return sum;
    }

    public void addPhysicalVolume(PhysicalVolume volume) {
        physicalArr.add(volume);
    }

    public void addPhysicalVolume(PhysicalVolume volume, int index) {
        physicalArr.add(index, volume);
    }

    /*
        Precondition: getTotalSpace() - getLogicalSpace() is greater than or equal to volume.getSpace()
    */
    public void addLogicalVolume(LogicalVolume volume) {
        logicalArr.add(volume);
    }
    /*
        Precondition: getTotalSpace() - getLogicalSpace() is greater than or equal to volume.getSpace()
    */
    public void addLogicalVolume(LogicalVolume volume, int index) {
        logicalArr.add(index, volume);
    }

    public void removeLogicalVolume(int index) {
        logicalArr.remove(index);
    }

    public ArrayList<PhysicalVolume> getPhysicalArr() {
        return physicalArr;
    }

    public ArrayList<LogicalVolume> getLogicalArr() {
        return logicalArr;
    }
}
