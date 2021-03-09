/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raspb
 */
public class problem11 {
    public static void main(String[] args) {
        int[] arrayToTest = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
    
        System.out.println("Total: " + getTotal(arrayToTest));
        System.out.println("Average: " + getAverage(arrayToTest));
        System.out.println("Highest: " + getHighest(arrayToTest));
        System.out.println("Lowest: " + getLowest(arrayToTest));
    
    }
    
    public static int getLowest(int[] justAnArray) {
        int lowest = justAnArray[0];
        
        for (int i = 0; i < justAnArray.length; i++) {
            if (justAnArray[i] < lowest) {
                lowest = justAnArray[i];
            }
        }
        
        return lowest;
    }
    
    public static int getHighest(int[] justAnArray) {
        int highest = justAnArray[0];
        
        for (int i = 0; i < justAnArray.length; i++) {
            if (justAnArray[i] > highest) {
                highest = justAnArray[i];
            }
        }
        
        return highest;
    }
    
    
    public static float getAverage(int[] justAnArray) {
        float average = 0;
        
        average = (getTotal(justAnArray)) / justAnArray.length;
        
        //why does this only output one place after the decimal
        
        return average;
    }
    
    public static int getTotal(int[] justAnArray) {
        int total = 0;
        
        for (int i = 0; i < justAnArray.length; i++) {
            total += justAnArray[i];
        }
        
        return total;
    }
    
    /*
    *   ##########              #
    *       #           ####    #
    *       #           #       #
    *   #   #   ####    ####    #####
    *   #   #   #  #       #    #   #
    *   #####   ####    ####    #   #
    */
}
