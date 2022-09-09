/*
Exercise 9.1 (The Rectangle class):

Following the example of the Circle class in Section 9.2, 
design a class named Rectangle to represent a rectangle. 

The class contains:
■ Two double data fields named width and height that specify the width and 
height of the rectangle. The default values are 1 for both width and height.
■ A no-arg constructor that creates a default rectangle.
■ A constructor that creates a rectangle with the specified width and height.
■ A method named getArea() that returns the area of this rectangle.
■ A method named getPerimeter() that returns the perimeter.

Draw the UML diagram for the class then implement the class. 
Write a test program that creates two Rectangle objects—one with width 4 and height 40, 
and the other with width 3.5 and height 35.9. 

Display the width, height, area, and perimeter of each rectangle in this order.

By: Riyan Rattan

*/


package exercise09_01;
    public class Exercise09_01 {
        public static void main(String[] args) {
        
//Declare the Width and Height for both Rectangle       
    Rectangle num1 = new Rectangle(4.00,40.00);
    Rectangle num2 = new Rectangle(3.50,35.90);


//Differentiate the Area and Perimeter for two Rectangles
System.out.println("\n" + "The area of a rectangle with width 4 and height 40 is " 
        + String.format("%.2f", num1.getArea()));   //Round to two decimal places

System.out.println("The perimeter of this rectangle is "
    + String.format("%.2f", num1.getPerimeter()));

System.out.println("\n" + "The area of a rectangle with width 3.5 and height 35.9 is " 
	+ String.format("%.2f", num2.getArea()));   //Round to two decimal places

System.out.println("The perimeter of this rectangle is "
        + String.format("%.2f", num2.getPerimeter()));
}
}

// Define the Rectangle Class with constructors
class Rectangle {
 public double width;
 public double height;
 public Rectangle() {
}

//Declare how the Width and Height displays
 public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
}

///Return the Area when used above
 public double getArea() {
    return width*height;
}

 ///Return the Perimeter when used above (times 2 because a rectangle has 2 pairs of parallel sides)
 public double getPerimeter() {
    return 2*(width+height);

    }
}