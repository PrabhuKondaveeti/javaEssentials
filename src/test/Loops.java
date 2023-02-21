package test;

public class Loops {
    enum mychar {
        A,
        B
    }

    public static void main(String[] args){
        switchcases();
    }

    public static void switchcases(){
        String str = "c";
        mychar nowChar = mychar.A;
        switch(nowChar){
            case A:
                System.out.println("print something");
                break;
            case B:
                System.out.println("print something else");
                break;
            default:
                System.out.println("Raise any Exception");
        }
    }
}
