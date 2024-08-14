import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        Esclip es = new Esclip();
        TamGiac tg = new TamGiac();
        HinhVuong hv = new HinhVuong();
        HinhChuNhat cn = new HinhChuNhat();
        System.out.println("===========================");
        System.out.println("Nhap hinh esclip");
        es.input();
        System.out.println("Chu vi: " + es.chuVi());
        System.out.println("Dien tich : " + es.dienTich());
        System.out.println("===========================");

        System.out.println("Nhap tam giac");
        tg.input();
        System.out.println("Chu vi: " + tg.chuVi());
        System.out.println("Dien tich : " + tg.dienTich());
        System.out.println("===========================");
        System.out.println("Nhap hinh vuong");
        hv.input();
        System.out.println("Chu vi: " + hv.chuVi());
        System.out.println("Dien tich : " + hv.dienTich());
        System.out.println("===========================");
        System.out.println("Nhap hinh chu nhat");
        cn.input();
        System.out.println("Chu vi: " + cn.chuVi());
        System.out.println("Dien tich : " + cn.dienTich());
    }
}
