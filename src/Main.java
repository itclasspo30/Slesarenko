public class Main {

    public static void main(String[] args) {
        Room room_1 = new Room(350, Room.TypeRoom.HALL);
        Room room_2 = new Room(110, Room.TypeRoom.CABINET);
        Room room_3 = new Room(340, Room.TypeRoom.NURSERY);

        if (room_1.equals(room_3))
            System.out.println("Первая комната равна третьей");
        else
            System.out.println("Комнаты не равны");

        Room newRoom = new Room(room_3);

        System.out.println("New Room is "+newRoom.toString());
    }
}
