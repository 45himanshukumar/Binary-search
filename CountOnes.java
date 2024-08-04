


public class CountOnes {
    public static void Print(int matrix[][],int m,int index){
        int maxCount=-1;
        for(int i=0; i<m; i++){
            int count=0;
            for(int j=0;j<m; j++){
                count+=matrix[i][j];
                if(maxCount<count){
                    maxCount=count;
                    index=i;
                }
            }
        }
        System.out.println(index);
    }
    public static void main(String []args){
        int matix[][]={{0,0,1,1,1},
                       {0,0,0,0,0},
                       {0,1,1,1,1},
                       {0,0,0,0,0},
                       {0,1,1,1,1}};
           int m=matix.length;
          
           int index=-1;
           Print(matix, m, index);
                            
    }
    
}
