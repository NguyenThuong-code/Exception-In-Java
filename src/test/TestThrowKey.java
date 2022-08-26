package test;

public class TestThrowKey {
    static void checkAge(int age){
        if (age<18){
            throw new ArithmeticException("Access denied - You must be at least 18");
        }else {
            System.out.println("Access granted - You are enough");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
