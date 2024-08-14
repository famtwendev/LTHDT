package ql_hanghoa;
import java.util.*;
public class DanhSachHangHoa
{
    private ArrayList<HangHoa> list = new ArrayList<HangHoa>();
    public void Init()
    {
        list.add(new HangDienMay( "DM111",       "Tủ lạnh",          "Hitachi",          10000,  2,         110,        50));
        list.add(new HangSanhSu(  "SS133",       "Đĩa",              "Hung Long",        50,     "Đồ dùng",       "Sứ"));
        list.add(new HangThucPham("TP666",       "Lạp xưởng",        "Thực Phẩm VN",     100,    "12/03/2020",               "	12/03/2021"));
        list.add(new HangDienMay( "DM999",       "Máy giặt",         "Hitachi",          8000,	  2,	        220,	     20));
        list.add(new HangSanhSu(  "SS316",       "Tô",               "Hung Long",        50,     "Đồ dùng",       "Sành"));
        list.add(new HangDienMay( "DM777",       "Tủ làm mát",       "Hitachi",          60000,  2,	        220,	    40));
        list.add(new HangThucPham("TP282",       "Xúc xích",         "Thực Phẩm VN",     80,     "16/03/2021",               "	16/03/2023"));
        list.add(new HangDienMay( "DM222",       "Tivi Samsung",     "Hitachi",          5000,	  2,	        220,	    20));
        list.add(new HangSanhSu(  "SS220",       "Ly",               "Hung Long",        50,     "Đồ dùng",       "Sứ"));
        list.add(new HangDienMay( "DM444",       "Máy Ampli",        "Hitachi",          7000,	  2,	        110,	    30));
        list.add(new HangThucPham("TP222",       "Cá hộp",           "Thực Phẩm VN",     80,     "12/01/2021",               "	12/06/2023"));
        list.add(new HangDienMay( "DM333",       "Máy lạnh",         "Hitachi",          12000,  2,	        220,	    100));
        list.add(new HangSanhSu(  "SS320",       "Ấm nước",          "Hung Long",        50,     "Đồ dùng",       "Cốm"));
        list.add(new HangThucPham("TP888",       "Nho",              "Thực Phẩm VN",     150,    "12/02/2021",               "	12/05/2021"));
        list.add(new HangDienMay( "DM555",       "Loa Boss",         "Hitachi",          9000,	  2,	        220,	    15));
        list.add(new HangSanhSu(  "SS114",       "Chén",             "Hung Long",        50,     "Đồ dùng",       "Sứ"));
       }
    public void themMH(HangHoa h){
        list.add(h);
    }
    public void xuatDSTheoLoai(byte loaiHM){
        for(HangHoa obj : list){
            if(loaiHM==1 && obj instanceof HangDienMay) obj.output();
            else if(loaiHM==2 && obj instanceof HangThucPham) obj.output();
            else if(loaiHM==3 && obj instanceof HangSanhSu) obj.output();
        }
    }
    public void output()
    {
        for(HangHoa obj : list)
            obj.output();
    }
}
