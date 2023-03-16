package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Building nettoBuilding = new Building((byte) 1, (byte) 1, true);
        ArrayList<Room> nettosRooms = nettoBuilding.getRooms();
        nettosRooms.add(new Room(2,24,12)); //// Main part
        nettosRooms.add(new Room(3,16,0)); //// storage room
        nettosRooms.add(new Room(1,2,2)); //// break room

        Building cphBuilding = new Building((byte) 3, (byte) 4,true);
    }

    static public int countLambsInBuilding(Building building){
        int output = 0;
        for(Room room: building.getRooms()){
            output += room.getNumberOfLambs();
        }
        return output;
    }

    //// Changed it to me abnormal when there's more floors than rooms.
    //// I must say you consider a building with more floors than rooms normal, is abnormal.
    static boolean isNormal(Building building){
        if(building.getNumberOfFloors() <= building.getRooms().size()){
            return true;
        } else {
            System.out.println("your building is an odd building, by abnormal standards.");
            return false;
        }
    }
}
