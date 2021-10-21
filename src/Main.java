import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn bài: ");
        System.out.println("1: Nhập vào 3 cạnh của tam giác, kiểm tra có là tam giác không? Có thì là loại nào?");
        System.out.println("2: Nhập điểm của học sinh A gồm 4 môn: Toán, văn, lý, hóa, tính trung bình cộng 4 điểm đó");
        System.out.println("3: Giải phương trình bậc 2: ax2 + bx + c = 0 với a != 0");
        System.out.print("Nhập lựa chọn (1, 2, 3): ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Triangle cau1 = new Triangle();
                cau1.cau1();
                break;
            case 2:
                Grades cau2 = new Grades();
                cau2.cau2();
                break;
            case 3:
                QuadraticEquation cau3 = new QuadraticEquation();
                cau3.cau3();
                break;
        }


    }
}
