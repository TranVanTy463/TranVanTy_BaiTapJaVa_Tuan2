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
public class BT4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        XeNgoaiThanh cx1 = new XeNgoaiThanh(1,35,"123","Tran Van Ty ","78H1",3000000.0);
        XeNgoaiThanh cx2 = new XeNgoaiThanh(2,36,"124","Tran Van No ","78G1",4000000.0);
        XeNgoaiThanh cx3 = new XeNgoaiThanh(3,37,"125","Tran Van Ni ","78C1",4000000.0);
        XeNoiThanh cx4 = new XeNoiThanh("Sai Gon",20,"769","Nguyen Ngoc Bon","79H1",5000000.0);
        XeNoiThanh cx5 = new XeNoiThanh("Ca Mau",21,"779","Nguyen Ngoc Le","79H1",6000000.0);
        XeNoiThanh cx6 = new XeNoiThanh("Ha Noi",22,"789","Nguyen Ngoc Tay","79H1",6000000.0);
        
        qlcx.ThemChuyenXe(cx1);
        qlcx.ThemChuyenXe(cx1);
        qlcx.ThemChuyenXe(cx1);
        qlcx.ThemChuyenXe(cx1);
        qlcx.ThemChuyenXe(cx1);
        qlcx.ThemChuyenXe(cx1);
            qlcx.InDs();
            // Chưa làm được tính doanh thu 
            
    }
    
}
