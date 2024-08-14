package Baitap.NhanVien;
import java.util.Scanner;

public class Main
{
    public static void Init(DSNhanVien ds, NhanVien h)
    {
        ds.themNV(new NhanVienPhucVu("PV01","Pham Ngoc My", 2000, "Bac 3", 21000));
        ds.themNV(new NhanvienQuanLy("QL01","Nguyen Thi Luu",1992,"Bac 1",26000,"Dai Hoc Hutech","Quan ly nha hang", 20000));
        ds.themNV(new NhanvienQuanLy("QL02","Tran Dung",1993,"Bac 3",30000,"Dai Hoc Da Lat","Quan ly khach san", 25000));
        ds.themNV(new NhanVienPhucVu("PV02","Le Tuan Tu", 2000, "Bac 3", 21000));
        ds.themNV(new NhanVienNghienCuu("NC02","Vo Tuan", 1989, "Bac 3",30000, "Dai hoc Nghe An", "Nghien Cuu va Kiem ke", 26000));
        ds.themNV(new NhanVienNghienCuu("NC01","Nguyen Thi Nhung", 1997, "Bac 2",21000, "Dai hoc Nghe", "Nghien Cuu va Kiem ke", 25000));
    }
    public static void main(String[] args)
    {
        byte chon ;
        Scanner sc = new Scanner(System.in);
        DSNhanVien ds = new DSNhanVien();
        NhanVien h = new NhanVien()
        {
            @Override
            double Salary()
            {
                return 0;
            }
        };
// ========== Init la phuong thuc ma em tao san danh sach de test file ==============
        Init(ds,h);
        do{
            System.out.println();
            System.out.println("============MENU==============");
            System.out.println("1. Them nhan vien vao danh sach");
            System.out.println("2. Xuat danh sach nhan vien");
            System.out.println("3. Xuat nhan vien theo chuc vu");
            System.out.println("4. Xuat bang luong cua cac nhan vien");
            System.out.println("0. Thoat");
            System.out.println("==============================");
            System.out.print("Chon chuc nang: "); chon = sc.nextByte();
            switch(chon)
            {
                case 1:
                    System.out.println("1. Them nhan Vien Quan Ly");
                    System.out.println("2. Them nhan Vien Nghien Cuu");
                    System.out.println("3. Them nhan Vien Phuc Vu");
                    System.out.println("==============================");
                    System.out.print("Chon chuc nang (1),(2),(3): ");
                    byte chucvu = sc.nextByte();
                    if(chucvu == 1)             h = new NhanvienQuanLy();
                    else if(chucvu == 2)        h = new NhanVienNghienCuu();
                    else if(chucvu == 3)        h = new NhanVienPhucVu();
                    h.input();
                    ds.themNV(h);
                    break;
                case 2:
                    System.out.println("2. Xuat danh sach nhan vien");
                    ds.outputds();
                    break;
                case 3:
                System.out.print("3. Xuat danh sach nhan vien theo chuc vu: [1:Quan Ly, 2:Nghien Cuu, 3:Phuc Vu]: ");
                    byte temp = sc.nextByte();
                    ds.xuatDSTheoChucVu(temp);
                    break;
                case 4:
                    System.out.println("3. BANG LUONG NHAN VIEN ");
                    ds.XuatLuongNhanVien();
                    break;
                default: chon = 0;
            }
        }while(chon !=0);
    }
}
