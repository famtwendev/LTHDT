package Tuan8;

import java.util.Scanner;

public class PhongBan {
    protected String maPhongBan, tenPhongBan;

    public PhongBan() {
        this.maPhongBan = null;
        this.tenPhongBan = null;
    }
    public PhongBan(String maPhongBan, String tenPhongBan) {
        this.maPhongBan = maPhongBan;
        this.tenPhongBan = tenPhongBan;
    }

    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public String getMaPhongBan() {
        return maPhongBan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ma Phong/Ban: ");
        this.setMaPhongBan(sc.nextLine());
        System.out.println("Nhap Ten Phong/Ban: ");
        this.setTenPhongBan(sc.nextLine());
    }
    public void output()
    {
        System.out.printf("Ma Phong/Ban: %-20s        Ten Phong/Ban: %-20s        ",this.getMaPhongBan(),this.getTenPhongBan());
    }
}
