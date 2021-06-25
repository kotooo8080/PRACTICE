public class Zadacha4 {
    public int getMainDiag() {
        return mainDiag;
    }

    public void setMainDiag(int mainDiag) {
        this.mainDiag = mainDiag;
    }

    public int getSideDiag() {
        return sideDiag;
    }

    public void setSideDiag(int sideDiag) {
        this.sideDiag = sideDiag;
    }

    private int mainDiag;
    private int sideDiag;
    public void Average() {
        int[][] Arr = new int[5][5];
        for(int i = 0; i < Arr.length;  i++){
            for(int j = 0; j < Arr.length; j++){
                Arr[i][j] = (int)(Math.random()*1000);
                if(i == j)
                    mainDiag += Arr[i][j];
                if(j == (4 - i))
                    sideDiag += Arr[i][j];
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
