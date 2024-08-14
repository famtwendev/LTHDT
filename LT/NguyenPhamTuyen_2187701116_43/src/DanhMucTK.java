import java.util.ArrayList;

public class DanhMucTK {
    public ArrayList <TKLAZADA> listTK = new ArrayList<>() ;
    public DanhMucTK()
    {
        this.listTK = new ArrayList<>();
    }
    public void  themTK(TKLAZADA a){
        listTK.add(a);
    }
    public void Init()
    {
        // TAI KHOAN 1
        ArrayList <GiaoDich> dsgd1 = new ArrayList<>();
        GiaoDich h = new GiaoDich();
        dsgd1.add(new MuaHang("a1","12/2/2018",300000));
        dsgd1.add(h = new TraHang("t1","3/4/2016","6177125",10));
        dsgd1.add(h = new BanHang("b1","28/5/2020",50));
        dsgd1.add(h = new MuaHang("a2","4/3/2022",120000));
        TKLAZADA now = new TKLAZADA("4321","Nguyen Pham Tuyen",2000000, dsgd1);
        this.themTK(now);

        // TAI KHOAN 2
        ArrayList <GiaoDich> dsgd2 = new ArrayList<>();
        dsgd2.add(h = new TraHang("t1","7/9/2018","6177125",10));
        dsgd2.add(h = new MuaHang("a1","22/10/2019",500000));
        dsgd2.add(h = new BanHang("b1","4/5/2021",50));
        dsgd2.add(h = new MuaHang("a2","16/1/2020",120000));
        TKLAZADA old = new TKLAZADA("4711","Tran Nhat Vu",700000, dsgd2);
        this.themTK(old);
    }
    public void output()
    {
        int j = 1;
        for(TKLAZADA i: listTK)
        {
            System.out.println("==============================================");
            System.out.println("Tai khoan thu " + j);
            i.output();
            j++;
        }
    }
}
