package BT_illegaltriangleexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        IllegalTriangleException ex = new IllegalTriangleException();
        try {
            ex.Calculate();
        }
        catch (InputMismatchException e){
            System.out.println("Xảy ra ngoại lệ: Bạn đã nhập sai dữ liệu");
        };
    }

    private void Calculate(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hãy nhập x: ");
            int x = scanner.nextInt();
            System.out.println("Hãy nhập y: ");
            int y = scanner.nextInt();
            System.out.println("Hãy nhập z: ");
            int z = scanner.nextInt();
            if(x < 0 || y < 0 || z < 0) throw new InputMismatchException();
            Cal(x,y,z);
    }

    private void Cal(int x, int y, int z){
        try {
            if(x + y <= z || x + z <= y || z + y <= x) throw new InputMismatchException();
        }
        catch (InputMismatchException e) {
            System.out.println("Xảy ra ngoại lệ: Bạn đã nhập sai dữ liệu");
        }
    }
}
