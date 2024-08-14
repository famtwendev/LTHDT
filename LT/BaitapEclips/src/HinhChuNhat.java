import java.util.Scanner;

public class HinhChuNhat implements Shape {
    private float m,n;

    public HinhChuNhat(float m, float n) {
        this.m = m;
        this.n = n;
    }

    public HinhChuNhat() {
    }

    public float getM() {
        return m;
    }

    public void setM(float m) {
        this.m = m;
    }

    public float getN() {
        return n;
    }

    public void setN(float n) {
        this.n = n;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        m=sc.nextFloat();
        System.out.println("Nhap chieu rong");
        n=sc.nextFloat();
    }

    @Override
    public float chuVi() {
        return (m+n)*2;
    }

    @Override
    public float dienTich() {
        return m*n;
    }
}
