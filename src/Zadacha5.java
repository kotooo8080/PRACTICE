public class Zadacha5 {
    public void Minimal() {
        int min = 100, k = 1, m = 0;
        int[] arr = new int[3];
        for(int i = 0; i < 3; i++){
            arr[i] = (int)(Math.random()*100);
        }
        for(int i = 0; i < 3; i++){
            if(arr[i] <= min){
                if(arr[i] == min && ((m == min)||(m == 0))) {
                    k++;
                    m = min;
                }
                else
                    k = 1;
                min = arr[i];
            }
        }
        System.out.print("Минимальное значение: " + min + "\nВстретилось " + k + " раз(а)");
    }
}
