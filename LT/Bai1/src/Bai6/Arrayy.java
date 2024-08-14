package Bai6;
import java.util.Scanner;
public class Arrayy 
{
    private int quantity; // so luong
    private int size; // kichthuoc
    private int arr[];    // mang

    public Arrayy() 
    {
        this.quantity = 0;
        this.arr = null;
        this.size = 0;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int get(int index)
    {
        if (index < 0 || index >= quantity) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return arr[index];
    }
    public void setArr(int[] arr)
    {
        this.arr = new int[this.getSize()];
    }


    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: " );
        int n = sc.nextInt();
        this.setQuantity(n);
        System.out.print("Nhap kich thuoc cua mang: " );
        int dodai = sc.nextInt();
        this.setSize(dodai);
        this.setArr(arr);
        for (int i = 0; i < n; i++)
        {
            System.out.print("Nhap a["+i+"] = ");
            arr[i] = sc.nextInt();
        }
    }

    public void output()
    {
        for (int i = 0; i < this.getSize(); i++)
        {
            System.out.print(this.get(i) + "      ");
        }
        System.out.println();
    }

    public double TBcacSoLe()
    {
        int sum = 0, dem = 0;
        for (int i = 0; i < this.getSize(); i++)
        {
            if(this.get(i) % 2 != 0)
            {
                sum  = sum + this.get(i);
                dem++;
            }
        }
        double TBSole = (double)sum / dem;
        return TBSole;
    }

    public int PhanTuMAX()
    {
        int max = this.get(0);
        for (int i = 1; i < this.getSize(); i++)
        {
            if(max < this.get(i))
                max = this.get(i);
        }
        return max;
    }

    public void Sapxep()
    {
        java.util.Arrays.sort(arr);
        this.output();
    }
}
