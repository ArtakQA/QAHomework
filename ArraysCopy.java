import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        int[][] twoDimensionalArray = {{-57, 12, 45, 64, 14, 12}, {4, -54, 12, 0, 5, 6}};
        int[] NewArray = new int[twoDimensionalArray.length * twoDimensionalArray[0].length];

        int count = 0;
        for (int[] ints : twoDimensionalArray) {
            for (int anInt : ints) {
                NewArray[count] = anInt;
                count++;
            }
        }
        System.out.println(Arrays.toString(NewArray));
    }
}
