public class RownanieKwadratowe {
    private double a, b, c;

    public RownanieKwadratowe(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double obliczDelte() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double[] obliczRozwiazanie() throws UjemnaDeltaException {
        double delta = obliczDelte();

        if (delta < 0) {
            throw new UjemnaDeltaException();
        }

        if (delta == 0) {
            double x = -b / (2 * a);
            return new double[]{x, x};
        }

        double x1 = (-b - Math.sqrt(delta)) / (2 * a);
        double x2 = (-b + Math.sqrt(delta)) / (2 * a);

        return new double[]{x1, x2};
    }
    }


class UjemnaDeltaException extends Exception {
    public UjemnaDeltaException() {
        super("Delta jest ujemna!");
    }
}