package oops;

abstract public class MyClass {

//     complete method.
    public void cal()
    {
        System.out.println("calculating results");
    }

//    abstract method.
    abstract public void LaunchRocket();
}


//abstract class can not be instantiated.

class Start{

    public static void main(String[] args) {

//        MyChild ch1 = new MyChild();
        MyClass ch1 = new MyChild();
        ch1.cal();
        ch1.LaunchRocket();
    }
}