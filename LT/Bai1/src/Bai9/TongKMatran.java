package Bai9;

import java.util.Random;
import java.util.Scanner;

public class TongKMatran {
    public static int TongHangKMaTran(int a[][], int m, int n, int Hang)
    {
        int sum = 0;
        for (int j = 0; j < n; j++)
        {
            sum += a[Hang][j];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap m dong: ");
        int m = sc.nextInt();
        System.out.print("Nhap n cot:  ");
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                a[i][j] = rand.nextInt(10);
            }
        }
         System.out.println("Ma tran sau khi da nhap: ");
         for (int i = 0; i < m; i++)
         {
             for (int j = 0; j < n; j++)
             {
                 System.out.print(a[i][j] + "     ");
             }
             System.out.println();
         }
        int k;
        do
        {   
            System.out.print("\nNhap hang k muon tinh tong: ");
            k = sc.nextInt(); 
            if(k < 0 || k >= m) System.out.println("Gia tri k vua nhap khong hop le! Nhap lai!");
        }while(k < 0 || k >= m);
        System.out.println("Tong cac pham tu hang thu " + k +" trong ma tran la: " +TongHangKMaTran(a,m,n,k));
    }
}
