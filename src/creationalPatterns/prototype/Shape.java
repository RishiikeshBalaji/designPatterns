package creationalPatterns.prototype;

interface Shape extends Cloneable {
    Shape clone();
    void draw();
}
