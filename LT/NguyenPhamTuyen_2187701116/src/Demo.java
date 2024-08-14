import java.util.Scanner;
public class Demo {
    public static void XuatHesoluong3NV(NhanVien a, NhanVien b, NhanVien c) {
        System.out.println("\nThong tin nhan vien co he so luong cao nhat la:");
        double maxx = Math.max(a.getHesoluong(), b.getHesoluong());
        maxx = Math.max(maxx, c.getHesoluong());
        if (maxx == a.getHesoluong())
            a.output();
        if (maxx == b.getHesoluong())
            b.output();
        if (maxx == c.getHesoluong())
            c.output();
    }

    public static void main(String[] args) {
//  Nhap 3 doi tuong Nhan vien bang 3 cach khac nhau.
        NhanVien a = new NhanVien("A1", "Nguyen Pham Tuyen", 21000, 2);
        NhanVien b = new NhanVien("A2", "Nguyen Tung Duong", a.getLuongcb(), a.getHesoluong());
        NhanVien d = a;
        // Nhap du lieu cho 1 nhan vien tu ban phim
        NhanVien c = new NhanVien(null, null, 0, 0);
        c.input();
        a.output();
        b.output();
        c.output();

        // Thay doi ho ten cho nhan vien vua nhap
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten muon thay doi: ");
        String hotenmoi = sc.nextLine();
        c.setHoten(hotenmoi);

        // In thong tin nhan vien co he so luong cao nhat trong 3 nhan vien vua nhap
        XuatHesoluong3NV(a, b, c);

//  Nhap danh sach Nhan Vien
        ListNhanVien phong1 = new ListNhanVien(null, 0);
        phong1.inputList();
        phong1.outputList();
    }
}




/*        if (phong1.getSoluong() == 1) {
                System.out.println("\nDanh sach chi co duy nhat 1 nhan vien!");
                } else
                {
                System.out.println("\nThong tin nhan vien co he so luong cao nhat la: ");
                phong1.HeSoLuongMax().output();
                }

*/
