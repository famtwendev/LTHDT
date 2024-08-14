package Tuan8;

import java.util.Scanner;

public abstract class Nhansu {
    protected String Hovaten, Manhansu;
    abstract void phepTuNghiep();
    public Nhansu() {
        Hovaten = null;
        Manhansu = null;
    }
    public Nhansu(String hovaten, String manhansu) {
        Hovaten = hovaten;
        Manhansu = manhansu;
    }

    public String getHovaten() {
        return Hovaten;
    }

    public void setHovaten(String hovaten) {
        Hovaten = hovaten;
    }

    public String getManhansu() {
        return Manhansu;
    }

    public void setManhansu(String manhansu) {
        Manhansu = manhansu;
    }
    public String Tachten(String Hovaten)
    {
        Hovaten.trim();
        String temp =  Hovaten.substring(Hovaten.lastIndexOf(" "));
        return temp;
    }
    public String TachDem(String Hovaten)
    {
        Hovaten.trim();
        String temp =  Hovaten.substring(Hovaten.indexOf(" "),Hovaten.lastIndexOf(" "));
        return temp;
    }
    public String TachHo(String Hovaten)
    {
        Hovaten.trim();
        String temp =  Hovaten.substring(0, Hovaten.indexOf(" "));
        return temp;
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        this.setHovaten(sc.nextLine());
        System.out.println("NHap ma nhan su: ");
        this.setManhansu(sc.nextLine());
    }
    void output()
    {
        System.out.printf("%-20s        Ma nhan su: %-20s        ",this.getHovaten(),this.getManhansu());
    }
}
