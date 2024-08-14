package Bai4;
import java.util.Random;
import java.util.Scanner;
public class MaTran {
    public static int TongMaTran(int a[][], int m, int n)
    {
        int sum = 0;

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                sum += a[i][j];
            }
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
        ;
        int a[][] = new int[m][n];
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                a[i][j] = rand.nextInt(50);
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
         System.out.println("Tong cac pham tu trong ma tran la: " + TongMaTran(a,m,n));
    }
}
