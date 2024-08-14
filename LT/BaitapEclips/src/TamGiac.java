import java.util.Scanner;

public class TamGiac implements Shape{
    private float a,b,c;

    public TamGiac(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TamGiac() {
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    public  void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chieu canh thu nhat");
        a=sc.nextFloat();
        System.out.println("Nhap chieu canh thu hai");
        b=sc.nextFloat();
        System.out.println("Nhap chieu canh thu ba");
        c=sc.nextFloat();

    }

    @Override
    public float chuVi() {
        return a+b+c;
    }

    @Override
    public float dienTich() {
      return (float) Math.sqrt((chuVi()/2)*(((chuVi()/2)-a)*((chuVi()/2)-b)*((chuVi()/2)-c)));
    }
}
