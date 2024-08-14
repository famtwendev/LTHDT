package ql_hanghoa;
import java.util.Scanner;
import java.util.*;
public class HangThucPham extends HangHoa
{
    private String ngaysx;
    private String hansudung;
    HangThucPham()
    {
        super();
        ngaysx = null;
        hansudung = null;
    }
    HangThucPham(String mahang, String tenhang,String nhasanxuat, int gia,String ngaysx, String hansudung)
    {
        super(mahang, tenhang, nhasanxuat, gia);
        this.ngaysx = ngaysx;
        this.hansudung = hansudung;
    }
    HangThucPham(HangThucPham obj){
        super(obj.mahang,  obj.tenhang, obj.nhasanxuat,  obj.gia);
        this.ngaysx = obj.ngaysx;
        this.nhasanxuat = obj.nhasanxuat;
        this.hansudung = obj.hansudung;
    }
    //=======Methods: set, get, input, output...
    public void setNgaySX(String ngaysx){
        this.ngaysx = ngaysx;
    }
    public void setNgayHH(String hansudung){
        this.hansudung = hansudung;
    }
    public String getNgaySX(){
        return ngaysx;
    }
    public String getHansudung(){
        return hansudung;
    }
    public void input(){
        super.input();
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap ngay san xuat: ");
        ngaysx = x.nextLine();
        System.out.print("Nhap het han: ");
        hansudung = x.nextLine();
    }
    public void output()
    {
        super.output();
        System.out.println("           Ngay san suat: " + this.getNgaySX() + "        Han su dung: " + this.getHansudung());
    }
}
