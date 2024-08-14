package Bai3_NangCao;

import java.util.Scanner;

public class NVquanly extends NVChatLuongCao{
    private double phucapCV;
        public NVquanly() {
        super();
        this.phucapCV = 0;
    }
    public NVquanly(String hoten, int namsinh, double luong, String ngaynhanviec, String mapbk, String tenpbk, String trinhdo, String nganh, String noidaotao, double phucapCV) {
        super(hoten, namsinh, luong, ngaynhanviec, mapbk, tenpbk, trinhdo, nganh, noidaotao);
        this.phucapCV = phucapCV;
    }
    public double getPhucapCV() {
        return phucapCV;
    }

    public void setPhucapCV(double phucapCV) {
        this.phucapCV = phucapCV;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhap phu cap cong viec: ");
        setPhucapCV(sc.nextDouble());
    }
    public void output()
    {
        super.output();
        System.out.printf("|Phu Cap CV: %-20f    ", this.getPhucapCV());
    }
}
