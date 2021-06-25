public class Zadacha2 {
    public static int SUM2() {
        int sum = 0;
        int[][] Arr = new int[5][5];
        for(int i = 0; i < Arr.length;  i++){
            for(int j = 0; j < Arr.length; j++){
                Arr[i][j] = (int)(Math.random()*1000);
                if(i == j)
                    sum += Arr[i][j];
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }
        return(sum);
    }
}

