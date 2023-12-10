
package abstraction;

    class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Implementation of abstract method for calculating area
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    
}
    }