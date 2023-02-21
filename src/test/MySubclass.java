package test;

public class MySubclass extends MySuperClass {

    String commonstring = "SubString";

    public static void main(String[] args){
        MySubclass subClass = new MySubclass();
        subClass.superClassMethod();
        System.out.println(subClass.superStr);
    }

    public MySubclass(){
        super("hello");
        System.out.println("My Subclass method");
    }
    //Super is used when both subclass and superclass has same variable names
    public void commonString(){
        System.out.println(commonstring);
        System.out.println(super.commonstring);
    }

    public void commonmethod(){
        System.out.println("subclass method");
    }
    public void allmethods(){
        commonmethod();
        super.commonmethod();
    }
}
