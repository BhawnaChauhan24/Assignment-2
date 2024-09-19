package advancejava;

public class Person {
    // Encapsulated fields
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        setAge(age); // Use setter to enforce age validation
        this.address = address;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be less than 0.");
        }
        this.age = age;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    // toString method for displaying person details
    @Override
    public String toString() {
        return "Person [Name: " + name + ", Age: " + age + ", Address: " + address + "]";
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Alice", 30, "123 Main St");

        // Display initial details
        System.out.println(person);

        // Update the person's details
        person.setName("Alice Smith");
        person.setAge(31);
        person.setAddress("456 Elm St");

        // Display updated details
        System.out.println(person);

        // Test age validation
        try {
            person.setAge(-5); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
