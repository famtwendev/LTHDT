package Tuan8;

import java.util.ArrayList;
import java.util.Collections;

public class DSDT {
    ArrayList<Nhansu> list = new ArrayList<>();
    public void Init()
    {
        list.add(new Congnhan("Tran Van Trung", "CN01", 2000, 301));
        PhongBan tempvp1 = new PhongBan("Phong01", "KeToan1");
        list.add(new VanPhong("Vo Thi Hong","VP001", "Ke toan", "Thac sy", "Nu",tempvp1));
        PhongBan tempkt1 = new PhongBan("Phong02", "KyThuat1");
        list.add(new KyThuat("Vu Trung Kien", "KT001","Dien Tu", "Tien sy", "Nam", tempkt1));
        list.add(new VanPhong("Nguyen Van Hung", "VP002", "Ngan Hang", "Cao Dang", "Nam", tempvp1));
        list.add(new KyThuat("Phan Thanh Huan","KT002" , "Co Dien Tu", "Dai hoc", "Nam",tempkt1));
    }

    public void CapNhatThemDT(Nhansu h){
        list.add(h);
    }
    public void xuatDSTheoLoai(byte Doituong){
        for(Nhansu obj : list){
            if(Doituong ==1 && obj instanceof Congnhan)  obj.output();
            else if(Doituong == 2 && obj instanceof VanPhong) obj.output();
            else if(Doituong == 3 && obj instanceof KyThuat) obj.output();
        }
    }
    public void output()
    {
        for(Nhansu obj : list)
        {
            obj.output();
            System.out.println();
        }
    }

    public void TimKiemThongTin(String TenNhanSu)
    {
        for (int i = 0; i < list.size(); i++)
        {
               if (list.get(i).getHovaten().equals(TenNhanSu))
               {
                   list.get(i).output();
               }
               else
               {
                   System.out.println("Khong tim thay ten nhan su nay trong DANH SACH!");
               }
        }
    }
    public void XoaNhanSu(String TenNhanSu)
    {
        int index = 0;
        byte flag = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getHovaten().equals(TenNhanSu))
            {
                list.remove(i);
                index = i;
                flag = 1;
            }
        }
        if(flag == 1)
            list.remove(index);
        else
            System.out.println("Nhan su co ten vua nhap khong co trong Danh Sach!");
    }
    public void SapxepTen()
    {
        int result;
        for (int i = 0; i < list.size(); i++)
        {
            for (int j = i + 1; j < list.size(); j++)
            {
                String name1 = list.get(i).Tachten(list.get(i).getHovaten());
                String name2 = list.get(j).Tachten(list.get(j).getHovaten());
                result = name1.compareTo(name2);
                if (result < 0)
                {
                    continue;
                } else if (result > 0) {
                    Collections.swap( list, i, j);
                } else
                {
                    String tendem1 = list.get(i).TachDem(list.get(i).getHovaten());
                    String tendem2 = list.get(j).TachDem(list.get(j).getHovaten());
                    result = tendem1.compareTo(tendem2);
                    if(result < 0)
                        continue;
                    else if (result > 0)
                    {
                        Collections.swap( list, i, j);
                    }
                    else
                    {
                        String ho1 = list.get(i).TachHo(list.get(i).getHovaten());
                        String ho2 = list.get(j).TachHo(list.get(j).getHovaten());
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
