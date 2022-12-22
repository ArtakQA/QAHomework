import java.util.Scanner;

public class OddArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = input.nextInt();
        int count = 0;
        int[] array = new int[size];
        int[] CopiedArray = new int[size];
        System.out.println("Enter massiv elements");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        for (size = 0; size <= array.length - 1; size++) {
            if (array[size] % 2 != 0) {
                CopiedArray[count] = array[size];
                System.out.println(CopiedArray[count]);
                count++;
            }

        }
    }
}
