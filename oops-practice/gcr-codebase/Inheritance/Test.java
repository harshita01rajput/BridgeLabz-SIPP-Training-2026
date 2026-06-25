 class Person {
    protected String name;
    protected int age;
 
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends Person {
    private final String studentId; 
    protected double gpa;

    // Constructor chaining
    public Student(String name, int age, String studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Student ID: " + studentId +
                ", GPA: " + gpa;
    }
}

class GradStudent extends Student {
    private String thesis;

     
    public GradStudent(String name, int age,
                       String studentId,
                       double gpa,
                       String thesis) {

        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Thesis: " + thesis;
    }
}

public class Test {
    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Harshita",
                21,
                "BTECH101",
                8.9,
                "Artificial Intelligence in Education"
        );

        System.out.println(gs);

        Student s = gs;    
        Person p = gs;    

        System.out.println("\nIS-A Relationship Demonstration:");
        System.out.println("Student Reference: " + s);
        System.out.println("Person Reference: " + p);
    }
}