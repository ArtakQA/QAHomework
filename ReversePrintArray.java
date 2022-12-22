public class PrintreverseArray {
    public static void main(String[] args) {
        String value = "CheeseBurger";
        char[] array = value.toCharArray();
        int count = 0;
        for (int i = array.length-1; i>=0; i--) {
            System.out.print(array[i]);
        }
    }
}
