public class Main {
    public static void main(String[] args) {
        boolean comparison;

        InterfaceBitVector bitVector = new BitVector();
        bitVector.realitionArr();
        do {
            int changingBit = bitVector.inputChangingBit();
            
            if ( bitVector.inputSetReset() )
            {
                bitVector.set(changingBit);
            }else {
                bitVector.reset(changingBit);
            }
            
            System.out.println("Do wou want to do a Set again ");
            comparison = bitVector.inputYesNo();
        } while( comparison == true);
        


    }
}
