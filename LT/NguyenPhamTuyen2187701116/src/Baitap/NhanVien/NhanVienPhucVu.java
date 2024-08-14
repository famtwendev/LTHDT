package Baitap.NhanVien;

public class NhanVienPhucVu extends NhanVien
{
    public NhanVienPhucVu(String manv, String tennv, int namsinh, String trinhdo, double luongcb) {
        super(manv, tennv, namsinh, trinhdo, luongcb);
    }
    NhanVienPhucVu()
    {
        super();
    }
    @Override
    double Salary()
    {
        double luong = this.getLuongcb();
        return luong;
    }
    public void output()
    {
        super.output();
        System.out.print("     ||     Nhan vien Phuc Vu");
    }
}
