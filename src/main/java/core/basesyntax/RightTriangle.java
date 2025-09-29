package core.basesyntax;

public class RightTriangle extends Figure {

    private final double legA;
    private final double legB;

    public RightTriangle(Color randomColor, double randomLegA, double randomLegB) {
        super(randomColor);
        this.legA = randomLegA;
        this.legB = randomLegB;
    }

    @Override
    public double getArea() {
        return (legA * legB) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, legA: " + legA
                + " units, legB: " + legB
                + " units, color: " + getColor());
    }
}
