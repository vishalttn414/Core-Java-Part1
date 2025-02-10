// QUES: Explain the difference between method overloading and method overriding in
//Java. Provide code examples to illustrate both concepts.

// ANS:This is an example of method overloading in java, all the three method have the same
// function name i.e function but they differ in no of arguments or type of arguments.
// so the function called is determined by no of arguments at compile time only.Resolved
// at compile time.
// Also called compile time polymorphism ,early binding or static binding.
// Only one class is required to implement this.
// NO Inheritance is needed.

import java.util.Scanner;
class Overloadingex {
    static void function(int a,int b){
        System.out.println("sum is "+ a+b);
    }
    static void function( int a){
        System.out.println("entered no is "+ a);
    }
    static void function(int a,int b,int c){
        System.out.println("multiplication is " + a*b*c);
    }

    public static void main(String args[]){
        System.out.println("Please enter three numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        function(a);
        function(a,b);
        function(a,b,c);

    }
}

