package Algorithms.Searchings;

public class BinarySearch {

    public static int binarySearch(int[] arr, int element, int start, int end){

        // for a five sized array, start is 0, end is 4, we can also create manually

        int mid = (start +end)/ 2;

        //mid = 2

        while(start<=end){
            if(element == arr[mid]){
                return mid;

                // if element is in index 2
            }

            else if(element>arr[mid]){
                start = mid+1;
            }

            //if index is not in index 2, suppose in 1

            else {
                end = mid -1 ;
            }

            //if index in greater than 2; 3 or 4.

            mid = (start +end)/ 2;

        }
        return -1;
    }
}
