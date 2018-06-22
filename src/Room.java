public class Room {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return square == room.square;
    }

    @Override
    public String toString() {
        return "Room{" +
                "square=" + square +
                ", typeRoom=" + typeRoom +
                '}';
    }

    int square;
    TypeRoom typeRoom;

    static enum TypeRoom {
        NURSERY,
        HALL,
        HALLWAY,
        CABINET
    }

    public Room (int square, TypeRoom typeRoom){
        this.square = square;
        this.typeRoom = typeRoom;
    }

    //конструктор копирования
    public Room (Room room){
        this(room.square, room.typeRoom);
    }



}
