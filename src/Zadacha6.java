import java.util.ArrayList;

public class Zadacha6 {
    public void Min() {
        int min = 100, k = 1;
        int[] arr = new int[10];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            arr[i] = (int)(Math.random()*100);
            if(arr[i] <= min)
                min = arr[i];
        }
        for(int i = 0; i < 10; i++){
            if(arr[i] == min)
                arrayList.add(i);
        }
        System.out.print("Минимальное значение: " + min);
        System.out.println("\nИндексы: " + arrayList);
    }
}
