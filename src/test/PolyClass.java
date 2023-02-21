package test;

public class PolyClass {
    public static void main(String[] args){
        Employee e = new FullTime();
        System.out.println("Full time employee salary is:"+ e.salary());
         e = new Contractor();
        System.out.println("Full time employee salary is:"+ e.salary());
        System.out.println(Employee.designation());
        System.out.println(FullTime.designation());
        System.out.println(Contractor.designation());

        MyOverloading myOverloading = new MyOverloading();
        myOverloading.myMethod(5);
        myOverloading.myMethod("hello");
        myOverloading.myMethod("hello",5);
    }
}
