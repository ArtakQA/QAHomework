public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 1, n2 = 1, n3 = 0, sum=0;

        while (n3<=4000000)
        {
            n3 = n1 + n2;
            if (n3%2==0){
                sum = sum+n3;
            }
            n1 = n2;
            n2 = n3;
        }
        System.out.println(sum);
    }
}
