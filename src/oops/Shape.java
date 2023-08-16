package oops;

public interface Shape {

    public static final int i = 19;   // ( public static final ) is attached with all variable used in this.

    public abstract void calculateArea(int r);
}

class Circle implements Shape {

    public void calculateArea(int r){
        System.out.println("Area of Circle is "+ (Math.PI*r*r));
    }

    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.calculateArea(2);
    }
}

