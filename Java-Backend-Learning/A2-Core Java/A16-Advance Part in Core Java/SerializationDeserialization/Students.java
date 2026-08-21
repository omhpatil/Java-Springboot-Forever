package A09NewThings.SerializationDeserialization;

import java.io.Serializable;

class Students implements Serializable {
    int id;
    String name;

    Students(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

