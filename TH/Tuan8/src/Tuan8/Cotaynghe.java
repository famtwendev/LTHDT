package Tuan8;

import java.util.Scanner;

public class Cotaynghe extends Nhansu{
    protected String chuyennganh, trinhdo;

    public Cotaynghe() {
        super();
        this.chuyennganh = null;
        this.trinhdo = null;
    }

    public Cotaynghe(String hovaten, String manhansu, String chuyennganh, String trinhdo) {
        super(hovaten, manhansu);
        this.chuyennganh = chuyennganh;
        this.trinhdo = trinhdo;
    }

    public String getChuyennganh() {
        return chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
        this.chuyennganh = chuyennganh;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }
    public void input()
    {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuyen nganh: ");
        this.setChuyennganh(sc.nextLine());
        System.out.println("Nhap trinh do: ");
        this.setTrinhdo(sc.nextLine());
    }
    @Override
    void phepTuNghiep() {
    }
    public void output()
    {
        super.output();
        System.out.printf("Chuyen Nganh: %-20s        Trinh Do: %-20s",this.getChuyennganh(),this.getTrinhdo()        );
        this.phepTuNghiep();
    }
}
