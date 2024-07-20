public class maxSubArrayBrute {

    public static int maxSubArray(int array[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            for(int j = i; j < array.length; j++){
                int temp = 0;
                for(int k = i; k <= j; k++){
                    temp += array[k];
                }
                if(temp>max){
                    max=temp;
                }
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int array[] = {1, -2, 6, -1, 3};
        System.out.println(maxSubArray(array));
    }
}