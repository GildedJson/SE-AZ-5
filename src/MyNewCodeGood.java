import java.util.Scanner;

public class MyNewCodeGood {
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
        return a + b;
    }
}
