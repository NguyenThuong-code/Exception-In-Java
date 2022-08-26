package practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBounds {
    public Integer[] createRandom(){
        Random rd= new Random();
        Integer[] arr = new Integer[100];
        System.out.println("List of elements in Array: ");
        for (int i=0; i<100; i++){
            arr[i]= rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBounds arrEx= new ArrayIndexOutOfBounds();
        Integer[] arr=arrEx.createRandom();
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter any element: ");
        int num= sc.nextInt();
        try {
            System.out.println("The value of the array having index 5 is"+num+ " is "+arr[num]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Index beyond the bound of array");
        }
    }
}
