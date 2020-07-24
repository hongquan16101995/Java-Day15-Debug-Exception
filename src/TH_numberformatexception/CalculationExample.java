package TH_numberformatexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        CalculationExample calc = new CalculationExample();
        try {
            calc.Calculate();
        }
        catch (InputMismatchException e){
            System.out.println("Xảy ra ngoại lệ: Bạn đã nhập sai dữ liệu");
        } finally {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Hãy nhập y: ");
                int y = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Xảy ra ngoại lệ: Bạn đã nhập sai dữ liệu");
            }
        }

    }

    private void Calculate() throws InputMismatchException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        Cal(x, y);
    }

    private void Cal(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (ArithmeticException e){
            System.out.println("Xảy ra ngoại lệ : " + e.getMessage());
        }
    }
}
