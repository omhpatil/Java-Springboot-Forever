package CORE_JAVA.Association_Aggregation_Composition;

class Library{
    String name;

    Library(String name){
        this.name=name;
    }
}

class Student{
    String stud_name;
    Library library;

    Student(String stud_name, Library library){
        this.stud_name = stud_name;
        this.library = library;
    }

    void Display(){
        System.out.println("Name: "+ stud_name+", Library name: "+library.name);
    }
}

public class Association_Example {
    public static void main(String[] args) {
        Library l = new Library("Central Library");
        Student s = new Student("Om", l);

        s.Display();
    }
}
