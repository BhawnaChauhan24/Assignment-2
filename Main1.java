package advancejava;

//Base class
class Employee {
 // Method to be overridden by subclasses
 public String getRole() {
     return "Employee";
 }
}

//Subclass for Manager
class Manager extends Employee {
 // Overriding the getRole method
 @Override
 public String getRole() {
     return "Manager";
 }
}

//Subclass for Developer
class Developer extends Employee {
 // Overriding the getRole method
 @Override
 public String getRole() {
     return "Developer";
 }
}

//Main class to test dynamic method dispatch
public class Main1 {
 public static void main(String[] args) {
     // Creating instances of Manager and Developer
     Employee emp1 = new Manager();
     Employee emp2 = new Developer();

     // Invoking getRole() method
     System.out.println("Role of emp1: " + emp1.getRole()); // Outputs: Manager
     System.out.println("Role of emp2: " + emp2.getRole()); // Outputs: Developer

     // Demonstrating dynamic method dispatch with an array
     Employee[] employees = {new Manager(), new Developer()};

     for (Employee emp : employees) {
         System.out.println("Role: " + emp.getRole());
     }
 }
}
