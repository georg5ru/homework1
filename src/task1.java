import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        //task1
        int[] first = {1, 2, 3};
        double[] second = {1.57, 7.654, 9.986};
        int[] third = new int[5];
        //task2
        for (int i = 0; i <= 2; i++) {
            System.out.println(first[i]);
        }
        for (int i = 0; i <= 2; i++) {
            System.out.println(second[i]);
        }
        for (int i = 0; i <= 4; i++) {
            System.out.println(third[i]);
        }
        //task3
        for (int i = 2; i >= 0; i--) {
            System.out.print(first[i] + " ");
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(second[i] + " ");
        }
        System.out.println();
        for (int i = 4; i >= 0; i--) {
            System.out.print(third[i] + " ");
        }
        System.out.println();
        //task4
        for (int i = 0; i >= 2; i++) {
            if (first[i] % 2 != 0) {
                first[i] += 1;
            }
        }
        System.out.println(Arrays.toString(first));
    }
}
