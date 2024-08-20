import IDoor.IDoor;
import IDoor.DoorFactory;

public class Main {
    public static void main(String[] args) {
        IDoor door = DoorFactory.getDoor(1);
        System.out.println(door.doorName());
        door = DoorFactory.getDoor(2);
        System.out.println(door.doorName());
        door = DoorFactory.getDoor(3);
        System.out.println(door.doorName());
    }
}