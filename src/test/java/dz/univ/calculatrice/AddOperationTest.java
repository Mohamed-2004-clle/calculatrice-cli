package dz.univ.calculatrice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AddOperationTest {

    private static final double DELTA = 1e-9;

    private final Operation operation = new AddOperation();

    @Test
    void additionDeDeuxNombresPositifs() {
        assertEquals(5.0, operation.apply(2.0, 3.0), DELTA);
    }

    @Test
    void additionAvecNombresNegatifs() {
        assertEquals(-7.0, operation.apply(-4.0, -3.0), DELTA);
        assertEquals(1.0, operation.apply(-2.0, 3.0), DELTA);
    }

    @Test
    void additionDeNombresDecimaux() {
        assertEquals(15.5, operation.apply(12.5, 3.0), DELTA);
        assertEquals(0.3, operation.apply(0.1, 0.2), DELTA);
    }

    @Test
    void additionAvecZero() {
        assertEquals(8.0, operation.apply(8.0, 0.0), DELTA);
    }

    @Test
    void symboleEstPlus() {
        assertEquals("+", operation.symbol());
    }
}