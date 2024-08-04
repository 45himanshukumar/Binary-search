public class BinarySearch {
    public static int Print(int arr[],int target,int n){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                low=mid+1;
            
            }
            else{
               high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={3,4,6,7,9,12,16,17};
        int target=1;
      int tar=  Print(arr,target,arr.length);
       System.out.println(tar);
    }
    
}
