import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        reversePrint(n, sc);
    }

    //1
    public static int sumSquares(int n) {
        if (n == 1) return 1;
        return n * n + sumSquares(n - 1);
    }

    //2
    public static int sumArray(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sumArray(arr, n - 1);
    }

    //3
    public static int power(int b, int n) {
        if (n == 0) return 1;
        return b * power(b, n - 1);
    }

    public static int powerSum(int b, int n) {
        if (n == 0) return 1;
        return power(b, n) + powerSum(b, n - 1);
    }

    //4
    public static void reversePrint(int n, Scanner sc) {
        if (n == 0) return;
        int x = sc.nextInt();
        reversePrint(n - 1, sc);
        System.out.print(x + " ");
    }
}