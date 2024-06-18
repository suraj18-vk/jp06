package inh;

public class main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        rectangle.printArea();
        rectangle.printPerimeter();

        Square square = new Square(5);
        square.printArea();
        square.printPerimeter();
    }
}}
