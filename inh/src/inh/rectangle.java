package inh;

class Rectangle {
    protected double length;
    protected double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }
}

public class rectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 4);
        rect.printArea();
        rect.printPerimeter();

        Square square = new Square(5);
        square.printArea();
  
    }
}