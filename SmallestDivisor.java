public class SmallestDivisor {
    public static int Print(int arr[],int thresohld){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
              max=Math.max(max,arr[i]);
        }
        for(int d=1;d<=max; d++){
            int sum=0;
            for(int i=0; i<arr.length; i++){
                sum+=Math.ceil((double)(arr[i])/(double)(d));
                if(sum<=thresohld){
                    return d;
                }
            }
        }
     return -1;
    }
    public static void main(String[]args){
        int arr[]={1,2,5,9};
        int thresohld=6;
       
        System.err.println(Print(arr, thresohld));
    }
    
}
