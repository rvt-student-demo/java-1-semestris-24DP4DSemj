package rvt;

public class Box {
    double width;
    double height;
    double length;

    Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box(double side) {
        this(side, side, side);
    }

    Box(Box oldBox) {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }

    public Box biggerBox(Box oldBox) {
        return new Box(1.25 * oldBox.width, 1.25 * oldBox.height, 1.25 * oldBox.length);
    }

    public Box smallerBox(Box oldBox) {
        return new Box(0.75 * oldBox.width, 0.75 * oldBox.height, 0.75 * oldBox.length);
    }

    public double volume() {
        return length * width * height;
    }

    double area() {
        return 2 * (faceArea() + topArea() + sideArea());
    }

    private double faceArea() {
        return width * length;
    }

    private double topArea() {
        return width * height;
    }

    private double sideArea() {
        return height * length;
    }

    public double length() {
        return length;
    }

    public double width() {
        return width;
    }

    public double height() {
        return height;
    }

    public boolean nests(Box outsideBox) {
        return (this.length > outsideBox.length) && (this.width > outsideBox.width) && (this.height > outsideBox.height);
    }

    public static void main(String[] args) {
        Box box1 = new Box(2, 2, 2);
        Box box2 = new Box(3);
        Box box3 = new Box(box2);

        System.out.println("Box 1 volume: " + box1.volume());
        System.out.println("Box 2 volume: " + box2.volume());
        System.out.println("Box 3 volume: " + box3.volume());

        Box biggerBox = box1.biggerBox(box1);
        Box smallerBox = box2.smallerBox(box2);

        System.out.println("Bigger Box volume: " + biggerBox.volume());
        System.out.println("Smaller Box volume: " + smallerBox.volume());

        System.out.println("Can Box 2 nest Box 1? " + box2.nests(box1));
        System.out.println("Can Box 1 nest Box 2? " + box1.nests(box2));
    }
}