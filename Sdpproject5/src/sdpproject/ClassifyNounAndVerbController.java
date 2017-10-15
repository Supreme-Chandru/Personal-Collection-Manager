/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdpproject;

import javax.swing.JMenuItem;
import javax.swing.JTextField;

/**
 *
 * @author Mahesh
 */
public class ClassifyNounAndVerbController {
    
   
    public static String noun = "";
    public static String verb = "";

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }
    
    public String getPhrase(){
        return this.verb+ " "+ this.noun;
    }
    
    public void clearPhrase(){
        this.noun = "";
        this.verb = "";
    }
    
    public void classify(String phrase,String type, PhraseComponent parent) {
		if(type=="noun"){
//                        BusinessProcessPanel bpPanel = new BusinessProcessPanel();
//                        bpPanel.showBusinessProcessPanel(bpPanel, phrase);
//			BusinessProcess businessProcess = new BusinessProcess(phrase,1);
//			parent.append(businessProcess);
			//System.out.println("Added business process");
                        //nounVerbPharser.setNoun(phrase);
                        //jTextField.setText(phrase);
                        this.noun = phrase;
			
		}
                
                
		else if(type=="verb")
		{
//			 Step step= new Step(phrase);
//			 parent.append(step);
			//System.out.println("Added step to business process");
                        //nounVerbPharser.setVerb(phrase);
                         this.verb = phrase;
		}
                
	}
    
    public void setBusinessProcess(){
        //                       BusinessProcess businessProcess = new BusinessProcess(nounVerbPhrase.getPhrase(),1);
//			parent.append(businessProcess);
    }
  
}
