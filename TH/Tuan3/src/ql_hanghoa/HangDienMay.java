package ql_hanghoa;
import java.util.Scanner;
import java.util.*;
class HangDienMay extends HangHoa {
    private int thoigianbh;
    private double congsuat;
    private double dienap;
    HangDienMay()
    {
        super();
        thoigianbh = 0;
        dienap = 0;
        congsuat = 0;
    }
    HangDienMay(String mahang, String tenhang, String nhasanxuat, int gia, int thoigianbh, double congsuat, double dienap)
    {
        super(mahang, tenhang, nhasanxuat, gia);
        this.thoigianbh = thoigianbh;
        this.congsuat = congsuat;
        this.dienap = dienap;
    }
    HangDienMay(HangDienMay obj){
        super( obj.mahang,  obj.tenhang, obj.nhasanxuat,  obj.gia);
        this.thoigianbh = obj.thoigianbh;
        this.dienap = obj.dienap;
        this.congsuat = obj.congsuat;
    }
    public int getThoigianbh() {
        return thoigianbh;
    }

    public void setThoigianbh(int thoigianbh) {
        this.thoigianbh = thoigianbh;
    }

    public double getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(double congsuat) {
        this.congsuat = congsuat;
    }

    public double getDienap() {
        return dienap;
    }

    public void setDienap(double dienap) {
        this.dienap = dienap;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhap thoi gian bao hanh(dd/mm/yyyy): ");
        setThoigianbh(sc.nextInt());
        System.out.println("Nhap cong suat: ");
        setCongsuat(sc.nextDouble());
        System.out.println("Nhap dien ap: ");
        setDienap(sc.nextDouble());
    }
    public void output() {
        super.output();
        System.out.print("\nHang Dien May:       ");
        System.out.print("      Thoi gian bao hanh: "+ this.thoigianbh + "      Cong suat: " + this.getCongsuat() + " W      Dien ap: " + this.dienap);
    }
}
