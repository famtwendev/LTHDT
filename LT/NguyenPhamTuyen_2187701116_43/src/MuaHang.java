import java.util.Scanner;

public class MuaHang extends GiaoDich{
    private double sotienThanhToan;
    public MuaHang() {
        this.sotienThanhToan = 0;
    }

    MuaHang(String maso, String ngaythuchien, double sotienThanhToan) {
        super(maso, ngaythuchien);
        this.sotienThanhToan = sotienThanhToan;
    }
        public double getSotienThanhToan() {
        return sotienThanhToan;
    }

    public void setSotienThanhToan(double sotienThanhToan) {
        this.sotienThanhToan = sotienThanhToan;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhap so tien thanh toan: ");
        this.setSotienThanhToan(sc.nextDouble());
    }
    public void output()
    {
        super.output();
        System.out.printf("So tien thanh toan: %-20.2f", this.getSotienThanhToan());
    }
}
