package excer;

public class IllegalTriangleException {
    public void checkTriangle(int a, int b, int c)throws TriangleEdgesException {
        if (a+b<= c||a+c<=b||b+c<=a||a<0||b<0||c<0){
            throw new TriangleEdgesException("Error: Triangle not illegal!");
        }else{
            System.out.println("Triangle are legal");
        }
    }
}
