package dz.univ.calculatrice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SubtractOperationTest {

    private static final double DELTA = 1e-9;

    private final Operation operation = new SubtractOperation();

    @Test
    void soustractionDeDeuxNombresPositifs() {
        assertEquals(2.0, operation.apply(5.0, 3.0), DELTA);
    }

    @Test
    void soustractionDonnantResultatNegatif() {
        assertEquals(-2.0, operation.apply(3.0, 5.0), DELTA);
    }

    @Test
    void soustractionAvecNombresNegatifs() {
        assertEquals(-1.0, operation.apply(-4.0, -3.0), DELTA);
        assertEquals(7.0, operation.apply(4.0, -3.0), DELTA);
    }

    @Test
    void soustractionDeNombresDecimaux() {
        assertEquals(9.5, operation.apply(12.5, 3.0), DELTA);
        assertEquals(0.1, operation.apply(0.3, 0.2), DELTA);
    }

    @Test
    void symboleEstMoins() {
        assertEquals("-", operation.symbol());
    }
}