import java.util.Arrays;

public class MergeSortAlgo {
    public static void mergeSort(int[] arr,int start,int end){
        if(start==end){
            return;
        }
        int mid=(start+end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start,mid, end);
    }
    public static void merge(int[] arr,int start,int mid,int end){
        
    }
    public static void main(String[] args) {
        int arr[]={4,3,9,2,5,1,8};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
