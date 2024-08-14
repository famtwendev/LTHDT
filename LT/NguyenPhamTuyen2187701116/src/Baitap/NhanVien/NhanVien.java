package Baitap.NhanVien;

import java.util.Scanner;

public abstract class NhanVien
{
    protected  String manv;
     protected String tennv;
    protected int namsinh;
    protected String trinhdo;
    protected double luongcb;
    abstract  double Salary();
    public NhanVien(String manv, String tennv, int namsinh, String trinhdo, double luongcb) {
        this.manv = manv;
        this.tennv = tennv;
        this.namsinh = namsinh;
        this.trinhdo = trinhdo;
        this.luongcb = luongcb;
    }
    NhanVien()
    {
        manv = null;
        tennv = null;
        namsinh = 0;
        trinhdo = null;
        luongcb = 0;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    public double getLuongcb() {
        return luongcb;
    }

    public void setLuongcb(double luongcb) {
        this.luongcb = luongcb;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien: ");
        setManv(sc.nextLine());
        System.out.println("Nhap ten nhan vien: ");
        setTennv(sc.nextLine());
        System.out.println("Nhap nam sinh nhan vien: ");
        setNamsinh(sc.nextInt());
        System.out.println("Nhap trinh do nhan vien: ");
        sc.nextLine();
        setTrinhdo(sc.nextLine());
        System.out.println("Nhap luong can ban: ");
        setLuongcb(sc.nextDouble());
    }
    public void output()
    {
        System.out.print("\nMa nhan vien: " + this.getManv() +"      Ho ten: " + this.getTennv() + "       Nam sinh: " + this.getNamsinh() + "       Trinh do: "+ this.getTrinhdo() +"        luong co ban: " + this.getLuongcb() );
    }
}
