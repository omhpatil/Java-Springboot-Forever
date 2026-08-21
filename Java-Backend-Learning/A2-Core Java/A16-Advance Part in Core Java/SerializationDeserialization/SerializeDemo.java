package A09NewThings.SerializationDeserialization;

import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) throws Exception {

        A09NewThings.SerializationDeserialization.Students s = new A09NewThings.SerializationDeserialization.Students(1, "Om");

        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("student.txt"));

        oos.writeObject(s);
        oos.close();

        System.out.println("Object serialized");
    }
}
