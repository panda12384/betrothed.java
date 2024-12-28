import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum1 = 0;
        for (int i = 1; i < num1; i++) 
        {
            if (num1 % i == 0) {
                sum1 += i;
            }
        }
        int sum2 = 0;
        for (int i = 1; i < num2; i++) 
        {
            if (num2 % i == 0) {
                sum2 += i;
            }
        }
        if (sum1+1 > num2 && sum2+1 > num1) {
            System.out.println("Betrothed");
        } else {
            System.out.println("not betrothed numbers.");
        }
    }
}
