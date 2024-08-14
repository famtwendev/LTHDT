package Bai1_Xaydung;

import java.util.Scanner;

public class PhongBanKhoa {
    private String MaPBK;
    private String TenPBK;

    public PhongBanKhoa() {
        MaPBK = null;
        TenPBK = null;
    }
    public PhongBanKhoa(String maPBK, String tenPBK) {
        MaPBK = maPBK;
        TenPBK = tenPBK;
    }
    public PhongBanKhoa(PhongBanKhoa obj) {
        MaPBK = obj.MaPBK;
        TenPBK = obj.TenPBK;
    }
    public String getMaPBK() {
        return MaPBK;
    }

    public void setMaPBK(String maPBK) {
        MaPBK = maPBK;
    }

    public String getTenPBK() {
        return TenPBK;
    }

    public void setTenPBK(String tenPBK) {
        TenPBK = tenPBK;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma phong ban khoa: ");
        setMaPBK(sc.nextLine());
        System.out.println("Nhap ten phong ban khoa: ");
        setTenPBK(sc.nextLine());
    }
    public void output()
    {
        System.out.printf("|Ma PB: %-25s|Ten PB: %-25s",getMaPBK(),getTenPBK());
    }

    @Override
    public String toString() {
        return "        Phong Ban Khoa: " +
                "       Ma PBK: " + MaPBK +
                "       Ten PBK: " + TenPBK;
    }
}
