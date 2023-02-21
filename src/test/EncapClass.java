package test;

public class EncapClass {

    public static void main(String[] args){
        MyPrivateClass myPrivateClass = new MyPrivateClass();
        //myPrivateClass.setStr("hola!!"); // Unable to use because we use setstr
        System.out.println( myPrivateClass.getStr());
    }
}
