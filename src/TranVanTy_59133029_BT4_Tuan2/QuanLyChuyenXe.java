/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TranVanTy_59133029_BT4_Tuan2;
import java.util.ArrayList;
/**
 *
 * @author Administrator
 */
public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> dsChuyenXe = new ArrayList<>();

    public QuanLyChuyenXe() {
    }
    public void ThemChuyenXe(ChuyenXe Chuyen)
    {
        dsChuyenXe.add(Chuyen);
    }
     public void InDs(){
         int i;
        for( i=0;i<dsChuyenXe.size(); i++){
           dsChuyenXe.get(i).XuatTT();
        }
    }
    // Chưa Tính Được Doanh Thu
    
}
