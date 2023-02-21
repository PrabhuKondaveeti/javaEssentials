package test;

public class Abstractpk {
    public static void main(String[] args){
        Circle circle = new Circle("Red",5.0);
        System.out.println(circle.info());

        Square square = new Square("blue", 10.0);
        System.out.println(square.info());
    }
}
