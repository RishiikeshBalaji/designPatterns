package creationalPatterns.prototype;
import java.util.HashMap;
import java.util.Map;

class ShapeRegistry {
    private Map<String, Shape> shapeMap = new HashMap<>();

    public ShapeRegistry() {
        loadShapes();
    }

    public Shape getShape(String shapeType) {
        Shape cachedShape = shapeMap.get(shapeType);
        return cachedShape.clone();
    }

    private void loadShapes() {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 20);

        shapeMap.put("Circle", circle);
        shapeMap.put("Rectangle", rectangle);
    }
}