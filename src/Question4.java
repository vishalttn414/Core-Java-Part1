// Ques: Create an interface Shape with a method draw(). Implement this interface
// in two classes, Circle and Rectangle, each providing its own implementation of the
// draw() method. Demonstrate polymorphism by calling the draw() method on instances of
// both classes.

interface Shape{
    void draw();
}
 class Circle implements Shape{
     public void draw(){
         System.out.println("Circle class is implementing Shape interface");
     }
 }
 class Rectangle implements Shape{
    public void draw(){
        System.out.println("Rectangle class is implementing Shape interface");
    }
 }
 public class Question4{
    public static void main(String args[]){
        Shape circle=new Circle();
        circle.draw();
        Shape rectangle=new Rectangle();
        rectangle.draw();
    }
 }
