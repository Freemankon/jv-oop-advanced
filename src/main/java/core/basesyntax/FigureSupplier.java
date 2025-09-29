package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double MIN_INT = 1;
    private static final double MAX_INT = 10;
    private static final double DEFAULT_INT = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0 -> {
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextDouble(MIN_INT, MAX_INT));
            }
            case 1 -> {
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble(MIN_INT, MAX_INT),
                        random.nextDouble(MIN_INT, MAX_INT));
            }
            case 2 -> {
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble(MIN_INT, MAX_INT),
                        random.nextDouble(MIN_INT, MAX_INT));
            }
            case 3 -> {
                return new Square(colorSupplier.getRandomColor(),
                        random.nextDouble(MIN_INT, MAX_INT));
            }
            case 4 -> {
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble(MIN_INT, MAX_INT),
                        random.nextDouble(MIN_INT, MAX_INT),
                        random.nextDouble(MIN_INT, MAX_INT));
            }
            default -> {
                return getDefaultFigure();
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", DEFAULT_INT);
    }

}
