package Bai3_NangCao;
import Bai1_Xaydung.NhanVien;

import java.util.Scanner;

public class NVChatLuongCao extends NhanVien {
    protected String trinhdo;
    protected String nganh;
    protected String noidaotao;



    public NVChatLuongCao() {
        super();
        this.trinhdo = null;
        this.nganh = null;
        this.noidaotao = null;
    }

    NVChatLuongCao(String hoten, int namsinh, double luong, String ngaynhanviec, String mapbk, String tenpbk, String trinhdo, String nganh, String noidaotao) {
        super(hoten, namsinh, luong, ngaynhanviec, mapbk, tenpbk);
        this.trinhdo = trinhdo;
        this.nganh = nganh;
        this.noidaotao = noidaotao;
    }

//    NVChatLuongCao(NVChatLuongCao obj) {
//        super(obj);
//        this.trinhdo = obj.trinhdo;
//        this.nganh = obj.nganh;
//        this.noidaotao = obj.noidaotao;
//    }
    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getNoidaotao() {
        return noidaotao;
    }

    public void setNoidaotao(String noidaotao) {
        this.noidaotao = noidaotao;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        super.input();
        sc.nextLine();
        System.out.println("Nhap trinh do: ");
        setTrinhdo(sc.nextLine());
        System.out.println("Nhap nganh: ");
        setNganh(sc.nextLine());
        System.out.println("Nhap noi dao tao: ");
        setNoidaotao(sc.nextLine());
    }
    public void output()
    {
        super.output();
        System.out.printf("|Trinh do: %-25s|Nganh: %-25s|Noi dao tao: %-25s       ", this.getTrinhdo(), this.getNganh(),this.getNoidaotao());
    }
}
