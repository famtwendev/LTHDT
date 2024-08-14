import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte chonn;
        DanhMucTK dm1 = new DanhMucTK();
        TKLAZADA now;
        dm1.Init();
        do {
            System.out.println("===================================");
            System.out.println("1:Them tai khoan lazada");
            System.out.println("2:Xuat tai khoan lazada");
            System.out.println("0:Thoat");
            chonn = sc.nextByte();
            if (chonn == 1) {
                now = new TKLAZADA();
                now.input();
                dm1.themTK(now);
            }
            if (chonn == 2)
                dm1.output();
        } while (chonn != 0);
    }
}
