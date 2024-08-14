/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MangTangDan {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[]= new int [10];
        for(int i=0; i < a.length; i++)
        {
            System.out.print("Nhap a["+i+"] = ");
            a[i] = sc.nextInt();
        }
        System.out.println("==== Mang vua nhap ====");
        for(int i =0; i < a.length; i++)
        {
            System.out.println("a["+i+"] = "+a[i]);
        }
        java.util.Arrays.sort(a);
        System.out.println("Mang sau khi sap xep tang dan la:");
        for(int i =0; i < a.length; i++)
        {
            System.out.print(a[i]+"   ");
        }
    }
}
