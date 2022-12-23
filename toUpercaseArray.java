import java.util.*;


public class UpecarseArray {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any string");
        String Name = input.nextLine();
        char[] array = Name.toCharArray();
        for(int i=0; i<=array.length-1; i++) {
            array[i] = Character.toUpperCase(array[i]);
        }
        System.out.println(array);
    }
}
