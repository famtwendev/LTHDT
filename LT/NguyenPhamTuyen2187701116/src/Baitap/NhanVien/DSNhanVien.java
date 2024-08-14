package Baitap.NhanVien;
import java.util.ArrayList;
import java.util.*;
public class DSNhanVien
{
    private int soluong;
    private NhanVien danhsach [];
    public DSNhanVien()
    {
        this.danhsach = new NhanVien[100];
        this.soluong = 0;
    }
    public void setDanhsach() {
        this.danhsach = new NhanVien[100];
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getSoluong() {
        return soluong;
    }
    public void themNV(NhanVien h)
    {
        int temp = this.getSoluong();
        danhsach[temp] = h;
        this.soluong = this.soluong + 1;
    }
    public void xuatDSTheoChucVu(byte Chucvu){
        for(int i = 0; i < this.getSoluong(); i++)
        {
                 if(Chucvu==1 && danhsach[i]  instanceof NhanvienQuanLy)     danhsach[i] .output();
            else if(Chucvu==2 && danhsach[i]  instanceof NhanVienNghienCuu)  danhsach[i] .output();
            else if(Chucvu==3 && danhsach[i]  instanceof NhanVienPhucVu)     danhsach[i] .output();
        }
    }
    public void XuatLuongNhanVien()
    {
        for (int i = 0; i < this.getSoluong(); i++)
        {
            System.out.println("        Ma nhan vien: "+ danhsach[i].getManv() + "      Ten Nhan Vien: " +   danhsach[i].getTennv() + "      Tong luong: " +  danhsach[i].Salary());
        }
    }
    public void outputds()
    {
        for (int i = 0; i < this.getSoluong(); i++)
        {
            danhsach[i].output();
        }
    }
}
