import java.util.*;

// Step 1: Create Shape Interface
interface Shape {
    void draw();
}

// Step 2: Concrete Shape Classes
class Rectangle implements Shape {
    public void draw() {
        System.out.println("Inside Rectangle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Inside Square");
    }
}

class RoundSquare implements Shape {
    public void draw() {
        System.out.println("Inside Rounded Square");
    }
}

class RoundRectangle implements Shape {
    public void draw() {
        System.out.println("Inside Rounded Rectangle");
    }
}

// Step 3: Abstract Factory Class
abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);
}

// Step 4: Concrete Factory Classes
class ShapeFactory extends AbstractFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }
        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}

class RoundedShapeFactory extends AbstractFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new RoundRectangle();
        }
        if (shapeType.equalsIgnoreCase("Square")) {
            return new RoundSquare();
        }
        return null;
    }
}

// Step 5: Factory Producer
class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}


public class AbstractFactoryPattern {
    public static void main(String[] args) {
        // Get normal shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        // Create normal shapes
        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw(); // Output: Inside Rectangle

        Shape shape2 = shapeFactory.getShape("Square");
        shape2.draw(); // Output: Inside Square

        // Get rounded shape factory
        AbstractFactory roundedFactory = FactoryProducer.getFactory(true);

        // Create rounded shapes
        Shape shape3 = roundedFactory.getShape("Rectangle");
        shape3.draw(); // Output: Inside Rounded Rectangle

        Shape shape4 = roundedFactory.getShape("Square");
        shape4.draw(); // Output: Inside Rounded Square
    }
}
