package Bai1_Xaydung;

import java.util.Scanner;

public class ConNguoi {
    protected String hoten;
    protected int namsinh;
    public ConNguoi(String hoten, int namsinh) {
        this.hoten = hoten;
        this.namsinh = namsinh;
    }
    ConNguoi() {
        this.hoten = null;
        this.namsinh = 0;
    }
    ConNguoi(ConNguoi obj) {
        this.hoten = obj.hoten;
        this.namsinh = obj.namsinh;
    }
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }
    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
    public String Tachten(String hovaten)
    {
        hovaten.trim();
        String temp =  hovaten.substring(hovaten.lastIndexOf(" "));
        return temp;
    }
    public String TachDem(String hovaten)
    {
        hovaten.trim();
        String temp =  hovaten.substring(hovaten.indexOf(" "),hovaten.lastIndexOf(" "));
        return temp;
    }
    public String TachHo(String hovaten)
    {
        hovaten.trim();
        String temp =  hovaten.substring(0, hovaten.indexOf(" "));
        return temp;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        setHoten(sc.nextLine());
        System.out.println("Nhap nam sinh: ");
        setNamsinh(sc.nextInt());
    }
    public void output()
    {
        System.out.printf("%-20s|%-20s",this.getHoten(),this.getNamsinh());
    }
    @Override
    public String toString() {
        return "Ho ten:" + hoten + "        Nam sinh: " + namsinh ;
    }
}
