package Tuan8;

import java.util.Scanner;

public abstract class ChuyenVien extends Cotaynghe{
    protected String gioitinh;
    protected PhongBan pb;
    public ChuyenVien() {
        super();
        this.gioitinh = gioitinh;
        this.pb = null;
    }
    public ChuyenVien(String hovaten, String manhansu, String chuyennganh, String trinhdo, String gioitinh, PhongBan pb) {
        super(hovaten, manhansu, chuyennganh, trinhdo);
        this.gioitinh = gioitinh;
        this.pb = pb;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public PhongBan getPb() {
        return pb;
    }

    public void setPb(PhongBan pb) {
        this.pb = pb;
    }

    public void input()
    {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Gioi tinh: ");
        this.setGioitinh(sc.nextLine());
        PhongBan temp = new PhongBan();
        System.out.println("Nhap Phong Ban: ");
        temp.input();
        this.setPb(temp);
    }
    public void output() {
        super.output();
        System.out.printf("Gioi tinh: %-20s        ",this.getGioitinh());
        pb.output();
    }
}
