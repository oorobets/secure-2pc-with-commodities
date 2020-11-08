import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class EvaluatorTest {

    @Test
    public void shouldXor(){
        Wire wire1 = new Wire((byte)1, new byte[]{0,0,0,0,0}, new byte[]{0,0,0,0,0});
        Wire wire2 = new Wire((byte)1, new byte[]{0,0,0,0,1}, new byte[]{0,0,1,0,0});
        Wire expectedWire = new Wire((byte)0, new byte[]{0,0,0,0,1}, new byte[]{0,0,1,0,0});

        Wire outWire = Evaluator.xor(wire1, wire2);

        assertEquals(expectedWire.getValue(), outWire.getValue());
        assertArrayEquals(expectedWire.getTag(), outWire.getTag());
        assertArrayEquals(expectedWire.getBase(), outWire.getBase());
    }
}
