import java.util.Scanner;

public class HinhVuong implements Shape {
    private float n;

    public HinhVuong(float n) {
        this.n = n;
    }

    public HinhVuong() {
    }

    public float getN() {
        return n;
    }

    public void setN(float n) {
        this.n = n;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap canh ");
        n=sc.nextFloat();
    }
    @Override
    public float chuVi() {
        return n*4;
    }

    @Override
    public float dienTich() {
        return n*n;
    }
}
