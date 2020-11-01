public class Wire {
    private final byte value;
    private final byte[] tag;
    private final byte[] base;

    public Wire(byte value, byte[] tag, byte[] base) {
        this.value = value;
        this.tag = tag;
        this.base = base;
    }

    public byte getValue() {
        return value;
    }

    public byte[] getTag() {
        return tag;
    }

    public byte[] getBase() {
        return base;
    }
}
