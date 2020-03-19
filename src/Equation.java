import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình bậc 1");
        System.out.println("Nhập vào các hằng số của phương trình 'a * x + b = c'");
        System.out.println("Nhập vào số a: ");
        a = scanner.nextDouble();
        System.out.println("Nhập vào số b: ");
        b = scanner.nextDouble();
        System.out.println("Nhập vào số c: ");
        c = scanner.nextDouble();
        if (a != 0) {
            double solution = (c - b) / a;
            System.out.printf("Nghiệm của phương trình là: %f!\n", solution);
        } else {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm!");
            } else {
                System.out.print("Phương trình vô nghiệm!");
            }
        }
    }
}
