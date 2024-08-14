package Bai3_NangCao;

import Bai1_Xaydung.ConNguoi;
import Bai1_Xaydung.HocVien;
import Bai1_Xaydung.NhanVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DSNC
{
    private ArrayList<ConNguoi> list = new ArrayList<ConNguoi>();
    public void Init() {
        list.add(new HocVien("Tran Van Trung", 2000, 7, 9, 9));
        list.add(new GiaoVien("Vo Thi Hong", 2002, 6000, "11/09/2020", "CN_COKHI", "Cong Nghe", "Ky Su", "TK Mo hinh", "HUFLIT", 300));
        list.add(new HocVien("Ho My Nu", 2001, 0, 5, 6));
        list.add(new HocVien("Nguyen Van Hung", 1999, 5, 8, 7));
        list.add(new GiaoVien("Phan Thanh Huan", 1980, 12000, "12/03/2021", "CN_DT", "CongNghe", "Thac sy", "Dien Tu",
                "DH BK TP.HCM", 500));
        list.add(new HocVien("Nguyen Thi Hong", 2001, 4, 5, 3));
        list.add(new NVquanly("Nguyen Thu Hang", 1983, 6000, "01/01/2021", "MT_KHI", "Moi Truong", "Cu Nhan",
                "TN & MT", "HUTECH", 250));
        list.add(new HocVien("Pham Quoc Thang", 2000, 8, 3, 7));
        list.add(new HocVien("Nguyen Trung Thanh", 2000, 5, 9, 6));
        list.add(new HocVien("Vo Manh Hung", 1998, 7, 3, 8));
        list.add(new HocVien("Nguyen Thuy Hong", 2003, 7, 9, 8));
        list.add(new NVquanly("Le Kien Cuong", 1982, 8000, "12/02/2021", "MT_NUOC", "Moi Truong", "Cu Nhan",
                "TN & MT", "DH KHTN TP.HCM", 200));
        list.add(new GiaoVien("Bui Thi Tham Nong", 1981, 9000, "12/02/2020", "CN_OTO", "Cong Nghe", "Ky Su", "TK Mo hinh", "HUTECH", 300));
    }
    public void themCV(ConNguoi h){
        list.add(h);
    }
    public void xuatDSTheoLoai(byte chucvu){
        for(ConNguoi obj : list){
                 if(chucvu ==1 && obj instanceof HocVien)  obj.output();
            else if(chucvu ==2 && obj instanceof NVquanly) obj.output();
            else if(chucvu ==3 && obj instanceof GiaoVien) obj.output();
        }
    }
    public void output()
    {
        for(ConNguoi obj : list)
        {
            obj.output();
            System.out.println();
        }
    }
    public void stringgCHuoi()
    {
        int result;
        for (int i = 0; i < list.size(); i++)
        {
            for (int j = i + 1; j < list.size(); j++)
            {
                String name1 = list.get(i).Tachten(list.get(i).getHoten());
                String name2 = list.get(j).Tachten(list.get(j).getHoten());
                result = name1.compareTo(name2);
                if (result < 0)
                {
                    continue;
                } else if (result > 0) {
                    Collections.swap( list, i, j);
                } else
                {
                    String tendem1 = list.get(i).TachDem(list.get(i).getHoten());
                    String tendem2 = list.get(j).TachDem(list.get(j).getHoten());
                    result = tendem1.compareTo(tendem2);
                    if(result < 0)
                        continue;
                    else if (result > 0)
                    {
                        Collections.swap( list, i, j);
                    }
                    else
                    {
                        String ho1 = list.get(i).TachHo(list.get(i).getHoten());
                        String ho2 = list.get(j).TachHo(list.get(j).getHoten());
                        result = ho1.compareTo(ho2);
                        if(result < 0)
                        {
                            continue;
                        }
                        else if (result > 0)
                        {
                            Collections.swap(list, i, j);
                        }
                        else
                            continue;
                    }
                }
            }
        }
    }
}
