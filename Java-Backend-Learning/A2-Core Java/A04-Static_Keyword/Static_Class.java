package CORE_JAVA.Static_Keyword;

class Outer {
    static class Inner {
        void show() {
            System.out.println("Inside static nested class");
        }
    }
}

class Static_Class {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.show();
    }
}
