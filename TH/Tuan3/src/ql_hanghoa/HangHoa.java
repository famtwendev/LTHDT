package ql_hanghoa;

import java.util.Scanner;
import java.util.*;
public class HangHoa
{
    protected String mahang;
    protected String tenhang;
    protected String nhasanxuat;
    protected int gia;
    HangHoa()
    {
        mahang = null;
        tenhang = null;
        nhasanxuat = null;
        gia = 0;
    }
    HangHoa(String mahang, String tenhang, String nhasanxuat, int gia){
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.nhasanxuat = nhasanxuat;
        this.gia = gia;
    }
    HangHoa(HangHoa obj)
    {
        this.mahang = obj.mahang;
        this.tenhang = obj.tenhang;
        this.nhasanxuat = obj.nhasanxuat;
        this.gia = obj.gia;
    }
    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public String getNhasanxuat() {
        return nhasanxuat;
    }

    public void setNhasanxuat(String nhasanxuat) {
        this.nhasanxuat = nhasanxuat;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia)
    {
        this.gia = gia;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang hoa: ");
        setMahang(sc.nextLine());
        System.out.println("Nhap ten hang: ");
        setTenhang(sc.nextLine());
        System.out.println("Nhap nha san xuat: ");
        setNhasanxuat(sc.nextLine());
        System.out.println("Nhap gia: ");
        setGia(sc.nextInt());
    }
    public void output()
    {
        System.out.print("Ma hang: " + this.getMahang() + "      Ten hang: " + this.getTenhang() + "            Nha san xuat: " + this.getNhasanxuat() + "      Gia: " + this.getGia() );
    }
}
