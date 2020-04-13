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
public class XeNgoaiThanh extends ChuyenXe{
    int SoTuyen;
    double SoKm;

    public XeNgoaiThanh() {
    }

    public XeNgoaiThanh(int SoTuyen, double SoKm, String MaSoChuyen, String HoTen, String Soxe, Double DoanhThu) {
        super(MaSoChuyen, HoTen, Soxe, DoanhThu);
        this.SoTuyen = SoTuyen;
        this.SoKm = SoKm;
    }

    public int getSoTuyen() {
        return SoTuyen;
    }

    public void setSoTuyen(int SoTuyen) {
        this.SoTuyen = SoTuyen;
    }

    public double getSoKm() {
        return SoKm;
    }

    public void setSoKm(double SoKm) {
        this.SoKm = SoKm;
    }

   public void XuatTT()
   {
       super.XuatTT();
        System.out.println(SoTuyen);
         System.out.println(SoKm); 
   }
    
    
    
}
