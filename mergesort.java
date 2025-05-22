public class mergesort{
    public static void printArray(int arr[]){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[] ,int si, int ei){
        // base case
        if(si>= ei){
            return;
        }

        int mid = si+ (ei -si) / 2; // mid of the array
        mergeSort(arr , si , mid); // left part 1 2 3 |4 5 6  \3 is mid 
        mergeSort(arr, mid+1, ei); // right part
        merge(arr, si, mid , ei); //  function for merging

    }
    public static void merge(int arr[] , int si, int mid, int ei){
        int temp[] = new int[(ei - si) +1];
        int i = si; // for left part
        int j = mid+1; // for right part
        int k = 0;  // for temporary array

        // then we have to merge thr left part and right part 
        while(i <= mid && j <= ei){
          if(  arr[i]< arr[j]){
            temp[k] = arr[i];
            i++; 
          }else{
            temp[k]= arr[j];
            j++; 

          }
          k++;
        }

        // bache hue numbers ke liye
        // left
        while( i <= mid){
            temp[k++] = arr[i++];
        }

        //right
        while(j <= ei){
            temp[k++] = arr[j++];

        }

        // copy the value of temp to original array
        for( k = 0 , i = si; k < temp.length;k++, i++ ){
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
        
    }

}