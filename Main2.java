package advancejava;

class Shape {
	 // Field for the name of the shape
	 private String name;

	 // Constructor
	 public Shape(String name) {
	     this.name = name;
	 }

	 // Method to display shape details
	 public void displayShape() {
	     System.out.println("Shape: " + name);
	 }
	}

	//Subclass Circle that extends Shape
	class Circle extends Shape {
	 // Field for radius of the circle
	 private double radius;

	 // Constructor
	 public Circle(double radius) {
	     super("Circle"); // Calling the constructor of Shape
	     this.radius = radius;
	 }

	 // Method to calculate area of the circle
	 public double calculateArea() {
	     return Math.PI * radius * radius;
	 }

	 // Method to display circle details
	 @Override
	 public void displayShape() {
	     super.displayShape();  // Calling the displayShape() method from Shape
	     System.out.println("Radius: " + radius);
	     System.out.println("Area: " + calculateArea());
	 }
	}

	//Subclass ColoredCircle that extends Circle
	class ColoredCircle extends Circle {
	 // Field for color of the circle
	 private String color;

	 // Constructor
	 public ColoredCircle(double radius, String color) {
	     super(radius); // Calling the constructor of Circle
	     this.color = color;
	 }

	 // Method to display colored circle details
	 @Override
	 public void displayShape() {
	     super.displayShape();  // Calling the displayShape() method from Circle
	     System.out.println("Color: " + color);
	 }
	}

	public class Main2 {
	    public static void main(String[] args) {
	        // Creating a ColoredCircle object
	        ColoredCircle myCircle = new ColoredCircle(5.0, "Red");

	        // Displaying the details of the colored circle
	        System.out.println("Details of Colored Circle:");
	        myCircle.displayShape();;

	}
	}