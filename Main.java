package advancejava;

//Base class
class Animal {
 // Method to be overridden by subclasses
 public void makeSound() {
     System.out.println("Animal makes a sound");
 }
}

//Subclass for Dog
class Dog extends Animal {
 // Overriding the makeSound method
 @Override
 public void makeSound() {
     System.out.println("Dog barks: Woof!");
 }
}

//Subclass for Cat
class Cat extends Animal {
 // Overriding the makeSound method
 @Override
 public void makeSound() {
     System.out.println("Cat meows: Meow!");
 }
}

//Main class to test the inheritance and method overriding
public class Main {
 public static void main(String[] args) {
     // Create instances of Dog and Cat
     Animal myDog = new Dog();
     Animal myCat = new Cat();

     // Call makeSound on each instance
     myDog.makeSound(); // Outputs: Dog barks: Woof!
     myCat.makeSound(); // Outputs: Cat meows: Meow!
 }
}
