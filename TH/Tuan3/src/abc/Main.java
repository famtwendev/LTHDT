package abc;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        byte chon ;
        Scanner x = new Scanner(System.in);
        DSNhanVien ds = new DSNhanVien();
        NhanVien h = new NhanVien() {
            @Override
            double Salary() {
                return 0;
            }
        };
        ds.Init();
        do{
            System.out.println();
            System.out.println("============MENU==============");
            System.out.println("1. Them mot nhan vien vao danh sach");
            System.out.println("2. Xuat mat hang theo loai");
            System.out.println("0. Thoat");
            System.out.println("==============================");
            System.out.print("Chon chuc nang: "); chon = x.nextByte();

            switch(chon)
            {
                case 1:
                    System.out.println("============MENU==============");
                    System.out.println("1. Nhan Vien Quan Ly");
                    System.out.println("2. Nhan Vien Nghien Cuu");
                    System.out.println("3. Nhan Vien Phuc Vu");
                    System.out.println("==============================");
                    System.out.print("Chon chuc nang: ");
                    byte chucvu = x.nextByte();
                         if(chucvu == 1)        h = new NhanvienQuanLy();
                    else if(chucvu == 2)        h = new NhanVienNghienCuu();
                    else if(chucvu == 3)        h = new NhanVienPhucVu();
                    h.input();
                    ds.themMH(h);
                    break;
                case 2:
                    System.out.print("2. Xuat danh sach nhan vien theo chuc vu: [1:Quan Ly, 2:Nghien Cuu, 3:Phuc Vu]: ");
                    byte loaiHM = x.nextByte();
                    ds.xuatDSTheoLoai(loaiHM);
                    break;
                default: chon = 0;
            }
        }while(chon !=0);
    }
}
