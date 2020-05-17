public class GateBuilder {

    private GateType gateType;
    private int inputWire0;
    private int inputWire1;
    private int outputWire;

    public GateBuilder(GateType gateType){
        this.gateType = gateType;
    }

    public GateBuilder withInputWires(int inputWire0, int inputWire1){
        this.inputWire0 = inputWire0;
        this.inputWire1 = inputWire1;
        return this;
    }

    public GateBuilder withInputWires(int inputWire){
        this.inputWire0 = inputWire;
        this.inputWire1 = -1;
        return this;
    }

    public GateBuilder withOutputWire(int outputWire){
        this.outputWire = outputWire;
        return this;
    }

    public Gate build() {
        if(inputWire0 == inputWire1 || inputWire0 == outputWire || inputWire1 == outputWire){
            throw new IllegalArgumentException("Some wires are the same");
        }
        if(gateType == GateType.INV && inputWire1 != -1){
            throw new IllegalArgumentException("INV Gate can't have second input wire!");
        }
        return new Gate(inputWire0, inputWire1, outputWire, gateType);
    }
}
