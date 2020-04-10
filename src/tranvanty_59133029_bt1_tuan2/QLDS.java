/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranvanty_59133029_bt1_tuan2;
import java.util.ArrayList;
/**
 *
 * @author Administrator
 */
public class QLDS implements IQLDS {
ArrayList<CaNhan> dscanhan ;

    public QLDS(ArrayList<CaNhan> dscanhan) {
        this.dscanhan = dscanhan;
    }

    @Override
    public int them(CaNhan p) {
        dscanhan.add(p);
        return 1;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int xoa(String ten) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inds() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
               
}
