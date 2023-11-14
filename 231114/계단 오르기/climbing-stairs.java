import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] arr = new long[n+1];
        if(n < 3) arr = new long[4];
        arr[2] = arr[3] = 1;
        for(int i=4; i<=n; i++){
            arr[i] = (arr[i-2] + arr[i-3]) % 10007;
        }
        System.out.println(arr[n]);
    }
}