package CORE_JAVA.Association_Aggregation_Composition;

class Room {
    String name;

    Room(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Room: " + name);
    }
}

class House {
    String houseName;
    Room room; // Composition: House "has-a" Room

    House(String houseName, String roomName) {
        this.houseName = houseName;
        this.room = new Room(roomName); // House creates Room
    }

    void display() {
        System.out.println("House: " + houseName);
        room.display();
    }
}

public class Composition_Example {
    public static void main(String[] args) {
        House h = new House("My Sweet Home", "Living Room");
        h.display();
    }
}
