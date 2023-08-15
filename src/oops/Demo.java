package oops;

public class Demo {
    public static void main(String[] args){


//          Creating objects of student class.
              Student st1;
              st1 = new Student();
//              new is a keyword used to dynamically allocate memory for class object.
//                                        or
//              new keyword in Java instantiates a class by allocating desired memory for an associated new object.

              st1.studentName = "Abhinav";
              st1.studentCity = "Varanasi";
              st1.studentId = 111;

              st1.study();
              st1.showFullDetails();
    }

}
