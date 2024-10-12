public class QuickSort
{
    public static int partition(int arr[], int low,int high){
        int pivot = arr[high];
        int i = low-1;
        
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                // swap
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // swap with pivot
        i++;
        arr[high] = arr[i];
        arr[i] = pivot;
        
        // return pivot index
        return i;
    }
    public static int square(int num) {

    // return statement
    return num * num;
  }
    public static int partition1(int arr[], int low,int high){
        int pivot = arr[high];
        int i = low-1;
        
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                // swap
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // swap with pivot
        i++;
        arr[high] = arr[i];
        arr[i] = pivot;
        
        // return pivot index
        return i;
    }
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pindx = partition(arr,low,high);
            
            quickSort(arr,low,pindx-1);
            quickSort(arr,pindx+1,high);
        }
    }
    public static void main(String args[])
    {
        int arr[] = {3,4,1,3,7,3,8};
        int n = arr.length;
        quickSort(arr,0,n-1);
        
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
