package Bai6;

import java.util.Scanner;

public class Demo2 
{
    public static void main(String[] args)
    {
        Arrayy a1 = new Arrayy();
        a1.input();
        System.out.println("Mang gom "+ a1.getQuantity() +" phan tu: ");
        a1.output();
        System.out.println("Tri trung binh cac so le la: " + a1.TBcacSoLe());
        System.out.println("Phan tu lon nhat trong mang la: "+ a1.PhanTuMAX());
        System.out.print("Mang sau khi sap xep la: ");
        a1.Sapxep();
    }
}
