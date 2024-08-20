package IDoor;

public class DoorFactory {
    public static IDoor getDoor(int doorId) {
        return switch (doorId) {
            case 1 -> new FlushDoor();
            case 2 -> new SheeshamDoor();
            default -> new NullDoor();
        };
    }
}
