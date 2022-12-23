import java.util.*;


public class digitcounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter massiv elements");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i=0; i<=arr.length-1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int[] result = new int[max+1];

        for (int a : arr) {
            result[a]++;
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] > 0) {
                System.out.println("Number " + i + " == " + result[i] + " time(s)");
            }
        }
    }
}
