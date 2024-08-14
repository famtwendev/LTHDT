package Bai7;
public class BangCuuChuong 
{
    public static void main(String[] args)
    {
        for(int i = 2; i <= 9; i++)
        {
            System.out.println("\nBang Cuu Chuong " + i);
            for(int j = 1; j <= 10; j++)
            {
                System.out.println(i+" * "+j+" = "+i*j);
            }
        }
    }
}
