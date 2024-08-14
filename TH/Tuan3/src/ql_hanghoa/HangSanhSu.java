package ql_hanghoa;
import java.util.Scanner;
import java.util.*;
public class HangSanhSu extends HangHoa {
    private String loai;
    private String nguyenlieu;
    HangSanhSu()
    {
        super();
        loai = null;
        nguyenlieu = null;
    }
    HangSanhSu(String mahang, String tenhang, String nhasanxuat, int gia, String loai, String nguyenlieu)
    {
        super(mahang, tenhang, nhasanxuat, gia);
        this.loai = loai;
        this.nguyenlieu = nguyenlieu;
    }
    HangSanhSu(HangSanhSu obj)
    {
        this.loai = obj.loai;
        this.nguyenlieu = obj.nguyenlieu;
    }
    public String getLoai() {
        return loai;
    }
    public void setLoai(String loai) {
        this.loai = loai;
    }
    public String getNguyenlieu() {
        return nguyenlieu;
    }
    public void setNguyenlieu(String nguyenlieu) {
        this.nguyenlieu = nguyenlieu;
    }
    public void input()
    {
        super.input();
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhap loai sanh su: ");
        setLoai(sc.next());
        System.out.println("Nhap nguyen lieu: ");
        setNguyenlieu(sc.nextLine());
    }
    public void output()
    {
        System.out.print("\nHang Sanh Su:       ");
        super.output();
        System.out.print("            Loai sanh su: " + this.getLoai() +"             Nguyen lieu: " + this.getLoai());
    }
}
