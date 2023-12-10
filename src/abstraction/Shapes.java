
package abstraction;
    abstract class Shape {
    protected String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Abstract method for calculating area
    public abstract double calculateArea();

    // Concrete method for displaying information
    public void displayInfo() {
        System.out.println("Color: " + color);
    
}
    }