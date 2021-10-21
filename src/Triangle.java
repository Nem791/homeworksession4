import java.util.Scanner;

public class Triangle {
    public void isTriangle(double a, double b, double c) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Đây là tam giác !");
            final boolean pythagoras = (a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a);
            if ((a == b) || (a == c) || (b == c)) {
                System.out.println("Đây là tam giác cân !");
                if ((a == b) && (b == c)) {
                    System.out.println("Đây là tam giác đều !");
                } else if (pythagoras) {
                    System.out.println("Đây là tam giác vuông cân !");
                }
            } else if (pythagoras) {
                System.out.println("Đây là tam giác vuông !");
            } else if (a * a > b * b + c * c || b * b > a * a+c * c || c * c > a * a + b * b) {
                System.out.println("Đây là tam giác tù !");
            } else {
                System.out.println("Đây là tam giác nhọn !");
            }
        } else  {
            System.out.println("Đây ko phải là tam giác !");
        }
    }
    public void cau1() {
        Scanner sc = new Scanner(System.in);
        double[] sides = new double[3];

        for(int i = 0; i < sides.length; i++) {
            System.out.printf("\nNhập cạnh %d: ", i + 1);
            sides[i] = sc.nextDouble();
        }
        isTriangle(sides[0], sides[1], sides[2]);
    }
}
