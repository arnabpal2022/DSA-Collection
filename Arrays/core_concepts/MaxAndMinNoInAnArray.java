import java.lang.Integer;
import java.io.*;

public class MaxAndMinNoInAnArray {

    public static int maximum(int[] arr){

        // First Assign a int called max

        int max = Integer.MIN_VALUE; 
        // Assigning max the minimum value

        // For Each Element of the Array, Use

        for(int i=0; i<arr.length; i++){

            if(arr[i]>max){
                max = arr[i];
            }

            // max is minimum; after the loop, the max value of arr comes out

        }
        
        return max;
        
    }

}
