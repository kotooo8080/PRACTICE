public class Main {
    public static void main(String[] args) {
        System.out.print("Решение задачи 1:");
        Zadacha1 obj1 = new Zadacha1();
        System.out.println(obj1.SUM());

        System.out.print("Решение задачи 2:");
        System.out.println("\nМатрица:");
        Zadacha2 obj2 = new Zadacha2();
        System.out.print("Сумма элементов главной диагонали: " + obj2.SUM2());

        System.out.print("\nРешение задачи 4:");
        System.out.println("\nМатрица:");
        Zadacha4 obj4 = new Zadacha4();
        obj4.Average();
        System.out.println("Среднее ариф. главной диагонали: " + (double)obj4.getMainDiag()/5 + "\nСреднее ариф. побочной диагонали: " + (double)obj4.getSideDiag()/5);

        System.out.print("\nРешение задачи 9:");
        Zadacha9 obj9 = new Zadacha9();
        obj9.matrix();

        System.out.print("\nРешение задачи 5(возможно несколько минимальных элементов):");
        Zadacha5 obj5 = new Zadacha5();
        obj5.Minimal();

        System.out.print("\nРешение задачи 6(возможно несколько минимальных элементов):");
        Zadacha6 obj6 = new Zadacha6();
        obj6.Min();
    }
}
