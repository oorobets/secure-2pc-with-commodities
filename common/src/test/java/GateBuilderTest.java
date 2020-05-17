
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GateBuilderTest {
    @Test
    public void shouldCreateXORGate() {
        GateBuilder builder = new GateBuilder(GateType.XOR);
        Gate gate = builder
                .withInputWires(123, 456)
                .withOutputWire(12)
                .build();

        assertEquals(123, gate.getInputWire0());
        assertEquals(456, gate.getInputWire1());
        assertEquals(12, gate.getOutputWire());
        assertEquals(GateType.XOR, gate.getType());
    }

    @Test
    public void shouldCreateANDGate() {
        GateBuilder builder = new GateBuilder(GateType.AND);
        Gate gate = builder
                .withInputWires(123, 456)
                .withOutputWire(12)
                .build();

        assertEquals(123, gate.getInputWire0());
        assertEquals(456, gate.getInputWire1());
        assertEquals(12, gate.getOutputWire());
        assertEquals(GateType.AND, gate.getType());
    }

    @Test
    public void shouldCreateINVGate() {
        GateBuilder builder = new GateBuilder(GateType.INV);
        Gate gate = builder
                .withInputWires(123)
                .withOutputWire(12)
                .build();

        assertEquals(123, gate.getInputWire0());
        assertEquals(-1, gate.getInputWire1());
        assertEquals(12, gate.getOutputWire());
        assertEquals(GateType.INV, gate.getType());
    }

    @Test
    public void shouldThrowExceptionWhenINVGateHasSecondInput() {
        GateBuilder builder = new GateBuilder(GateType.INV);

        assertThrows(IllegalArgumentException.class, () ->{
            builder.withInputWires(123,456)
                    .withOutputWire(12)
                    .build();
        } );
    }

    @Test
    public void shouldThrowExceptionWhenInputWiresAreTheSame() {
        GateBuilder builder = new GateBuilder(GateType.AND);
        assertThrows(IllegalArgumentException.class, () -> {
            builder.withInputWires(123,123)
                    .withOutputWire(12)
                    .build();

        });
    }

    @Test
    public void shouldThrowExceptionWhenInputAndOutputWiresAreTheSame() {
        GateBuilder builder = new GateBuilder(GateType.AND);

        assertThrows(IllegalArgumentException.class, () -> {
            builder.withInputWires(123,456)
                    .withOutputWire(123)
                    .build();
        });
    }
}