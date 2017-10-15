/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdpproject;

/**
 *
 * @author Home
 */
class ModifyController {

    Requirement modify(String modifyType, PhraseComponent selectedObject, PhraseComponent parentOfSelectedObject, String newphrase, int priorityRanking) {
        if(modifyType.equals(null) || modifyType.equals(""))
            return null;
        
        else if(modifyType.equals("Edit")&&(!newphrase.equals(null) | !newphrase.equals("")))
        {
            PhraseComponent p= (PhraseComponent)selectedObject;
            p.setPhrase(newphrase);

        }
        else if(modifyType.equals("Delete"))
        {
            
          
            parentOfSelectedObject.remove(selectedObject);
        }
        else if(modifyType.equals("Prioritize") && priorityRanking!=0)
        {
             BusinessProcess businessProcess = (BusinessProcess)selectedObject;
             businessProcess.setPriority(priorityRanking);
        }

        
        
        return null;
    }
    
}
