public class Vowel {
    public static void main(String[] args) {
        String value = "CheeseBurger";
        String vowel = "aeiouy";
        char[] array = value.toCharArray();
        int count = 0;
        for (int i = 0; i<array.length-1; i++) {
            if (vowel.indexOf(value.charAt(i)) >=0 ) {
                count++;
            }
        }
        System.out.println(count);
    }
}
