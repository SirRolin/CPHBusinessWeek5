package Task3;

import java.util.ArrayList;

public class Building {
    private final ArrayList<Room> rooms;
    private final byte numberOfBathrooms;
    private final byte numberOfFloors;

    private final boolean isOfficeBuilding;

    public Building(byte bathrooms, byte floors, boolean isOffice){
        rooms = new ArrayList<Room>();
        this.numberOfBathrooms = bathrooms;
//        for(byte i = 0; i < bathrooms; ++i){
//            rooms.add(new Room(1, 1, 1));
//        }
        this.numberOfFloors = floors;
//        for(byte i = 0; i < bathrooms; ++i){
//            rooms.add(new Room(4, 2, 8));
//        }
        this.isOfficeBuilding = isOffice;
    }
    public Building(int bathrooms, int floors, boolean isOffice) {
        this((byte) bathrooms, (byte) floors, isOffice);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public byte getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public byte getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}
