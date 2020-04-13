/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TranVanTy_59133029_BT4_Tuan2;

/**
 *
 * @author Administrator
 */
public class ChuyenXe {
    String MaSoChuyen,HoTen,Soxe;
    Double DoanhThu;

    public ChuyenXe() {
    }

    public ChuyenXe(String MaSoChuyen, String HoTen, String Soxe, Double DoanhThu) {
        this.MaSoChuyen = MaSoChuyen;
        this.HoTen = HoTen;
        this.Soxe = Soxe;
        this.DoanhThu = DoanhThu;
    }

    public String getMaSoChuyen() {
        return MaSoChuyen;
    }

    public void setMaSoChuyen(String MaSoChuyen) {
        this.MaSoChuyen = MaSoChuyen;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getSoxe() {
        return Soxe;
    }

    public void setSoxe(String Soxe) {
        this.Soxe = Soxe;
    }

    public Double getDoanhThu() {
        return DoanhThu;
    }

    public void setDoanhThu(Double DoanhThu) {
        this.DoanhThu = DoanhThu;
    }

    
    
    public void XuatTT(){
        System.out.println(MaSoChuyen); 
        System.out.println(HoTen); 
        System.out.println(Soxe);
        System.out.println(DoanhThu);
        
    }
}
