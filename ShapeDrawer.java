abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    public void draw() {
        System.out.println("circle");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("square");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("triangle");
    }
}

public class ShapeDrawer {
    public static void drawShape(Shape shape) {
        shape.draw();// prints the type of shape
    }
    
    public static void main(String[] args) {
        Shape circle = new Circle();// using shape = new circle for polymorphism
        Shape square = new Square();
        Shape triangle = new Triangle();
        
        drawShape(circle);
        drawShape(square);
        drawShape(triangle);
    }
}