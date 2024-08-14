package LamTrenLop.Hanghoa;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    public static void Init(ArrayList Kho1)
    {
        Kho1.add(new HangHoa("a1", "Toan", 5, 100));
        Kho1.add(new HangHoa("a2", "Ly", 3, 50));
        Kho1.add(new HangHoa("a3", "Hoa", 1, 20));
        Kho1.add(new HangHoa("a4", "Sinh", 2, 73));
        Kho1.add(new HangHoa("a5", "Van", 4, 15));
        Kho1.add(new HangHoa("a6", "Su", 6, 40));
        Kho1.add(new HangHoa("a7", "Dia", 7, 80));
    }
    public static void Sapxep(ArrayList<HangHoa> Kho1)
    {
        for (int i = 0; i < Kho1.size(); i++)
            for (int j = i; j <= Kho1.size(); j++)
                if(Kho1.get(i).getGia() < Kho1.get(j).getGia())
                    Collections.swap( Kho1, i, j);
    }
    public static void XoaHanghoaSLMax(ArrayList<HangHoa> Kho1)
    {
        int max = 0;
        for (int i = 0; i < Kho1.size(); i++)
        {
            if(max < Kho1.get(i).getSoluong())
            {
                max = Kho1.get(i).getSoluong();
            }
        }
        for (int i = 0; i < Kho1.size(); i++)
        {
            if (max == Kho1.get(i).getSoluong())
            {
                Kho1.remove(Kho1.get(i));
            }
        }
        System.out.println("\nSau khi da xoa hang hoa co so luong nhieu nhat la: ");
        for (int i = 0; i < Kho1.size(); i++)
        {
            System.out.println("Hang hoa thu " + i);
            System.out.println(Kho1.get(i).toString());
        }
    }
    public static void DonGiaMin(ArrayList<HangHoa> Kho1)
    {
        // TIm HangHoa co DOn gia it nhat r nhan ban
        Kho1.add(Kho1.get(Kho1.size()-1));
        System.out.println("HangHoa co DOn gia it nhat r nhan ban");
        for (int i = 0; i < Kho1.size(); i++)
        {
            System.out.println("Hang hoa thu " + i);
            System.out.println(Kho1.get(i).toString());
        }
    }
    public static void main(String[] args) {
//        HangHoa a1 = new HangHoa(null,null,0,0);
//        a1.input();
//        a1.output();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap so hang hoa co trong danh sach: ");
//        int n = sc.nextInt();
          ArrayList<HangHoa> Kho1 = new ArrayList<HangHoa>();
          Init(Kho1);
// nhap tay
//        for (int i = 0; i < n; i++)
//        {
//            System.out.println("\nNhap hang hoa thu "+ i + ":");
//            HangHoa temp = new HangHoa(null,null,0,0);
//            temp.input();
//            Kho1.add(temp);
//        }
        System.out.println("Danh sach hang hoa trong kho la: ");
        for (int i = 0; i < Kho1.size(); i++)
        {
            System.out.println("Hang hoa thu " + i);
            System.out.println(Kho1.get(i).toString());
//            Kho1.get(i).output();
        }
//        Sapxep(Kho1);
        Collections.sort(Kho1, new GiatriHangHoa());
        System.out.println("\n\nDanh sach hang hoa da sap xep theo gia trong kho la: ");
        for (int i = 0; i < Kho1.size(); i++)
        {
            System.out.println("Hang hoa thu " + i);
            System.out.println(Kho1.get(i).toString());
//            Kho1.get(i).output();
        }
        XoaHanghoaSLMax(Kho1);
        DonGiaMin(Kho1);
    }

}
//            Kho1.get(i).output();
//        }
