
package meanmedian;

import java.util.Arrays;
import java.util.Scanner;

public class MeanMedian {

    public static void main(String[] args) 
    {
        int[] inputs = new int[5];
        int mean = 0;
        int sum = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter 5 integers");
        
        for(int x = 0; x <= 4; x++)
        {
            System.out.print(">> ");
            inputs[x] = input.nextInt();
        }
        Arrays.sort(inputs);
        
        System.out.print("The numbers listed in order: ");
        for(int y = 0; y <= inputs.length - 1; y++)
        {
            System.out.print(inputs[y] + " ");
        }
        System.out.println();
        
        for(int y = 0; y <= inputs.length - 1; y++)
        {
            sum += inputs[y];
            mean = sum / 5;
        }
        
        System.out.println("The mean of the numbers: " + mean);
        
        System.out.println("The median of the numbers is " + inputs[2]);
    }
}
