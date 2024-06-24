package creationalPatterns.prototype;

public class Main {
    public static void main(String[] args) {
        ShapeRegistry shapeRegistry = new ShapeRegistry();

        Shape clonedCircle = shapeRegistry.getShape("Circle");
        clonedCircle.draw();

        Shape clonedRectangle = shapeRegistry.getShape("Rectangle");
        clonedRectangle.draw();
    }
}