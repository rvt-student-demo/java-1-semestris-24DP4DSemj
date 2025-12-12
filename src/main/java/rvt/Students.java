package rvt;

public class Students extends Person {
    private int credits;

    public Students(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public void study() {
        this.credits++;
    }

    public static void main(String[] args) {
        Students students = new Students("John Doe", "123 Main St");
        System.out.println(students);
        students.study();
        students.study();
        System.out.println("Study credits " + students.credits);
    }
}