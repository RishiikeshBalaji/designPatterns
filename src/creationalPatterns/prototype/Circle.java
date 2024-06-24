package creationalPatterns.prototype;

class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Circle clone() {
        return new Circle(this.radius);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }

    public int getRadius() {
        return radius;
    }
}