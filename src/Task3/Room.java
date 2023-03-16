package Task3;

public class Room {
    private byte numberOfDoors;
    private byte numberOfLambs;

    private byte numberOfWindows;
    public Room(byte doors, byte lambs, byte windows){
        this.numberOfDoors = doors;
        this.numberOfLambs = (byte) lambs;
        this.numberOfWindows = (byte)windows;
    }
    //// I must say, the fact that they haven't bothered making a byte literal signature is frustrating.
    public Room(int doors, int lambs, int windows) {
        this((byte) doors, (byte) lambs, (byte) windows);
    }

    public byte getNumberOfDoors() {
        return numberOfDoors;
    }

    public byte getNumberOfLambs() {
        return numberOfLambs;
    }

    public byte getNumberOfWindows() {
        return numberOfWindows;
    }
}
