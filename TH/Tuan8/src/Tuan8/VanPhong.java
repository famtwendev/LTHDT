package Tuan8;

public class VanPhong extends ChuyenVien{
    @Override
    void phepTuNghiep() {
        if (this.getTrinhdo() == "Dai hoc" && this.getTrinhdo() == "Thac sy")
            System.out.println("Phep Tu NGhiep: Duoc");
        else
            System.out.println("Phep Tu Nghiep: Khong");
    }

    public VanPhong() {
        super();
    }

    public VanPhong(String hovaten, String manhansu, String chuyennganh, String trinhdo, String gioitinh, PhongBan pb) {
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
