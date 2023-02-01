package test;

import java.util.Locale;

public class MyClass {
    //fields - parameters - variables - int,float,double,boolean,String
    //constructors
    //methods
     int i = 39;
     String str = "Cool";
     String str1 = "COOL";
     static int j;
     int k;
     int m=10;
     final int r = 6;
     public MyClass (){
        k=9;
        m=11;
     }
     //One more constructor.
    public MyClass (int m){
        this.m=m;
        /* one m is class leve variable and other one is method level variable and how to differentiate them
         by using this keyword.
    */
    }
    public static void main(String[] args){
        /* Below line will give error because our main method is static and our variable is non-static and if we want to access static variables
        * we should create instance of that class (object) - Java allocates any memory to the class and it allocates memory only when we create instance of the class (object)  */
         //System.out.println(myClass.i);
      MyClass myClass = new MyClass(8); // Overloading concept (where we here we have control of altering the value)
      myClass.initialize();
      System.out.println(myClass.i);
      System.out.println(myClass.j);
      System.out.println(myClass.k); /* whenever we create an instance of the class, it executes the constructor
      and even if we don't create constructor, java will use default constructor but it will be empty*/
        System.out.println(myClass.m);
        System.out.println(myClass.r);
        System.out.println(EnumConstants.SUNDAY);
        System.out.println(MyConstants.LONG_WAIT);
        //Return Statements : printing the return values.
        System.out.println(myClass.returningValues());
        //Return Statements : Printing the Instance of the Class
        System.out.println(myClass.returningInstanceOfClass().i);
        //Printing the String
        System.out.println(myClass.returningInstanceOfClass().str);
        myClass.Strings();
    }

    public void initialize(){
         j=5;
         System.out.println(j);
    }
    public void Strings(){
         //Concatenation
         str = str.concat("!!");
         //UpperCase
         str = str.toUpperCase(Locale.forLanguageTag(str));
         //Substrings
         str = str.substring(2,5);
         System.out.println(str);
         //Boolean conditions
         boolean flag = str.equalsIgnoreCase(str1);
         System.out.println(flag);
         //Type Conversions : string to integer
         String str3 = "5";
         int a = Integer.parseInt(str3);
         System.out.println(a);
        //Type Conversions : Integer to String
         int b=6;
         str = String.valueOf(b);
        System.out.println(b);
    }

    public void secondary(){
         System.out.println("I am in class1");
    }

    //Returning the Values from the method
    public int returningValues(){
        i = 1126;
        return i;
    }

    //Returning the instance of the clas
    public MyClass returningInstanceOfClass(){
        return this;
    }


    public void finale(){
       // r=5;
        /* java: cannot assign a value to final variable r and so this line is commented and we can define CONSTANTS using
        * ENUMS */
    }

}
