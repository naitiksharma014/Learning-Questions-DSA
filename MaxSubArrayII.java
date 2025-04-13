//PREFIX ARRAY

public class MaxSubArrayii { 
    public static void Max_Sub(int array[]){
        int  currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefixArray[]=new int[array.length];
        prefixArray[0]=array[0];

        //CALCULATE PREFIX ARRAY
        for(int i=1;i<array.length;i++){
            prefixArray[i]=prefixArray[i-1]+array[i];
        }


        for(int i=0;i<array.length;i++){
            int start=i;
            for(int j=i;j<array.length;j++){
                int end=j;

                currSum=start==0 ? prefixArray[end]: prefixArray[end]-prefixArray[start-1];

                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println(maxSum);

        
    }
    public static void main(String[] args) {
        int array[]={1,-2,6,-1,3};
        
        Max_Sub(array);
        
    }
    
}

    

