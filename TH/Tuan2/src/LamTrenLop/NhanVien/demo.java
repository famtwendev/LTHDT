package LamTrenLop.NhanVien;

public class demo {

    public static void main(String[] args) {
//  Nhap 3 doi tuong Nhan vien bang 3 cach khac nhau.
        NhanVien a = new NhanVien("A1", "Nguyen Pham Tuyen", 21000, 2);
        // Nhap du lieu cho 1 nhan vien tu ban phim
        NhanVien b = new NhanVien(null, null, 0, 0);
        b.input();
        a.output();
        b.output();
//  Nhap danh sach Nhan Vien
        ListNhanVien phong1 = new ListNhanVien(null, 0);
        phong1.inputList();
        phong1.outputList();
        if (phong1.getSoluong() == 1) {
            System.out.println("\nDanh sach chi co duy nhat 1 nhan vien!");
        } else
        {
            System.out.println("\nThong tin nhan vien co he so luong cao nhat la: ");
            phong1.HeSoLuongMax().output();
        }
    }
}
