import java.util.Arrays;

public class MergeSort{
    public static void mergeSortAlgo(int[] arr1,int[] arr2){
        int ans[]=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int idx=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[idx]=arr1[i];
                idx++;
                i++;
            }
            else{
                ans[idx]=arr2[j];
                idx++;
                j++;
            }
        }
        while(i<arr1.length){
            ans[idx]=arr1[i];
            idx++;
            i++;
        }
        while(j<arr2.length){
            ans[idx]=arr2[j];
            idx++;
            j++;
        }
        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int arr1[]={1,2,4};
        int arr2[]={3,5,6,7,8,9};
        mergeSortAlgo(arr1,arr2);
    }
}
