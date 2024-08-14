package Tuan8;

public class KyThuat extends ChuyenVien{
    @Override
    void phepTuNghiep() {
        if (this.getTrinhdo() == "Tien sy" && this.getTrinhdo() == "Thac sy")
            System.out.println("Duoc");
        else
            System.out.println("Khong");
    }

    public KyThuat() {
        super();
    }

    public KyThuat(String hovaten, String manhansu, String chuyennganh, String trinhdo, String gioitinh, PhongBan pb) {
        super(hovaten, manhansu, chuyennganh, trinhdo, gioitinh, pb);
    }

    @Override
    public void input() {
        super.input();
    }

    @Override
    public void output() {
        super.output();
        this.phepTuNghiep();
    }
}
