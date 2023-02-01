package test;

public class MyClass1 {
    public static void main(String[] args){
        /* calling static Methods */
        MyClass1 myobject = new MyClass1();
        //myobject.MyTest1();
        myobject.MyTest2();
    }

    public void MyTest1() {
        /* Below can be called with static methods from another class  */
//        MyClass.secondary();
//        MyClass.initialize();
    }
    public void MyTest2() {
        /* creating instance since other class methods are not static are not static on other class */
        MyClass myobject1 = new MyClass();
        myobject1.secondary();
        myobject1.initialize();
    }

    public void MyTest3() {
        /* creating instance since other class methods are not static are not static on other class */
//        MyClass myobject1 = new MyClass();
//        myobject1.secondary();
//        myobject1.initialize();
    }
}
