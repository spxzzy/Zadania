public class Main {
    public static void main(String[] args) {
            RownanieKwadratowe r = new RownanieKwadratowe(-3, 3, 1);
            try {
                double[] rozwiazanie = r.obliczRozwiazanie();
                System.out.println("x1 = " + rozwiazanie[0] + ", x2 = " + rozwiazanie[1]);
                }
            catch (UjemnaDeltaException e) {
                System.out.println("Delta jest ujemna!");
            }
    }
}