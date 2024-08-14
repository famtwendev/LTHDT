package Baitap.NhanVien;

import java.util.Scanner;

public class NhanvienQuanLy extends NhanVien
{
    private String truongdaotao, chuyenmon;
    private double phucapcv;
    NhanvienQuanLy()
    {
        super();
        truongdaotao = null;
        chuyenmon = null;
        phucapcv = 0;
    }
    public NhanvienQuanLy(String manv, String tennv, int namsinh, String trinhdo, double luongcb, String truongdaotao, String chuyenmon, double phucapcv)
    {
        super(manv, tennv, namsinh, trinhdo, luongcb);
        this.truongdaotao = truongdaotao;
        this.chuyenmon = chuyenmon;
        this.phucapcv = phucapcv;
    }
    public String getTruongdaotao() {
        return truongdaotao;
    }
    public void setTruongdaotao(String truongdaotao) {
        this.truongdaotao = truongdaotao;
    }

    public String getChuyenmon() {
        return chuyenmon;
    }

    public void setChuyenmon(String chuyenmon) {
        this.chuyenmon = chuyenmon;
    }

    public double getPhucapcv() {
        return phucapcv;
    }

    public void setPhucapcv(double phucap) {
        this.phucapcv = phucap;
    }
    @Override
    double Salary()
    {
        double  luong = this.getLuongcb() + this.getPhucapcv();
        return luong;
    }
    @Override
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhap truong dao tao: ");
        setTruongdaotao(sc.nextLine());
        System.out.println("Nhap chuyen mon: ");
        setChuyenmon(sc.nextLine());
        System.out.println("Nhap phu cap chuc vu: ");
        setPhucapcv(sc.nextDouble());
    }
    public void output()
    {
        super.output();
        System.out.print("     ||     Nhan vien Quan Ly:          Truong dao tao: " + truongdaotao + "        Chuyen mon: " + chuyenmon + "       Phu cap: " + phucapcv);
    }
}
