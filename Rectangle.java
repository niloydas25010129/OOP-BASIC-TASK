class Rectangle {
    double width;
    double height;
    Rectangle(double w, double h) {
        width = w;
        height = h;
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 3);

        double area = r.width * r.height;
        double perimeter = 2 * (r.width + r.height);

        System.out.println("Width: " + r.width);
        System.out.println("Height: " + r.height);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
