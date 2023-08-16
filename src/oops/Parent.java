package oops;


class A
{
}

class B extends A
{
}
public class Parent
{
    //overridden method.
    // public void m1 (){
    //  System.out.println("i am m1() of parent");
    //    }

    public A m1 (){
        System.out.println("i am m1() of parent");
        return new A();
    }
}

//public > protected > default > private.

class Child extends Parent {
    //overriding method.
//    public void m1 (){
//        System.out.println("i am m1() of Child");
//    }

    public B m1 (){
        System.out.println("i am m1() of Child");
        return new B();
    }
}
