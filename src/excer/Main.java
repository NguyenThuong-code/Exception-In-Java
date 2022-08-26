package excer;

import excer.IllegalTriangleException;
import excer.TriangleEdgesException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      IllegalTriangleException triangle =new IllegalTriangleException();
        Scanner sc=new Scanner(System.in);
      try {
          System.out.println("Enter number a:");
          int a= sc.nextInt();
          System.out.println("Enter number b: ");
          int b =sc.nextInt();
          System.out.println("Enter number c: ");
          int c= sc.nextInt();
          try {
              triangle.checkTriangle(a,b,c);
          } catch (TriangleEdgesException e) {
              System.out.println(e.getMessage());
          }
      } catch (Exception e) {
          System.out.println("Not triangle!");
      }
    }
}
