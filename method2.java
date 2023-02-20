import java.util.*;

public class method2 {
    public static int Sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int sum = Sum(i, j);
        System.out.println("The sum is :" + sum);
    }
}
