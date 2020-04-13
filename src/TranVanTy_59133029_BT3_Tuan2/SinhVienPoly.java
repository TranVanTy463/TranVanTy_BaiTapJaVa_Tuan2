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
public  abstract class SinhVienPoly {
    String hoten;
    String nganh;
    public  SinhVienPoly(){
    
}

    public SinhVienPoly(String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    public abstract double getDiem(); // phuong thức trừu tượng
    public String getHocLuc(){
        String HL=" " ;
        if(getDiem()<5)
            HL= ("Yếu");
        else
            if(getDiem()<6.5 && getDiem()>=5)
                HL = ("Trung Bình");
            else 
                if(getDiem()<7.5 && getDiem()>=6.5)
                  HL =( "Khá");
                else 
                    if(getDiem()<9 && getDiem()>=7.5)
                      HL = ("Giỏi");
                    else
                        if(getDiem()>=9)
                          HL = ("Xuất sắc");
     return HL;                            
    }
    public void xuat(){
        System.out.println(" " +hoten);
        System.out.println(" " +nganh);
        System.out.println(" " +getDiem());
        System.out.println(" " +getHocLuc());
        
    }
    
}
