class Parent {
    // Regular method that can be overridden
    void regularMethod() {
        System.out.println("This is a regular method in Parent class.");
    }

    // Final method that cannot be overridden
    final void finalMethod() {
        System.out.println("This is a final method in Parent class.");
    }
}

class Child extends Parent {
    // This method tries to override the finalMethod from Parent class
    /* void finalMethod() {
        // Compilation error: cannot override final method from Parent
    } */
}

public class FinalEx {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.regularMethod(); // Output: This is a regular method in Parent class.
        parent.finalMethod();   // Output: This is a final method in Parent class.

        Child child = new Child();
        child.regularMethod();  // Output: This is a regular method in Parent class.
        child.finalMethod();    // Output: This is a final method in Parent class.
    }
}
