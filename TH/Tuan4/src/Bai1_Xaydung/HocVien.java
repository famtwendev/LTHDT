package Bai1_Xaydung;

import java.util.Scanner;

public class HocVien extends ConNguoi{
   private double diem1;
    private double diem2;
    private double diem3;
    public HocVien()
    {
        super();
        this.diem1 = 0;
        this.diem2 = 0;
        this.diem3 = 0;
    }
    public HocVien(String hoten, int namsinh, double diem1, double diem2, double diem3) {
        super(hoten, namsinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public HocVien(HocVien obj) {
        super(obj.hoten,obj.namsinh);
        this.diem1 = obj.diem1;
        this.diem2 = obj.diem2;
        this.diem3 = obj.diem3;
    }
    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public double getDiem3() {
        return diem3;
    }

    public void setDiem3(double diem3) {
        this.diem3 = diem3;
    }
    public void input()
    {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem 1: ");
        setDiem1(sc.nextDouble());
        System.out.println("Nhap diem 2: ");
        setDiem2(sc.nextDouble());
        System.out.println("Nhap diem 3: ");
        setDiem3(sc.nextDouble());
    }
    public void output()
    {
        System.out.printf("Hoc Vien     ||%-25s|Nam sinh: %-25d|Diem 1: %-25.2f|Diem 2: %-30.2f   |Diem 3: %-25.2f", this.getHoten(),this.getNamsinh(),this.getDiem1(),this.getDiem2(),this.getDiem3());
    }
    @Override
    public String toString() {
        return "Hoc Vien ||     Ho ten: " + hoten  + "       Nam sinh: " + namsinh + "       Diem 1 = " + diem1 + "       Diem 2 = " + diem2 + "       Diem 3 = " + diem3;
    }
}
