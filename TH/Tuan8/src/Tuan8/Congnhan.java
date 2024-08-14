package Tuan8;

import java.util.Scanner;

public class Congnhan extends Nhansu{
    private int namsinh,songaycong;

    public Congnhan() {
        super();
        this.namsinh = 0;
        this.songaycong = 0;
    }

    public Congnhan(String hovaten, String manhansu, int namsinh, int songaycong) {
        super(hovaten, manhansu);
        this.namsinh = namsinh;
        this.songaycong = songaycong;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public int getSongaycong() {
        return songaycong;
    }

    public void setSongaycong(int songaycong) {
        this.songaycong = songaycong;
    }

    @Override
    void phepTuNghiep() {
        System.out.println("Phep Tu Nghiep: Khong");
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nam sinh: ");
        this.setNamsinh(sc.nextInt());
        System.out.println("Nhap so ngay cong: ");
        this.setSongaycong(sc.nextInt());
    }
    public void output()
    {
        super.output();
        System.out.printf("Sinh nam: %-20d        So ngay cong: %-20d        ", this.getNamsinh(), this.getSongaycong());
        this.phepTuNghiep();
    }
}
