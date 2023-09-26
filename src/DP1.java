public class DP1 {
    public static void fibonacci_No(int a,int b,int n){
        if (n==0){
            return ;
        }
        int sum=a+b;
        System.out.println(sum);
        fibonacci_No(b,sum,n-1);
    }
    public static void main(String[] args) {
        int n=7;
        fibonacci_No(0,1,n);
    }
}
