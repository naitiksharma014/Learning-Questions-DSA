//Brute Force


public class MaxSubArray_I {
    public static void max_sub_Array(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;


        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                currSum=0;
                int end=j;
                for(int k=start;k<=end;k++){
                    currSum=currSum+arr[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }

        }
        System.out.println("Total Max Sum: "+ maxSum);
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        max_sub_Array(arr);
    }
    
}
