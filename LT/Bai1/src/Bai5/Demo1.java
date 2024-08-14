package Bai5;
import java.util.Scanner;
public class Demo1 
{
    public static String BiggerScore(HocSinh teo, HocSinh moi)
    {
        if(teo.getScore() > moi.getScore())
            return teo.getName();
        return moi.getName();
    }
    public static void main(String[] args)
    {
        HocSinh teo = new HocSinh(0,null, 0.0);
        teo.input();
        System.out.print("\nThong tin cua hoc sinh vua nhap la: ");
        teo.output();
        Scanner sc = new Scanner(System.in);
        System.out.print("Doi ten cua hoc sinh thanh ten: ");
        String temp = sc.nextLine();
        teo.setName(temp);
        HocSinh moi = new HocSinh(0,null, 0.0);
        System.out.println("Nhap thong tin hoc sinh moi: ");
        moi.input();
        System.out.print("\nThong tin cua hoc sinh moi vua nhap la: ");
        moi.output();
        System.out.println("Hoc sinh co DTB lon hon la: "+ BiggerScore(teo,moi) );
        DanhsachHs lop1 = new DanhsachHs(50);
        lop1.nhapDS();
        lop1.xuatDS();
    }
}
