package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private final double baseA;
    private final double baseB;
    private final double height;

    public IsoscelesTrapezoid(Color randomColor, double randomBaseA,
                              double randomBaseB, double randomHeight) {
        super(randomColor);
        this.baseA = randomBaseA;
        this.baseB = randomBaseB;
        this.height = randomHeight;
    }

    @Override
    public double getArea() {
        return (baseA + baseB) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, baseA: " + baseA
                + " units, baseB: " + baseB
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
