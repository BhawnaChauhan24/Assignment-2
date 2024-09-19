package advancejava;

public class Student {
    // Private fields
    private String name;
    private int grade;

    // Constructor
    public Student(String name, int grade) {
        setName(name);  // Validating the name using setter
        setGrade(grade);  // Validating the grade using setter
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name with validation
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty. Default name 'Unknown' is set.");
            this.name = "Unknown";  // Setting a default value if name is invalid
        }
    }

    // Getter for grade
    public int getGrade() {
        return grade;
    }

    // Setter for grade with validation
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Grade must be between 0 and 100. Setting default grade to 0.");
            this.grade = 0;  // Setting default value if grade is invalid
        }
    }

    public static void main(String[] args) {
        // Creating a Student object with valid inputs
        Student student1 = new Student("janvi", 85);
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Grade: " + student1.getGrade());

        // Creating a Student object with invalid inputs (empty name and invalid grade)
        Student student2 = new Student("", 150);
        System.out.println("Student Name: " + student2.getName());
        System.out.println("Student Grade: " + student2.getGrade());

        // Modifying student details with valid values
        student2.setName("jatin");
        student2.setGrade(90);
        System.out.println("Updated Student Name: " + student2.getName());
        System.out.println("Updated Student Grade: " + student2.getGrade());

        // Trying to set invalid values again
        student2.setName("");
        student2.setGrade(-20);
        System.out.println("Final Student Name: " + student2.getName());
        System.out.println("Final Student Grade: " + student2.getGrade());;

    }
}