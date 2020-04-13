/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TranVanTy_59133029_BT3_Tuan2;

/**
 *
 * @author Administrator
 */
public class SinhVienBiz extends SinhVienPoly {
    public double diemMarketing, diemSales;

    public SinhVienBiz() {
    }

    public SinhVienBiz(double diemMarketing, double diemSales, String hoten, String nganh) {
        super(hoten, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    
     

    
    public double getDiemMarketing() {
        return diemMarketing;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }
    

    @Override
    public double getDiem() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return (2*diemMarketing+diemSales)/3;
    }
    
    
    
}
