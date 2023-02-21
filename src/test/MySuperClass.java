package test;

public class MySuperClass {
    String superStr = "Superstring";
    String commonstring = "Superstring";
    public void superClassMethod() {
        System.out.println("My Super method");
    }
    public String stringmethod(){
        return superStr;
    }

    public MySuperClass(String superStr){
        System.out.println("My SuperClass method");
    }

    public void commonmethod(){
        System.out.println("Superclass method");
    }
}
