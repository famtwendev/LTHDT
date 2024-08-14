import java.util.Comparator;
import java.util.Scanner;

public class News implements Inews{
    private int ID;
    private String title;
    private String publishdate;
    private String author;
    private String content;
    private float averagerate;
    public News() {
        this.ID = 0;
        this.title = null;
        this.publishdate = null;
        this.author = null;
        this.content = null;
        this.averagerate = 0;
    }

    public News(int ID, String title, String publishdate, String author, String content, float averagerate) {
        this.ID = ID;
        this.title = title;
        this.publishdate = publishdate;
        this.author = author;
        this.content = content;
        this.averagerate = averagerate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(String publishdate) {
        this.publishdate = publishdate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAveragerate() {
        return averagerate;
    }

    public void setAveragerate(float averagerate) {
        this.averagerate = averagerate;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID: ");
        setID(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap Title: ");
        setTitle(sc.nextLine());
        System.out.println("Nhap Publishdate: ");
        setPublishdate(sc.nextLine());
        System.out.println("Nhap Author: ");
        setAuthor(sc.nextLine());
        System.out.println("Nhap Content: ");
        setContent(sc.nextLine());
        System.out.println("Nhap AverageRate");
        setAveragerate(sc.nextFloat());
    }
    @Override
    public void display() {
        System.out.printf("ID: %-20d|Title: %-20s|Publishdate: %-20s|Author: %-20s|Content: %-20s|AverageRate: %-20.2f",this.getID(),this.getTitle(),this.getPublishdate(),this.getAuthor(),this.getContent(),this.getAveragerate());
    }
}
    class SoSanhDiemTB implements Comparator<News>
    {
        public int compare(News s1, News  s2)
        {
            if (s1.getAveragerate() < s2.getAveragerate()) {
                return -1;
            } else if (s1.getAveragerate() > s2.getAveragerate()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    class Array
    {

    }
