package duongtran.JavaInterfaceExercises.Ex1;

public class Triangle implements Shape {
    double baseLength;
    double height;

    public Triangle(double baseLength, double height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    public double getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return baseLength * height / 2;
    }
}
