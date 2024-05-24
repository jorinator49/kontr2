import java.util.Scanner;

public class Main4 {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для вычисления факториала: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0) {
            System.out.println("Факториал отрицательного числа не определен.");
        } else {
            int result = factorial(number);
            System.out.println(result);
        }
    }
}
