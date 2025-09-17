class Circle {
    double radius;
    Circle(double r) {
        radius = r;
    }
    public static void main(String[] args) {
        Circle c = new Circle(8);
        System.out.println("Radius: " + c.radius);
        c.radius = 16;
        System.out.println("Updated Radius: " + c.radius);
        double area = Math.PI * c.radius * c.radius;
        double circumference = 2 * Math.PI * c.radius;

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
