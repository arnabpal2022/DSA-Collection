Class SumOfElements{
    public static int sumAll(int[] arr){

        //initialize sum with 0
        int sum = 0;

        //take each element in a loop

        for(int elements : arr){
            
            // add those elements in each time with sum and update sum

            sum=sum+elements;
        
        }

        return sum;
    }
}
