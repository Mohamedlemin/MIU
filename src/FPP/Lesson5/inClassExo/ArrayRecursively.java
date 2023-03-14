package FPP.Lesson5.inClassExo;

public class ArrayRecursively {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5,3,5,10};
        System.out.println(arraySum(arr,arr.length));
        System.out.println(recursive(arr,arr.length));
    }
    public static int arraySum(int[] arr, int n){
        int sum =0;
        if (n<=0) return 0;
        sum += arr[n-1];
        return sum+arraySum(arr,n-1);
    }
    public static int recursive(int[] a , int n){
        if(n==0) return 0;
        return recursive(a,n-1) + a[n-1];
    }
}
