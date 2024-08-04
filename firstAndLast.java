public class firstAndLast {
    public static void Print(int arr[],int n,int x){
        int first=-1;
        int last=-1;
        for(int i=0; i<n; i++){
            if(arr[i]==x){
                if(first==-1){
                    first=i;
                   
                }
                last=i;
            }
            
        }
        System.out.print(first+" ");
        System.out.println(last);

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,8,8,11,13};
          int n=arr.length;
          int x=8;
          Print(arr, n, x);
          
    
}
}