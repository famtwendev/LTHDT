package Bai3;
import java.util.Scanner;
public class MangSoNguyen {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n =  sc.nextInt();
        int arr[] = new int [n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Nhap a["+i+"] = ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mang sau khi nhap: ");
        for (int u: arr)
        {
            System.out.print(u + "      ");
        }
        int max= arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if(max < arr[i])
            max = arr[i];
        }
        System.out.println("\nPhan tu lon nhat trong mang la: " + max);
    } 
}
