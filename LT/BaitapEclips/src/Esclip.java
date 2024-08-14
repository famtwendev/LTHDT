import java.util.Scanner;

public class Esclip implements Shape {
    private float x,y;

    public Esclip() {

    }

    public Esclip(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap x: ");
        this.x=sc.nextFloat();
        System.out.println("Nhap y");
        this.y=sc.nextFloat();
    }

    @Override
    public String toString() {
        return "Esclip{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public float chuVi() {
        return (float) (2*PI*(Math.sqrt((x*x+y*y)/2)));
    }

    @Override
    public float dienTich() {
        return PI*x*y;
    }
}
