import java.util.Scanner;

public class QuadraticEquation {
    public void solve(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Đây không phải PT bậc 2");
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = ((-b + Math.sqrt(delta)) / (2 * a));
                double x2 = ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.printf("x1 = %.3f\nx2 = %.3f", x1, x2);
            } else if (delta == 0) {
                double x = (-b / (2 * a));
                System.out.printf("Nghiệm kép x = %.3f", x);
            } else {
                System.out.println("Vô nghiệm");
            }
        }
    }
    public void cau3() {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[3];
        String[] chars = {"a", "b", "c"};
        System.out.println("ax2 + bx + c = 0 ");

        for(int i = 0; i < numbers.length; i++) {
            System.out.printf("\nNhập %s: ", chars[i]);
            numbers[i] = sc.nextDouble();
        }
        solve(numbers[0], numbers[1], numbers[2]);
    }
}
