package advancejava;

class Vehicle {
	 // Method to start the vehicle
	 public void start() {
	     System.out.println("Vehicle is starting...");
	 }

	 // Method to stop the vehicle
	 public void stop() {
	     System.out.println("Vehicle is stopping...");
	 }
	}

	//Subclass Car that overrides start() and stop()
	class Car extends Vehicle {
	 @Override
	 public void start() {
	     System.out.println("Car is starting with ignition...");
	 }

	 @Override
	 public void stop() {
	     System.out.println("Car is stopping with brakes...");
	 }
	}

	//Subclass Bike that overrides start() and stop()
	class Bike extends Vehicle {
	 @Override
	 public void start() {
	     System.out.println("Bike is starting with kick or button...");
	 }

	 @Override
	 public void stop() {
	     System.out.println("Bike is stopping with hand brakes...");
	 }
	}

	public class VehicleHierarchy {
		 public static void main(String[] args) {
		        // Creating a Car object
		        Vehicle myCar = new Car();
		        System.out.println("Car actions:");
		        myCar.start();  // Calls Car's start method
		        myCar.stop();   // Calls Car's stop method

		        // Creating a Bike object
		        Vehicle myBike = new Bike();
		        System.out.println("\nBike actions:");
		        myBike.start();  // Calls Bike's start method
		        myBike.stop();;   // Calls Bike's stop method
		
		 }
	}