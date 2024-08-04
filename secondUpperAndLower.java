
public class secondUpperAndLower {
    public static int Print(int arr[],int n,int x){
        int low=0; 
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans= mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int Printt(int arr[],int n,int x){
        int low=0; 
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                ans=mid-1;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int arr[]={2,4,6,8,8,8,11,13};
        int n=arr.length;
        int  x=10;
      int lb=  Print(arr,n,x);
      int ub=Printt(arr,n,x);
      if((lb==n)||arr[lb]!=x){
        return {-1,-1};
      }
      System.out.println(lb);
      System.out.println(ub);

    }
    
}
