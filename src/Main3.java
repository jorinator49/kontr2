import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("xa = ");
        int xa = input.nextInt();
        System.out.print("ya = ");
        int ya = input.nextInt();
        System.out.print("xb = ");
        int xb = input.nextInt();
        System.out.print("yb = ");
        int yb = input.nextInt();
        System.out.print("xc = ");
        int xc = input.nextInt();
        System.out.print("yc = ");
        int yc = input.nextInt();

        double p = calculatePerimeter(xa, ya, xb, yb, xc, yc);
        System.out.println("P = " + p);
    }
    public static double calculatePerimeter(int xa, int ya, int xb, int yb, int xc, int yc) {
        double sideAB = Math.abs(Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2)));
        double sideAC = Math.abs(Math.sqrt(Math.pow(xc - xa, 2) + Math.pow(yc - ya, 2)));
        double sideBC = Math.abs(Math.sqrt(Math.pow(xb - xc, 2) + Math.pow(yb - yc, 2)));

        return sideAB + sideAC + sideBC;
    }
}
