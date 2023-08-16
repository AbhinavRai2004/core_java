package poly;


//compile time polymorphism.
public class Student {

    public void read(){
        System.out.println("reading xyz book");
    }

    public void read(String bookName){
        System.out.println("Reading " + bookName + " book");
    }
}
