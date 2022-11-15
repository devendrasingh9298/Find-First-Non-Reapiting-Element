public class Main{
    public static void main(String[] args){
        int[] arr = new int[]{1,2,1};
        
        for(int i = 0; i < arr.length; i++){
            int j = 0;
            for(j = 0; j < arr.length; j++){
               if(i != j && arr[i] == arr[j]){
                  break;
                }
            }
           if(j == arr.length){
                System.out.print( arr[i] );
            }
        }
    }
}
