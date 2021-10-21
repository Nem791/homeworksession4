import java.util.Scanner;

public class Grades {
    public void averageAndRanking(double a, double b, double c, double d) {
        double tbc = (a + b + c + d)/4;
        System.out.printf("TBC: %.3f\n", tbc);
        boolean low = tbc < 4.5;
        boolean avg = (tbc >= 4.5 && tbc < 6.5);
        boolean aboveAvg = (tbc >= 6.5 && tbc < 8);

        if (low) {
            System.out.println("Hạng yếu");
        } else if (avg) {
            System.out.println("Hạng trung bình");
        } else if (aboveAvg) {
            System.out.println("Hạng khá");
        } else {
            System.out.println("Hạng giỏi");
        }
    }
    public void cau2() {
        Scanner sc = new Scanner(System.in);
        double[] grades = new double[4];
        String[] subject = {"Toán", "văn", "lý", "hóa"};

        for(int i = 0; i < grades.length; i++) {
            System.out.printf("\nNhập điểm môn %s: ", subject[i]);
            grades[i] = sc.nextDouble();
        }
        averageAndRanking(grades[0], grades[1], grades[2], grades[3]);
    }
}
