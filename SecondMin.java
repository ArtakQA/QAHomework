import java.util.Scanner;

public class SecondMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter massiv elements");
        int prmin = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        for (size = 0; size <= array.length - 1; size++) {
            if (array[size] < min) {
                prmin = min;
                min = array[size];
            }
            if(prmin>array[size] && array[size]>min){
                prmin = array[size];
           }
        }
//        for (size = 0; size <= array.length-1; size++) {
//            if(prmin>array[size] && array[size]>min){
//                prmin = array[size];
//            }
//        }
         System.out.println("Second Min Value is" + " " + prmin);
    }
}
