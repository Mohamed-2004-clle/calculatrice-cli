package dz.univ.calculatrice;

/**
 * Opération de soustraction de deux nombres réels.
 */
public class SubtractOperation implements Operation {

    @Override
    public double apply(final double a, final double b) {
        return a - b;
    }

    @Override
    public String symbol() {
        return "-";
    }
}