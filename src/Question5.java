//Write a Java program that reads an integer from the user and divides 100 by the entered number.
// Implement exception handling to manage scenarios where the user enters zero (which causes a division by
// zero) and when the user inputs a non-integer value.


import java.util.Scanner;
public class Question5 {

    public static void main(String args[]){

        System.out.println("Please Enter a number");

        try{
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int quotient=100/n;
            System.out.println("100/" + n +" is equals " + quotient);
        }
        catch(ArithmeticException e){
            System.out.println("Divison by zero is not Allowed");
        }
        catch(java.util.InputMismatchException e){
            System.out.println("Please enter a valid number");
        }
    }
}
