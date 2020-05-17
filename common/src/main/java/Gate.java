public class Gate {
    public Gate(int inputWire0, int inputWire1, int outputWire, GateType gateType) {
        this.inputWire0 = inputWire0;
        this.inputWire1 = inputWire1;
        this.outputWire = outputWire;
        this.gateType = gateType;
    }

    private int inputWire0;
    private int inputWire1;
    private int outputWire;
    private GateType gateType;

    public int getInputWire0() {
        return inputWire0;
    }
    public int getInputWire1() {
        return inputWire1;
    }
    public int getOutputWire() {
        return outputWire;
    }
    public GateType getType() {
        return gateType;
    }
}
