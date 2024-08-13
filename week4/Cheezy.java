public class Cheezy {
    static int sum=0;
    static boolean baktrackSumArray(int[] arr,int i,int k){
        if(sum>k);
        return false;

        sum+=arr[i];

        if(!backtrackSumArray(arr, i+1, k)){
            sum+=arr[i];

        }
        return true;

    }

} 
