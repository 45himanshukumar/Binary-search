public class BinaryRecurrsive {
    public static int Print(int arr[],int low,int high,int target){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target>arr[mid]){
           Print(arr, mid+1, high, target);
        }
        else{
            Print(arr, low, mid-1, target);
        }
    }
    public static void main(String[] args){
        int arr[]={3,4,6,7,9,12,16,17};
       int res= Print(arr, 0, arr.length-1, 9);
       if(res!=-1){

       }
       

    
    }
    
}
