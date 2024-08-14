package Baitap.NhanVien;

import java.util.Scanner;

public class NhanVienNghienCuu extends NhanVien
{
    private String truongdaotao, chuyenmon;
    private double phucapdh;
    public NhanVienNghienCuu(String manv, String tennv, int namsinh, String trinhdo, double luongcb, String truongdaotao, String chuyenmon, double phucapdh) {
        super(manv, tennv, namsinh, trinhdo, luongcb);
        this.truongdaotao = truongdaotao;
        this.chuyenmon = chuyenmon;
        this.phucapdh = phucapdh;
    }
    NhanVienNghienCuu()
    {
        super();
        truongdaotao = null;
        chuyenmon = null;
        phucapdh = 0;
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

    public double getPhucapdh() {
        return phucapdh;
    }

    public void setPhucapdh(double phucap) {
        this.phucapdh = phucap;
    }
    @Override
    double Salary()
    {
        double luong = this.getLuongcb() + this.getPhucapdh();
        return luong;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhap truong dao tao: ");
        setTruongdaotao(sc.nextLine());
        System.out.println("Nhap chuyen mon: ");
        setChuyenmon(sc.nextLine());
        System.out.println("Nhap phu cap doc hai: ");
        setPhucapdh(sc.nextDouble());
    }
    public void output()
    {
        super.output();
        System.out.print("     ||     Nhan vien Nghien Cuu:          Truong dao tao: " + truongdaotao + "        Chuyen mon: " + chuyenmon + "       Phu cap: " + phucapdh);
    }
}
