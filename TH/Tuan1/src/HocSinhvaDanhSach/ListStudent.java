package HocSinhvaDanhSach;

import java.util.Scanner;

public class ListStudent
{
    private HocSinh a[];
    private int Soluong;
    public ListStudent() {
        super();
        this.a = null;
        Soluong = 0;
    }
    public void setA(HocSinh[] a)
    {
        this.a = new HocSinh[100];
    }

    public void setSoluong(int soluong) {
        Soluong = soluong;
    }

    //    public void get(int index)
//    {
//        if (index < 0 || index >= Soluong) {
//            throw new IndexOutOfBoundsException("Khong co thong tin hoc sin hop le");
//        }
//        a[index].output();
//    }
    public int getSoLuong()
    {
        return Soluong;
    }
    public void nhapDS()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("So luong hoc sinh trong danh sach muon nhap: ");
        int sl = sc.nextInt();
        this.setSoluong(sl);
        this.setA(a);
        for(int i = 0; i < this.getSoLuong() ;i++)
        {
            a[i] = new HocSinh(0,null,0);
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
