import java.util.Scanner;

public class mult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = input.nextInt();
        int mult = 1;
        for (int i=1; i<=a; i++) {
            mult *=i;
        }
        System.out.println(mult);
    }
}
