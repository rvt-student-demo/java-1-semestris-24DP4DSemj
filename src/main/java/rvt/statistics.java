package rvt;

public class statistics { 
    private int count;
    private int sum;

    public statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int num) {
        this.count++;
        this.sum += num;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.count == 0) {
            return 0;
        }
        return (double) this.sum / this.count;
    }

    public static void main(String[] args) {
        statistics statistics = new statistics();
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Total count: " + statistics.getCount());
        System.out.println("Average: " + statistics.average());
    }
} 