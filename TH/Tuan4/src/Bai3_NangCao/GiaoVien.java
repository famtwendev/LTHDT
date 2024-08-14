package Bai3_NangCao;

import java.util.Scanner;

public class GiaoVien extends NVChatLuongCao{
    private double thuLaoGD;
    public GiaoVien() {
        super();
        this.thuLaoGD = 0;
    }
    public GiaoVien(String hoten, int namsinh, double luong, String ngaynhanviec, String mapbk, String tenpbk, String trinhdo, String nganh, String noidaotao, double thuLaoGD) {
        super(hoten, namsinh, luong, ngaynhanviec, mapbk, tenpbk, trinhdo, nganh, noidaotao);
        this.thuLaoGD = thuLaoGD;
    }
    public double getThuLaoGD() {
        return thuLaoGD;
    }
    public void setThuLaoGD(double thuLaoGD) {
        this.thuLaoGD = thuLaoGD;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhap thu lao giao duc: ");
        setThuLaoGD(sc.nextDouble());
    }
    public void output()
    {
        super.output();
        System.out.printf("|Thu Lao GD: %-20f    ", this.getThuLaoGD());
    }
}
