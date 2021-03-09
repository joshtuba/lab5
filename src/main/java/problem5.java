
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raspb
 */
public class problem5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int[] justAnArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //System.out.println(justAnArray.length);
        
        System.out.println("Input an int to check");
        int n = keyboard.nextInt();
        
        int count = greaterThanN(justAnArray, n);
        System.out.println("There were " + count + " number(s), greater than " + n + " in the array.");
        
    }
    public static int greaterThanN(int[] arrayToCheck, int n){
        int countGreaterThanN = 0;
        
        for (int i = 0; i < arrayToCheck.length; i++) {
            if (arrayToCheck[i] > n) {
                countGreaterThanN += 1;
            }
        }
        
        return countGreaterThanN;
    }
}
