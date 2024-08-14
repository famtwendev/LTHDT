package Bai2;
import java.util.Scanner;
public class NhapxuatSV 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ma so sinh vien: ");
//        long id =  Long.parseLong(sc.nextLine());
        long id = sc.nextLong();
        sc.nextLine();
        System.out.println("Nhap ho va ten sinh vien: ");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = sc.nextInt();
        System.out.println("Nhap nam sinh: ");
        int year = sc.nextInt();
        System.out.println("Nhap diem trung binh: ");
        double score = sc.nextDouble();
        System.out.println("MSSV: " + id + "     Ho va ten: " + name + "     Tuoi: " + age + "      Nam sinh: " + year + "      DTB: " + score);
    }
}
