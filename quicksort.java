public class quicksort {
    public static void printArray(int arr[]){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        
    }
    public static void quick(int arr[], int si, int ei){
        // base case
        if(si>= ei){
            return;
        }
        // to find the pivot index
        int pidx = partition(arr, si , ei);
        quick(arr, si, pidx-1);
        quick(arr, pidx+1, ei);
    }

    public static int partition(int arr[] , int si, int ei){
        int pivot = arr[ei]; // taking last element as pivot element
        int i = si-1;

        for(int j = si; j < ei; j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            

        }
        i++;
            int temp = pivot;
                arr[ei] = arr[i];
                arr[i] = temp;
                return i;


    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8, -5};
        quick(arr, 0, arr.length-1);
        printArray(arr);
        
    }
}
