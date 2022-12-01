

public class ReverseArray {

    public static void reverse (int[] arr){

        int n = arr.length;

        // suppose array size n=8, n/2 = 4, last array index=7
        // in case of i=0; first array = arr[i] = arr[0]
        // and last array = arr[n-i-1]= arr[7] and those swap by this algorithm

        //when loop goes forward, all the elements are swapped and thus the array is reversed
        
        for(int i=0; i<n/2; i++){

            int temp = arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;

        }


    }


}
