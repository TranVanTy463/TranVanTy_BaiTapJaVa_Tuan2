/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TranVanTy_59133029_BT2_Tuan2;
import tranvanty_59133029_bt1_tuan2.NhanVien;
/**
 *
 * @author Administrator
 */
public class TranVanTy_59133029_BT2_Tuan2 {
    public static void main(String[] args){
         QuanLyNhanVien QLNV = new QuanLyNhanVien();
        
        NhanVien NV1 = new NhanVien("Trần Văn Tý",21,"An Hòa",500000,200);
        NhanVien NV2 = new NhanVien("Nguyễn Ngọc Bôn",18,"Phú Yên",100000,150);
        NhanVien NV3 = new NhanVien("Tô Thị Mật", 40, "Phú Yên", 200000, 200);
        NhanVien NV4 = new NhanVien("Nguyễn Thị Trinh", 29, "Phú Yên", 300000, 300);
        NhanVien NV5 = new NhanVien("Trần Văn Nhu", 45, "Phú yên", 1000000, 350);
        
        QLNV.them(NV1);
        QLNV.them(NV2);
        QLNV.them(NV3);
        QLNV.them(NV4);
        QLNV.them(NV5);
        QLNV.inDS();
    }
}
