package Bai3_NangCao;

import Bai1_Xaydung.ConNguoi;
import Bai1_Xaydung.HocVien;

import java.util.Scanner;
public class Demo3
{
    public static void main(String[] args)
    {
        byte chon ;
        Scanner x = new Scanner(System.in);
        DSNC ds = new DSNC();
        ConNguoi h;
        ds.Init();
        do{
            System.out.println();
            System.out.println("============MENU==============");
            System.out.println("1. Them nguoi vao danh sach");
            System.out.println("2. Xuat nguoi theo chuc vu");
            System.out.println("3. Xep danh sach theo thu tu ten");
            System.out.println("4. Xuat thong tin nhung nguoi co trong danh sach");
            System.out.println("0. Thoat");
            System.out.println("==============================");
            System.out.print("Chon chuc nang: "); chon = x.nextByte();

            switch(chon)
            {
                case 1:
                    System.out.println("============MENU==============");
                    System.out.println("1. Nhap mot hoc vien");
                    System.out.println("2. Nhap mot nhan vien quan li");
                    System.out.println("3. Nhap mot giao vien");
                    System.out.println("==============================");
                    System.out.print("Chon chuc nang: ");
                    byte loai = x.nextByte();
                    if(loai == 1) h = new HocVien();
                    else if(loai == 2) h = new NVquanly();
                    else h = new GiaoVien();
                    h.input();
                    ds.themCV(h);
                    break;

                case 2:
                    System.out.print("2. Xuat danh sach nguoi theo chuc vu[Hoc Vien(1), Nhan Vien quan ly(2), Giao Vien(3)]: ");
                    byte loaicv = x.nextByte();
                    ds.xuatDSTheoLoai(loaicv);
                    break;

                case 3:
                    System.out.println("3. Xep danh sach thu tu ten trong danh sach");
                    ds.stringgCHuoi();
                    break;
                case 4:
                    System.out.println("4. Xuat thong tin nhung nguoi co trong danh sach");
                    ds.output();
                    break;
                default: chon = 0;
            }
        }while(chon !=0);
    }

}
