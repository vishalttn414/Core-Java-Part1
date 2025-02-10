// QUES: Explain the difference between method overloading and method overriding in Java.
// Provide code examples to illustrate both concepts.

// ANS: This is an example of method Overloading ,where both are function are same in name
// and no,and type of arguments.
// function is resolved at runtime.
// Also called as runtime polymorphisms or late binding or dynamic binding.
// Two class are required to implement it.
// Child class inherits parent class.

class Overrideex{
    // Parent method
    void show() {
        System.out.println("Parent class method is called");
    }
}

class Child extends Overrideex{

    @Override
    void show() {
        System.out.println("Child class method is called");
    }

    public static void main(String[] args) {
        Overrideex obj1 = new Overrideex();
        obj1.show();

        Overrideex obj2 = new Child();
        obj2.show();
    }
}

