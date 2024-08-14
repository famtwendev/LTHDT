package Bai1_Xaydung;

import java.util.Scanner;

public class NhanVien extends ConNguoi
{
    protected double luong;
    protected String ngaynhanviec;
    protected PhongBanKhoa Pbk;
    public NhanVien() {
        super();
        this.luong = 0;
        this.ngaynhanviec = null;
        this.Pbk = new PhongBanKhoa();
    }
    public NhanVien(String hoten, int namsinh, double luong, String ngaynhanviec, String mapbk, String tenpbk) {
        super(hoten, namsinh);
        this.luong = luong;
        this.ngaynhanviec = ngaynhanviec;
        this.Pbk = new PhongBanKhoa(mapbk, tenpbk);
    }
    public NhanVien(NhanVien obj) {
        super(obj.hoten,obj.namsinh);
        this.luong = obj.luong;
        this.ngaynhanviec = obj.ngaynhanviec;
        this.Pbk = new PhongBanKhoa(obj.Pbk);
    }
    public double getLuong() {
        return luong;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }
    public String getNgaynhanviec() {
        return ngaynhanviec;
    }
    public void setNgaynhanviec(String ngaynhanviec) {
        this.ngaynhanviec = ngaynhanviec;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhap luong: ");
        setLuong(sc.nextDouble());
        sc.nextLine();
        System.out.println("Nhap ngay nhan viec: ");
        setNgaynhanviec(sc.nextLine());
        Pbk.input();
    }
    public void output()
    {
        System.out.printf("Nhan Vien    ||%-25s|Nam sinh: %-25d|Luong: %-25.2f |Ngay nhan viec: %-25s", this.getHoten(), this.getNamsinh(), this.getLuong(), this.getNgaynhanviec());
        Pbk.output();
    }
    @Override
    public String toString() {
        return "Nhan Vien  || Ho ten nhan vien: " + hoten  +
               "    Nam sinh: " + namsinh +
               "    Luong: " + luong +
               "    Ngay nhan viec: " + ngaynhanviec + Pbk;
    }
}
