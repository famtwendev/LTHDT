package Bai5;

public class DanhsachHs 
{
    private HocSinh a[];
    private int Soluong;
    
    public int getSoLuong()
    {
        return Soluong;
    }

    public DanhsachHs(int maxSize)
    {
        a = new HocSinh[maxSize];
        Soluong = 0;
    }
    public void get(int index)
    {
        if (index < 0 || index >= Soluong) {
        throw new IndexOutOfBoundsException("Khong co thong tin hoc sin hop le");
        }
        a[index].output();
    }

    
    public void nhapDS()
    {
        for(int i = 0; i < this.getSoLuong() ;i++)
        {
            System.out.println("Nhap hoc sinh thu " + i);
            a[i].input();
        }
    }
    
    public void xuatDS()
    {
        for(int i = 0; i < this.getSoLuong(); i++)
        {
            a[i].output();
        }
    }
}
