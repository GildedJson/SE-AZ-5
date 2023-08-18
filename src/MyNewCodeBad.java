import java.util.ArrayList;
import java.util.Scanner;

public class MyNewCodeBad {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press number1: ");
        int i = scanner.nextInt();
        System.out.println("Press number2: ");
        int j = scanner.nextInt();

        System.out.println(sum(i, j));
    }
    public static int sum(int a, int b) {
        Utils.sleepUninterrruptable(0.1);
        if (a > 1)
            return sum(b, a - 1) + 1;
        else
            return b + 1;
    }
}
