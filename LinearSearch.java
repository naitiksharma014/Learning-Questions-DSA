public class LinearSearch {

    public static int linear_search(int arr[], int search){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,34,56,3,00,3};
        int search=03;

        int index = linear_search(arr, search);

        if (index==-1) {
            System.out.println(" not found");
            
        }
        else{ 
            System.out.println("found at " + index);
        }
    }
    
}
