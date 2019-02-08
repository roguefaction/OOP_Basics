package shapes;

public class Circle implements Shape {

    private double radius;

    public Circle(double x_center, double y_center, double x_point, double y_point) {
        this.radius = countLength(x_center, y_center, x_point, y_point);
    }

    private double countLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String print() {
        return "Circle; Area :" + calculateArea() + "; Perimeter: " + calculatePerimeter() + "\n";
    }
}
