package shapes;

public class Triangle implements Shape {

    private double x_edge1;
    private double y_edge1;
    private double x_edge2;
    private double y_edge2;
    private double x_edge3;
    private double y_edge3;

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double x_edge1, double y_edge1, double x_edge2, double y_edge2, double x_edge3, double y_edge3) {
        this.x_edge1 = x_edge1;
        this.x_edge2 = x_edge2;
        this.x_edge3 = x_edge3;

        this.y_edge1 = y_edge1;
        this.y_edge2 = y_edge2;
        this.y_edge3 = y_edge3;

        this.side1 = countLength(x_edge1, y_edge1, x_edge2, y_edge2);
        this.side2 = countLength(x_edge2, y_edge2, x_edge3, y_edge3);
        this.side3 = countLength(x_edge3, y_edge3, x_edge1, y_edge1);
    }

    private double countLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }


    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double calculateArea() {
        return Math.abs((x_edge1 * (y_edge2 - y_edge3) + x_edge2 * (y_edge3 - y_edge1) + x_edge3 * (y_edge1 - y_edge2)) / 2);
    }

    @Override
    public String print() {
        return "Triangle; Sides: " + side1 + " " + side2 + " " + side3 + " " +
                "; Area: " + calculateArea() +
                "; Perimeter: " + calculatePerimeter() + "\n";
    }
}
