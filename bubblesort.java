import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter massiv elements");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
