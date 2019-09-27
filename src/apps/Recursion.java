package apps;

public class Recursion {

    public static int sumRecursive(int[] arr, int i){
        if(i == 0)  // this is the base case
            return 0;
        return arr[i - 1] + sumRecursive(arr, i - 1);
    }

    public static int sumIterative(int[] arr){
        int iterative = 0;
        for(int i = 0; i<arr.length;i++){
            iterative += arr[i];
        }
        return iterative;
    };

    public static void main(String[] args){

        // recursion
        int[] arr = new int[]{1,2,3};
        System.out.println("iterative: " + sumIterative(arr));
        System.out.println("recursive: " + sumRecursive(arr, arr.length));


    }
}
