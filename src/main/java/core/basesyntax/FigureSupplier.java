package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(4)) {
            case 0 -> {
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextDouble(1, 10));
            }
            case 1 -> {
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble(1, 10),
                        random.nextDouble(1, 10));
            }
            case 2 -> {
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble(1, 10),
                        random.nextDouble(1, 10));
            }
            case 3 -> {
                return new Square(colorSupplier.getRandomColor(),
                        random.nextDouble(1, 10));
            }
            case 4 -> {
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble(1, 10),
                        random.nextDouble(1, 10),
                        random.nextDouble(1, 10));
            }
            default -> {
                return null;
            }
        }
    }

    public Figure getDefautFigure() {
        return new Circle(Color.WHITE, 10);
    }

}
