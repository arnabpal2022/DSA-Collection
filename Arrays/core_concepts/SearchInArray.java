public class SearchInArray {
    
    public static int searchElement (int[] arr, int element){
        
        //for each and every element check the element in a for loop

        for(int i=0; i<arr.length; i++){

            if(arr[i]==element){

                return i;

            }

        }

        return -1;
        
    }
}
