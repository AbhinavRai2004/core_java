package oops;

class Student
{

//      data : data members : instance variable.

         int studentId;
         String studentName;
         String studentCity;

//         constructor
         public Student()
         {
             System.out.println("creating object: non- p");
         }

         public Student(int st)
         {
             System.out.println("parameterized constructor : (int)");
         }

         public Student(int i,String n,String c){
             studentId = i;
             studentName = n;
             studentCity = c;
         }

//         Behaviour : member methods : methods (functions).

            public void study(){
                System.out.println(studentName + " is studying");
            }

            public void study(float r){

            }

            public void showFullDetails(){
                System.out.println("My name is " + studentName);
                System.out.println("My id is "+ studentId);
                System.out.println("Mu city is " + studentCity);

            }
}
