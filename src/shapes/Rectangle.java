package shapes;

public class Rectangle implements Shape {

    private double side1;
    private double side2;
    private double side3;
    private double side4;

    public Rectangle(double x_edge1, double y_edge1, double x_edge2, double y_edge2, double x_edge3, double y_edge3, double x_edge4, double y_edge4) {

        this.side1 = countLength(x_edge1, y_edge1, x_edge2, y_edge2);
        this.side2 = countLength(x_edge2, y_edge2, x_edge3, y_edge3);
        this.side3 = countLength(x_edge3, y_edge3, x_edge4, y_edge4);
        this.side4 = countLength(x_edge4, y_edge4, x_edge1, y_edge1);
    }

    private double countLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }


    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3 + side4;
    }


    @Override
    public String print() {
        return "Rectangle; Sides: " + side1 + " " + side2 + " " + side3 + " " + side4 +
                "; Area: " + calculateArea() +
                "; Perimeter: " + calculatePerimeter() + "\n";

    }

}
