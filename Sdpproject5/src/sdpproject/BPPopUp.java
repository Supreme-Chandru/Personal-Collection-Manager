/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdpproject;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

/**
 *
 * @author Mahesh
 */
public class BPPopUp extends JPopupMenu  {
    
    JTextField nounTextField = null;
    JTextField verbTextField = null;
        
    JMenuItem noun;
    JMenuItem verb;
    Requirement requirement;
    public BPPopUp(){
        noun = new JMenuItem("Noun");
        verb = new JMenuItem("Verb");
        requirement = MainFrame.requirement;
        
        noun.putClientProperty("type", "noun" );
        noun.putClientProperty("appendTo", requirement );
        
        noun.addActionListener(new ClassifyNounAndVerbActionListner());
        
        verb.putClientProperty("type", "verb");
        verb.putClientProperty("appendTo", requirement );
        verb.addActionListener(new ClassifyNounAndVerbActionListner() );
        
        ClassifyNounAndVerbController cnv = new ClassifyNounAndVerbController();
        if(cnv.getNoun() == ""){
            add(noun);
        }
        
        if(cnv.getVerb() == ""){
            add(verb);
        }
        
        
    }
    
   

    
    
}
