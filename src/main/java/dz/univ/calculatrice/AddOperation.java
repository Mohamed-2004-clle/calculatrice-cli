package dz.univ.calculatrice;

/**
 * Opération d'addition de deux nombres réels.
 */
public class AddOperation implements Operation {

    @Override
    public double apply(final double a, final double b) {
        return a + b;
    }

    @Override
    public String symbol() {
        return "+";
    }
}