import java.util.Scanner;

public class BitVector 
    implements InterfaceBitVector{
    private Scanner inputNumber = new Scanner (System.in);
    private Scanner inputString = new Scanner (System.in);
    private final int BASICS_OF_LOGIC = 32;
    private int lengthBitArr;
    private int chengingBit;
    private int[] intArr;

    private int  inputUsingNumber ()
    {
        int tmp;
        do {
            tmp = inputNumber.nextInt();
            System.out.println( (tmp <= 0) ? "Input again Greater than zero": "thanks for the input");
        } while (tmp <= 0);
        return tmp;
    }

    public boolean inputYesNo ()
    {
        String tmp;
        do {
            System.out.println("Yes / No");
            tmp = inputString.nextLine();
        } while ( ! ( tmp.equalsIgnoreCase ("Yes") || tmp.equalsIgnoreCase ("No") ) );
        return (  tmp.equalsIgnoreCase ("Yes") ? true : false );
    }

    public boolean inputSetReset ()
    {
        String tmp;
        do {
            System.out.println("Set / Reset");
            tmp = inputString.nextLine();
        } while ( ! ( tmp.equalsIgnoreCase ("Set") || tmp.equalsIgnoreCase ("Reset") ) );
        return ( tmp.equalsIgnoreCase ("Set") ? true : false );
    }

    private int[] newArr (int bit_count_of_intArr)
    {
        return ( (bit_count_of_intArr + 1) % BASICS_OF_LOGIC == 0) ? new int[bit_count_of_intArr / BASICS_OF_LOGIC] : new int[1 + bit_count_of_intArr / BASICS_OF_LOGIC];
    }

    private int[] reSizeArr (int[] intArr , int new_size)
    {
        int[] newArr = newArr(new_size);
        for (int i = 0 ; i < intArr.length ; i ++)
        {
            newArr[i] = intArr[i];
        }
        return newArr;
    }

    private void binarPrint(int num)
    {
        for (int i = 31 ; i >= 0 ; i--)
        {
            System.out.print( (num & (1 << i) )>>> i );
        }
        System.out.println();
    }

    public int inputChangingBit()
    {
        System.out.println("Input chenging Bit");
        chengingBit = inputUsingNumber() - 1;
        if ( chengingBit >= intArr.length * BASICS_OF_LOGIC )
        {
            intArr = reSizeArr(intArr, chengingBit);
        }
        return chengingBit;
    }

    public void realitionArr()
    {
        System.out.println("Input using number of chengingBit vector size :");
        lengthBitArr = inputUsingNumber();
        intArr = newArr(lengthBitArr);
    }

    public void set(int changingBit) {
        
        int index = chengingBit / BASICS_OF_LOGIC;
        int bias = chengingBit % BASICS_OF_LOGIC;
        bias = 1 << bias;
        intArr[index] |= bias;

        System.out.println("Print bits from " + (index * BASICS_OF_LOGIC) + " to " + (BASICS_OF_LOGIC + index * BASICS_OF_LOGIC));
        if ( inputYesNo() )
        {
           binarPrint(intArr[index]);
        }
    }

    public void reset(int changingBit) 
    {
            int index = chengingBit / BASICS_OF_LOGIC;
            int bias = chengingBit % BASICS_OF_LOGIC;
            bias = 1 << bias;
            intArr[index] |= bias;
            intArr[index] = bias ^ intArr[index] ;

            System.out.println("Print bits from " + (index * BASICS_OF_LOGIC) + " to " + (BASICS_OF_LOGIC + index * BASICS_OF_LOGIC));
            if ( inputYesNo() )
            {
               binarPrint(intArr[index]);
            }
    }
}
