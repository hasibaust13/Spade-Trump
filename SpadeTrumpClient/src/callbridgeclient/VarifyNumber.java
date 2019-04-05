/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package callbridgeclient;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author Sanim
 */
public class VarifyNumber extends InputVerifier {

    @Override
    public boolean verify(JComponent jc) {
        JTextField tmp = (JTextField) jc;
        try{
            int num = Integer.valueOf(tmp.getText());
            if(num >= 2 && num <= 13){
                tmp.setBackground(Color.WHITE);
                return true;
            }else {
                tmp.setBackground(Color.RED);
                return false;
            }
        }catch(Exception e){
            tmp.setBackground(Color.RED);
            return false;
        }
    }
    
}
