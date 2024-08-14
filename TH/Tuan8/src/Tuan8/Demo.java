package Tuan8;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        byte chon ;
        Scanner x = new Scanner(System.in);
        DSDT ds = new DSDT();
        ds.Init();
        Nhansu h;
        do{
            System.out.println();
            System.out.println("============MENU==============");
            System.out.println("1. Them nhan su vao danh sach");
            System.out.println("2. Xuat nhan su theo doi tuong");
            System.out.println("3. Xep danh sach theo thu tu ten");
            System.out.println("4. Xuat thong tin nhung nhan su co trong danh sach");
            System.out.println("5. Tim thong tin nhan su");
            System.out.println("6. Xoa nhan su khoi danh sach");
            System.out.println("0. Thoat");
            System.out.println("==============================");
            System.out.print("Chon chuc nang: "); chon = x.nextByte();

            switch(chon)
            {
                case 1:
                    System.out.println("============MENU==============");
                    System.out.println("1. Nhap mot cong nhan");
                    System.out.println("2. Nhap mot nhan su van phong");
                    System.out.println("3. Nhap mot nhan su ky thuat");
                    System.out.println("==============================");
                    System.out.print("Chon chuc nang: ");
                    byte loai = x.nextByte();
                    if(loai == 1) h = new Congnhan();
                    else if(loai == 2) h = new VanPhong();
                    else h = new KyThuat();
                    h.input();
                    ds.CapNhatThemDT(h);
                    break;
                case 2:
                    System.out.print("2. Xuat danh sach nguoi theo chuc vu[Cong Nhan(1), Nhan Vien Van Phong(2), Nhan Vien Ky Thuat(3)]: ");
                    byte loaicv = x.nextByte();
                    ds.xuatDSTheoLoai(loaicv);
                    break;

                case 3:
                    System.out.println("Xep danh sach thu tu ten trong danh sach");
                    ds.SapxepTen();
                    break;
                case 4:
                    System.out.println("Xuat thong tin nhung nguoi co trong danh sach");
                    ds.output();
                    break;
                case 5:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Nhap ten nhan vien can tim kiem thong tin: ");
                    String tentemp  = sc.nextLine();
                    ds.TimKiemThongTin(tentemp);
                    break;
                case 6:
                    sc = new Scanner(System.in);
                    System.out.println("Nhap ten nhan vien can xoa khoi danh sach: ");
                    String tenmuonxoa = sc.nextLine();
                    ds.XoaNhanSu(tenmuonxoa);
                    break;
                default: chon = 0;
            }
        }while(chon !=0);
    }
}
