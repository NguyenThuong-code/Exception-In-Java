package practice;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter x: ");
        int x= sc.nextInt();
        System.out.println("Enter Y: ");
        int y = sc.nextInt();
        NumberFormatException num= new NumberFormatException();
        num.calculate(x,y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x+y;
            int b= x-y;
            int c= x*y;
             int d = x/y;
            System.out.println("Sum x+y= " + a);
            System.out.println("Hieu x-y = "+ b);
            System.out.println(" Multiple x* y= " +c);
            System.out.println("Divide x/y = "+ d);
        }catch (Exception e){
//            e.printStackTrace();
            System.err.println("Exception: "+e.getMessage());
        }
    }
}
