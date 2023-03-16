package Task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task3RoomTest {
    @Test
    void testIsNormal(){
        Building testingbuilding = new Building(1,1,false);
        Assertions.assertFalse(Main.isNormal(testingbuilding));
        testingbuilding.getRooms().add(new Room(1,1,1));
        Assertions.assertTrue(Main.isNormal(testingbuilding));
    }

    @Test
    void testCountLambs(){
        Building testingbuilding = new Building(1,1,false);
        testingbuilding.getRooms().add(new Room(1,1,1));
        testingbuilding.getRooms().add(new Room(1,3,1));
        Assertions.assertEquals(Main.countLambsInBuilding(testingbuilding), 4);
    }
}