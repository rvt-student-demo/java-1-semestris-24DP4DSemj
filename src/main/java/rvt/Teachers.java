package rvt;

public class Teachers extends Person {
    private int salary;

    public Teachers(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Salary " + this.salary + " euros/month";
    }

    public static void main(String[] args) {
    }
}