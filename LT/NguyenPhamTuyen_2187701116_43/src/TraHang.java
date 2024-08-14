import java.util.Scanner;

public class TraHang extends GiaoDich{
    private String soTKnhan;
    private int soluongtra;

    public TraHang()
    {
        super();
        this.soTKnhan = null;
        this.soluongtra = 0;
    }

    public TraHang(String maso, String ngaythuchien, String soTKnhan, int soluongtra) {
        super(maso, ngaythuchien);
        this.soTKnhan = soTKnhan;
        this.soluongtra = soluongtra;
    }
    public String getSoTKnhan() {
        return soTKnhan;
    }

    public void setSoTKnhan(String soTKnhan) {
        this.soTKnhan = soTKnhan;
    }

    public int getSoluongtra() {
        return soluongtra;
    }

    public void setSoluongtra(int soluongtra) {
        this.soluongtra = soluongtra;
    }

    public void input()
    {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tai khoan nhan: ");
        this.setSoTKnhan(sc.nextLine());
        System.out.println("Nhap so luong tra: ");
        this.setSoluongtra(sc.nextInt());
    }

    public void output() {
        super.output();
        System.out.printf("So TK nhan: %-20s        So luong tra: %-20d",this.getSoTKnhan(),this.getSoluongtra());
    }
}
