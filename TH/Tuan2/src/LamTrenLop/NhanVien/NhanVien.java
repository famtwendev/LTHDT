package LamTrenLop.NhanVien;

import java.util.Scanner;

public class NhanVien {

    private String id;
    private String hoten;
    private double luongcb;
    private double hesoluong;
    public NhanVien(String id, String hoten, double luongcb, double hesoluong)
    {
        this.id = id;
        this.hoten = hoten;
        this.luongcb = luongcb;
        this.hesoluong = hesoluong;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getLuongcb() {
        return luongcb;
    }

    public void setLuongcb(double luongcb) {
        this.luongcb = luongcb;
    }

    public double getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma so: ");
        this.id = sc.nextLine();
        System.out.println("Nhap ho ten nhan vien: ");
        this.hoten = sc.nextLine();
        System.out.println("Nhap luong co ban: ");
        this.luongcb = sc.nextDouble();
        System.out.println("Nhap he so luong: ");
        this.hesoluong = sc.nextDouble();
    }

    public void output()
    {
        System.out.println("Nhan Vien:           " +  "ID: " + id + "    Name: " + hoten + "    Luong co ban: " + luongcb + "    He so luong: " + hesoluong );
        System.out.println("Luong thuc te sau khi tinh: " + this.TinhLuong());
    }
    public double TinhLuong()
    {
        double luongne = this.luongcb * this.hesoluong;
        return luongne;
    }
}
