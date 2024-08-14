package Bai5;
import java.util.Scanner;
public class HocSinh 
{
    private long id;
    private String name;
    private double Score;

    public HocSinh(long id, String name, double score) {
        this.id = id;
        this.name = name;
        Score = score;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    public void input()
    {
        long maso;
        String hoten;
        double gpa;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        maso =  Long.parseLong(sc.nextLine());
        this.setId(maso);
        System.out.print("Nhap Name: ");
        hoten = sc.nextLine();
        this.setName(hoten);
        System.out.print("Nhap Score: ");
        gpa = sc.nextDouble();
        this.setScore(gpa);
    }
    public void rank()
    {
        if (this.Score < 4)
        {
            System.out.println("Hoc sinh YEU");
        }else if (this.Score < 6.5){
            System.out.println("Hoc sinh TRUNG BINH");
        }else if(this.Score < 8.0){
            System.out.println("Hoc sinh KHA");
        }else
        {
            System.out.println("Hoc sinh GIOI");
        }
    }
    public void output()
    {
        System.out.println("\nId: " + this.getId() + "      Name: " + this.getName()  + "      Score: " + this.getScore() );
        this.rank();
    }
}
