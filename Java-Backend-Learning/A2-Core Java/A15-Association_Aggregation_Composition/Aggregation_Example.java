package CORE_JAVA.Association_Aggregation_Composition;

class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Teacher: " + name);
    }
}

class Department {
    String deptName;
    Teacher teacher; // Aggregation

    Department(String deptName, Teacher teacher) {
        this.deptName = deptName;
        this.teacher = teacher;
    }

    void display() {
        System.out.println("Department: " + deptName);
        teacher.display();
    }
}

public class Aggregation_Example {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Om"); // Teacher exists independently
        Department d = new Department("Computer Science", t);
        d.display();
    }
}
