package CORE_JAVA.Static_Keyword;

class Student {
    static String college = "ABC College"; // shared by all students
    String name;
    Student(String name) {
        this.name = name;
    }
}
class Static_Example {
    public static void main(String[] args) {
        Student s1 = new Student("Raj");
        Student s2 = new Student("Anita");
        System.out.println(s1.college); // ABC College
        System.out.println(s2.college); // ABC College
    }
}
