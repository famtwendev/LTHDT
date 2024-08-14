import java.util.ArrayList;
import java.util.Scanner;

public class GiaoDich
{
    protected String maso, ngaythuchien;

    public GiaoDich() {
        this.maso = null;
        this.ngaythuchien = null;
    }
    GiaoDich(String maso, String ngaythuchien)
    {
        this.maso = maso;
        this.ngaythuchien = ngaythuchien;
    }
    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getNgaythuchien() {
        return ngaythuchien;
    }
    public void setNgaythuchien(String ngaythuchien) {
        this.ngaythuchien = ngaythuchien;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma so: ");
        this.setMaso(sc.nextLine());
        System.out.println("Nhap ngay thuc hien: ");
        this.setNgaythuchien(sc.nextLine());
    }
    public void output()
    {
        System.out.printf("Ma so: %-20s     Ngay thuc hien: %-20s",this.getMaso(),this.getNgaythuchien());
    }
}
