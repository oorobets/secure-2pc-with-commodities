public class Evaluator {

    public static Wire xor(Wire input1, Wire input2) {
        byte outValue = (byte) (input1.getValue() ^ input2.getValue());

        byte[] outTag = new byte[input1.getTag().length];
        for (int i=0 ; i<input1.getTag().length; i++) {
            outTag[i] = (byte) (input1.getTag()[i] ^ input2.getTag()[i]);
        }
        byte[] outBase = new byte[input1.getBase().length];
        for (int i=0 ; i<input1.getBase().length; i++) {
            outBase[i] = (byte) (input1.getBase()[i] ^ input2.getBase()[i]);
        }

        return new Wire(outValue, outTag, outBase);
    }
}
