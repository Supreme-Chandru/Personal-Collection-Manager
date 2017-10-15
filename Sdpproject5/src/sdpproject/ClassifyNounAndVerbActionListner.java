/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdpproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Mahesh
 */
public class ClassifyNounAndVerbActionListner implements ActionListener{
    

    @Override
    public void actionPerformed(ActionEvent e) {
          JMenuItem item = (JMenuItem)e.getSource();
//        JTextArea jTextArea1 = (JTextArea) MainFrame.hashmap.get("jTextArea1");
          
        
        if(!(BusinessProcessPanel.textSelected.equals(""))){
            ClassifyNounAndVerbController classifyController = new ClassifyNounAndVerbController();
            classifyController.clearPhrase();
            classifyController.classify(BusinessProcessPanel.textSelected,
                                    item.getClientProperty("type").toString(),
                                     (PhraseComponent)item.getClientProperty("appendTo")
                                    
            );
           // BusinessProcessPanel.setNoun(s);
        }
        
        BusinessProcessPanel frame = (BusinessProcessPanel) BusinessProcessPanel.hashmap.get("frame");
        if(item.getClientProperty("type").toString() == "noun"){
             frame.updateNoun();
        }
        if(item.getClientProperty("type").toString() == "verb"){
             frame.updateVerb();
        }
       
        BusinessProcessPanel.textSelected = "";
    }

    
    
}
