import java.util.*;

public class Main {
    static int N,M;
    static int[] arr;
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M];
        comb(0,1);
    }

    static void comb(int depth, int start){
        if(depth == M){
            for(int i=0; i<M; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i=start; i<=N; i++){
            arr[depth] = i;
            comb(depth+1, i+1);
        }
    }
}