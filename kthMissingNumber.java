public class kthMissingNumber {
    public static void main(String[] args){
        int arr[]={2,3,4,7,11};
        int n=arr.length;
        int k=4                                                                                                                                               ;
        for(int i=0; i<n; i++){
            if(arr[i]<=k){
                k++;
            }
            else{
                break;
            }
        }
        System.out.println(k);
    }
    
}
