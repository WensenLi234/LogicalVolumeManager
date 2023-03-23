import java.util.UUID;

public class Volume {
    private String name;
    private UUID uuid;

    public Volume(String name) {
        this.name = name;
        uuid = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public UUID getUuid() {
        return uuid;
    }
}
