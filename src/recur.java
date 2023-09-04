import java.util.Scanner;

public class recur {
    public static void main(String[] args)
    {
        int input=100;
        printOdd(input);
    }
    static int printOdd(int input)
    {
        if (input == 1)
        {
         return 0;

        }
        if(input %2!=0)
        {
            System.out.println(input);
            printOdd( input - 2);
        }
        if(input %2==0)
        {
            printOdd(input-1);
        }
        return 1;
    }

}
