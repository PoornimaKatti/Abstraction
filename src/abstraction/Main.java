
package abstraction;

public class Main {

    public static void main(String[] args) {
       
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        // Displaying information and calculating area
        displayShapeInfo(circle);
        displayShapeInfo(rectangle);
    }

    // Method for displaying shape information
    private static void displayShapeInfo(Shape shape) {
        System.out.println("Shape Information:");
        shape.displayInfo();
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("------------");
    }
}
