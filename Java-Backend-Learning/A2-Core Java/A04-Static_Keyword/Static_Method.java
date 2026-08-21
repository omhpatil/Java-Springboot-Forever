package CORE_JAVA.Static_Keyword;

class MathUtil {
    static int square(int x) {
        return x * x;
    }
}
class Static_Method {
    public static void main(String[] args) {
        System.out.println(MathUtil.square(5)); // 25
    }
}
