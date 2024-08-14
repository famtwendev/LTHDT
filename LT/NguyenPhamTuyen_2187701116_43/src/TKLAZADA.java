import java.util.ArrayList;
import java.util.Scanner;
public class TKLAZADA{
    private String soTK, chuTK;
    private double soTienHienCo;
    ArrayList<GiaoDich> dsGD = new ArrayList<>();

    public TKLAZADA()
    {
        this.soTK = null;
        this.chuTK = null;
        this.soTienHienCo = 0;
        this.dsGD = new ArrayList<>();
    }
    public TKLAZADA(String soTK, String chuTK, double soTienHienCo,ArrayList<GiaoDich> dsGD) {
        this.soTK = soTK;
        this.chuTK = chuTK;
        this.soTienHienCo = soTienHienCo;
        this.dsGD = dsGD;
    }
        public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    public String getChuTK() {
        return chuTK;
    }

    public void setChuTK(String chuTK) {
        this.chuTK = chuTK;
    }

    public double getSoTienHienCo() {
        return soTienHienCo;
    }

    public void setSoTienHienCo(double soTienHienCo) {
        this.soTienHienCo = soTienHienCo;
    }

    public ArrayList<GiaoDich> getDsGD() {
        return dsGD;
    }

    public void setDsGD() {
        this.dsGD = new ArrayList<>();
    }
    public void setDsGD(ArrayList<GiaoDich> khac)
    {
        this.dsGD = khac;
    }
    public void themGD(GiaoDich a){
        dsGD.add(a);
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tai khoan: ");
        this.setSoTK(sc.nextLine());
        System.out.println("Nhap chu tai khoan: ");
        this.setChuTK(sc.nextLine());
        System.out.println("Nhap so tien hien co: ");
        this.setSoTienHienCo(sc.nextDouble());
        sc.nextLine();
        this.setDsGD(this.dsGD);
        GiaoDich h = new GiaoDich();
        byte chon;
        do
        {
            System.out.println("==== NHAP GIAO DICH =====");
            System.out.println("1. Mua hang");
            System.out.println("2. Ban hang");
            System.out.println("3. Tra hang");
            System.out.println("0. Thoat nhap giao dich cho tai khoan");
            System.out.println("==============================");
            System.out.print("Chon giao dich (1),(2),(3): ");
            chon = sc.nextByte();
            if(chon == 1)
            {
                h = new MuaHang();
                h.input();
                if(this.getSoTienHienCo() < ((MuaHang) h).getSotienThanhToan())
                {
                    System.out.println("!!!  SO DU HIEN CO KHONG DU DE THUC HIEN GIAO DICH  !!!");
                    System.out.println("GIAO DICH THAT BAI");
                    continue;
                }
                this.themGD(h);
                double tienthua = this.getSoTienHienCo() - ((MuaHang) h).getSotienThanhToan();
                this.setSoTienHienCo(tienthua);
                System.out.println("GIAO DICH THANH CONG");
            }
            else if(chon == 2)
            {
                h = new BanHang();
                h.input();
                this.themGD(h);
                System.out.println("GIAO DICH THANH CONG");
            }
            else if(chon == 3)
            {
                h = new TraHang();
                h.input();
                this.themGD(h);
                System.out.println("GIAO DICH THANH CONG");
            }
        }while(chon != 0);
    }
    public byte KTMuaHang(GiaoDich other)
    {
        if(other instanceof MuaHang && ((MuaHang) other).getSotienThanhToan() > 200000)
            return 1;
        return 0;
    }
    public double TongTienThanhToan()
    {
        double tong = 0;
        for(GiaoDich obj : dsGD)
        {
            if (obj instanceof MuaHang)
            {
                tong = tong + ((MuaHang) obj).getSotienThanhToan();
            }
            else
                continue;
        }
        return tong;
    }
    public void output()
    {
        System.out.printf("So TK: %-20s     Chu TK: %-20s        So tien hien co: %-20.2f\n",this.getSoTK(), this.getChuTK(),this.getSoTienHienCo());
        for(GiaoDich i: dsGD)
        {
            if(i instanceof MuaHang)
            {
                if( this.KTMuaHang(i) == 1)
                {
                    i.output();
                    System.out.printf("Day la giao dich MUA HANG va so tien thanh toan > 200000.\n");
                }
                else
                {
                    i.output();
                    System.out.printf("Day la giao dich MUA HANG va so tien thanh toan < 200000.\n");
                }
            }
            else if(i instanceof BanHang)
            {
                i.output();
                System.out.printf(" Day la giao dich BAN HANG!\n");
            }
            else
            {
                i.output();
                System.out.printf(" Day la giao dich TRA HANG!\n");
            }
        }
        System.out.print("\nTong so tien thanh toan cua tai khoan nay la: " + this.TongTienThanhToan());
        System.out.println();
    }
}
