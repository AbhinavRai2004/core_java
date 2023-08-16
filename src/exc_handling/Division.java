package exc_handling;

import java.util.Scanner;


//how to create custom Exception.

class AgeInvalidException extends Exception{

    AgeInvalidException(){
        super("Age is Invalid !");
    }

    AgeInvalidException(String message){
        super(message);
    }
}


public class Division {
    public static void main(String[] args) {

        System.out.println("Program started...");

        try {
            Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println("We got two input");

            int d = x/y;
            System.out.println("Division = " + d);

            if(y < 10){
                throw new AgeInvalidException("My age is Invalid");
            }
        }
        catch (ArithmeticException e){
            System.out.println("y can not be equal to zero");
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Invalid Input");
            System.out.println(e.getMessage());
        }
        catch (AgeInvalidException e){
            System.out.println("y is invalid");
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Error !!");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I am finally block");
            System.out.println("closing all the resources..");
        }

        System.out.println("Program terminated...");
    }
}


