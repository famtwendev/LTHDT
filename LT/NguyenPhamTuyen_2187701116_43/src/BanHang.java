import java.util.Scanner;

public class BanHang extends GiaoDich
{
    private int soluongHH;
    public BanHang() {
        super();
        this.soluongHH = 0;
    }
    public BanHang(String maso, String ngaythuchien, int soluongHH) {
        super(maso, ngaythuchien);
        this.soluongHH = soluongHH;
    }

    public int getSoluongHH() {
        return soluongHH;
    }

    public void setSoluongHH(int soluongHH) {
        this.soluongHH = soluongHH;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhap so luong hang hoa: ");
        this.setSoluongHH(sc.nextInt());
    }
    public void output()
    {
        super.output();
        System.out.printf("So luong hang hoa: %-20d",this.getSoluongHH());
    }
}
