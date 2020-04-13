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
public class SinhVienIT extends SinhVienPoly{ // kế thừa
    public double DiemJava, DiemHtml,DiemCss;

    public SinhVienIT() {
    }

   

    public SinhVienIT(double DiemJava, double DiemHtml, double DiemCss, String hoten, String nganh) {
        super(hoten, nganh);
        this.DiemJava = DiemJava;
        this.DiemHtml = DiemHtml;
        this.DiemCss = DiemCss;
    }
    

   

   

    public double getDiemJava() {
        return DiemJava;
    }

    public void setDiemJava(double DiemJava) {
        this.DiemJava = DiemJava;
    }

    public double getDiemHtml() {
        return DiemHtml;
    }

    public void setDiemHtml(double DiemHtml) {
        this.DiemHtml = DiemHtml;
    }

    public double getDiemCss() {
        return DiemCss;
    }

    public void setDiemCss(double DiemCss) {
        this.DiemCss = DiemCss;
    }
   
    @Override
    public double getDiem() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      return (2*DiemJava+DiemHtml+DiemCss)/4;
    }

   
}
