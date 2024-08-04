public class Lastoccurence {
    public static void Print(int arr[],int n,int x){
        int low=0;
        int high=n-1;
       int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(last);
    }
    public static void main(String[] args) {
        int arr[]={2,8,8,8,8,8,8,11,13};
        int n=arr.length;
        int x=8;
        Print(arr, n, x);
        
    }
    
}

    

