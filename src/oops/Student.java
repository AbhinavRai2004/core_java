package oops;

class Student
{

//      data : data members : instance variable.

         int studentId;
         String studentName;
         String studentCity;

//         Behaviour : member methods : methods (functions).

            public void study(){
                System.out.println(studentName + " is studying");
            }

            public void showFullDetails(){
                System.out.println("My name is " + studentName);
                System.out.println("My id is "+ studentId);
                System.out.println("Mu city is " + studentCity);

            }
}