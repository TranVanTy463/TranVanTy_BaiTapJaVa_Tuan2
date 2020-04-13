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
public class QuanLyNhanVien implements IQuanLy  { //thực thi giao diện IQuanLy
    NhanVien[] NV = new NhanVien[50];
    int sl = 0 ;
    @Override
    public void them(NhanVien DS) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        NV[sl]= new NhanVien();
        NV[sl] = DS;
        sl ++;
    }

    @Override
    public void inDS() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     int i ;
       for( i=0 ; i<sl; i++){
        System.out.println(NV[i].getThongTin());
    }
      
    }
   
}
