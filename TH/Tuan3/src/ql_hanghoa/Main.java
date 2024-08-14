package ql_hanghoa;

import java.util.Scanner;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        byte chon ;
        Scanner x = new Scanner(System.in);
        DanhSachHangHoa dshh = new DanhSachHangHoa();
        HangHoa h;
        dshh.Init();
        do{
            System.out.println();
            System.out.println("============MENU==============");
            System.out.println("1. Them mot mat hang vao danh sach");
            System.out.println("2. Xuat mat hang theo loai");
            System.out.println("0. Thoat");
            System.out.println("==============================");
            System.out.print("Chon chuc nang: "); chon = x.nextByte();

            switch(chon)
            {
                case 1:
                    System.out.println("============MENU==============");
                    System.out.println("1. Mat hang dien may");
                    System.out.println("2. Mat hang thuc pham");
                    System.out.println("3. Mat hang sanh su");
                    System.out.println("==============================");
                    System.out.print("Chon chuc nang: ");
                    byte loai = x.nextByte();
                    if(loai == 1) h = new HangDienMay();
                    else if(loai == 2) h = new HangThucPham();
                    else h = new HangSanhSu();
                    h.input();
                    dshh.themMH(h);
                    break;

                case 2:
                    System.out.print("2. Xuat danh sach mat hang theo loai[1:Hang Dien May, 2:Hang Thuc Pham, 3:Hang Sanh Su]: ");
                    byte loaiHM = x.nextByte();
                    dshh.xuatDSTheoLoai(loaiHM);
                    break;
                default: chon = 0;
            }
        }while(chon !=0);
    }

}
