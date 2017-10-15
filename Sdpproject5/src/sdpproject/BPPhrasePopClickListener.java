/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdpproject;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

/**
 *
 * @author Mahesh
 */
public class BPPhrasePopClickListener extends MouseAdapter{

    
     public void mousePressed(MouseEvent e){
        if (e.isPopupTrigger())
            doPop(e);
        
    }

    public void mouseReleased(MouseEvent e){
        if (e.isPopupTrigger())
            doPop(e);
    }

    private void doPop(MouseEvent e){
        BPPopUp menu = new BPPopUp();
        menu.show(e.getComponent(), e.getX(), e.getY());
    }
    
}
