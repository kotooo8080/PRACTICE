import java.util.Scanner;

public class Zadacha9 {
    public void matrix() {
        System.out.println("Введите число N: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = 1, N = n;
        int[][] Arr = new int[N][N];
        for(int k = 0; k < N; k++)
        {
            for(int i = k; i < N; i++){
                Arr[k][i] = num;
                num++;
            }
            for(int i = k + 1; i < N; i++){
                Arr[i][N - 1] = num;
                num++;
            }
            for(int i = N - 2; i >= k; i--){
                Arr[N - 1][i] = num;
                num++;
            }
            for(int i = N - 2; i >= k + 1; i--){
                Arr[i][k] = num;
                num++;
            }
            N--;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
