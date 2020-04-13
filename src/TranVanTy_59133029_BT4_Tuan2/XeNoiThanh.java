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
public class XeNoiThanh extends ChuyenXe {
    String NoiDen;
    int SoNgDi;

    public XeNoiThanh() {
    }

    public XeNoiThanh(String NoiDen, int SoNgDi, String MaSoChuyen, String HoTen, String Soxe, Double DoanhThu) {
        super(MaSoChuyen, HoTen, Soxe, DoanhThu);
        this.NoiDen = NoiDen;
        this.SoNgDi = SoNgDi;
    }

    public String getNoiDen() {
        return NoiDen;
    }

    public void setNoiDen(String NoiDen) {
        this.NoiDen = NoiDen;
    }

    public int getSoNgDi() {
        return SoNgDi;
    }

    public void setSoNgDi(int SoNgDi) {
        this.SoNgDi = SoNgDi;
    }

   public void XuatTT()
   {
       super.XuatTT();
       System.out.println(NoiDen); 
        System.out.println(SoNgDi); 
   }
    
    
}
