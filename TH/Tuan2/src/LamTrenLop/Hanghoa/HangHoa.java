package LamTrenLop.Hanghoa;
import java.util.Comparator;
import java.util.Scanner;

public class HangHoa {
    String Mahang;
    String TenHang;
    int soluong;
    double gia;
    public HangHoa(String mahang, String tenHang, int soluong, double gia) {
        Mahang = mahang;
        TenHang = tenHang;
        this.soluong = soluong;
        this.gia = gia;
    }
    public String getMahang() {
        return Mahang;
    }

    public void setMahang(String mahang) {
        Mahang = mahang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String tenHang) {
        TenHang = tenHang;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang: ");
        setMahang(sc.nextLine());
        System.out.println("Nhap ten hang: ");
        setTenHang(sc.nextLine());
        System.out.println("Nhap so luong: ");
        setSoluong(sc.nextInt());
        System.out.println("Nhap don gia: ");
        setGia(sc.nextDouble());
    }
//    public void output()
//    {
//        System.out.println("HangHoa:    Ma hang: "+ this.getMahang() +"        Ten hang: " + this.getTenHang() + "        So luong: " + this.getSoluong() + "        Don gia: " + this.getGia()+"        Tong thanh toan: " + this.getGia()*this.getSoluong());
//    }
    @Override
    public String toString() {
        return "HangHoa {" +
                "Ma hang: " + Mahang  +
                ",  Ten Hang: " + TenHang +
                ",  So luong: " + soluong +
                ",  Don gia: " + gia + " " +
                '}';
    }
}
class GiatriHangHoa implements Comparator<HangHoa>
{
    public int compare(HangHoa s1, HangHoa s2)
    {
        if (s1.getGia() < s2.getGia()) {
            return -1;
        } else if (s1.getGia() > s2.getGia()) {
            return 1;
        } else {
            return 0;
        }
    }
}
