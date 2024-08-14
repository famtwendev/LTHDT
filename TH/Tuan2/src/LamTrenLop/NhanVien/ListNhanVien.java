package LamTrenLop.NhanVien;

import java.util.Scanner;
import java.lang.System;
public class ListNhanVien {
    private NhanVien arr[];
    private int  soluong;
    public ListNhanVien(NhanVien[] arr, int soluong) {
        this.arr = arr;
        this.soluong = soluong;
    }
    public NhanVien[] getA() {
        return arr;
    }
    public void setA(NhanVien[] a) {
        this.arr = new NhanVien[100];
    }
    public int getSoluong() {
        return soluong;
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public NhanVien[] inputList()
    {
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Nhap so luong nhan vien: ");
            this.soluong = sc.nextInt();
            if(this.getSoluong() <= 0) System.out.println("Nhap so luong khong phu hop! Nhap lai danh sach.");
        }while(this.getSoluong() <= 0);
        setA(arr);
        System.out.println("\n======== Nhap thong tin nhan vien trong danh sach ========");
        for (int i = 0; i < this.soluong; i++)
        {
            arr[i] = new NhanVien(null,null,0,0);
            System.out.println("Nhap nhan vien thu " + i +": ");
            arr[i].input();
        }
        return arr;
    }
    public void outputList()
    {
        System.out.println("\n======== Xuat danh sach nhan vien da nhap ========");
        for(int i = 0; i < this.getSoluong(); i++)
        {
            System.out.println("Nhan vien thu " + i+":");
            arr[i].output();
        }
        System.out.println("\nCo "+this.getSoluong()+" nhan vien trong danh sach.");
    }
    public NhanVien HeSoLuongMax()
    {
        int j = 0;
        double max = arr[0].getHesoluong();

        for (int i = 1; i < this.getSoluong(); i++)
        {
            if (max < arr[i].getHesoluong())
            {
                max = arr[i].getHesoluong();
                j = i;
            }
        }
        return arr[j];
    }
}
