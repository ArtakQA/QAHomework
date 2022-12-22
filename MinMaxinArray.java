public class charArray {
   public static void main(String[] args) {
        String value = "CheeseBurger";
        char[] array = value.toCharArray();
        char min='z';
        char max='A';
        for (int i = 0; i<array.length-1; i++) {
            if (value.charAt(i)>max) {
                max = value.charAt(i);
            }
            if (value.charAt(i)<min) {
                min=value.charAt(i);
            }
        }
       System.out.println(max);
       System.out.println(min);
    }
}
