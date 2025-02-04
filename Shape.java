class Shape {
    int length, breadth;

    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        Shape shape1 = new Shape(5, 10);
        Shape shape2 = new Shape(7, 14);

        System.out.println("Shape 1 - Area: " + shape1.area() + ", Perimeter: " + shape1.perimeter());
        System.out.println("Shape 2 - Area: " + shape2.area() + ", Perimeter: " + shape2.perimeter());
    }
}