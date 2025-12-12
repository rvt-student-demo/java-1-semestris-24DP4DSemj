package rvt;

public class Student extends Person {
    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public void study() {
        this.credits++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + this.credits;
    }

    public static void main(String[] args) {
        Student student = new Student("John Doe", "123 Main St");
        System.out.println(student);
        student.study();
        student.study();
        System.out.println("Study credits " + student.credits);
        System.out.println(student);
    }
}