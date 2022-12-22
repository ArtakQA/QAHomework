public class ReverseArray {
    public static void main(String[] args) {
        String value = "CheeseBurger";
        char[] array = value.toCharArray();
        int size = array.length;
        char temp;
        for (int i = 0; i<array.length/2; i++) {
            temp = array[i];
            array[i] = array[size-1-i];
            array[size-1-i] = temp;
        }
        System.out.println(array);
    }
}
