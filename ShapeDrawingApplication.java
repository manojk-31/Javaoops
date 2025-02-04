abstract class Shape {
    // Abstract method draw to be implemented by subclasses
    abstract void draw();
}

// Circle class that extends Shape
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Rectangle class that extends Shape
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Main class to demonstrate polymorphism
public class ShapeDrawingApplication {
    public static void main(String[] args) {
        // Array of Shape objects
        Shape[] shapes = new Shape[4];

        // Adding instances of Circle and Rectangle
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Circle();
        shapes[3] = new Rectangle();

        // Calling draw() method on each shape
        for (Shape shape : shapes) {
            shape.draw(); // Demonstrates polymorphism
        }
    }
}