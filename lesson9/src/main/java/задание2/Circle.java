package zadanie2;

public  class Circle   implements Figure {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }
}
