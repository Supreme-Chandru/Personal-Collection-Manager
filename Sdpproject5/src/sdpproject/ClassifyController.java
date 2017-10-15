package sdpproject;


public class ClassifyController {
    
        public static PhraseComponent parent = null;
        
        public void setPhraseComponent(PhraseComponent parent){
            this.parent = parent;
        }
    
        public void classifyNoundAndVerb(String phrase,String type, PhraseComponent parent){
            this.parent = parent;
             BusinessProcessPanel bpPanel = new BusinessProcessPanel();
             bpPanel.showBusinessProcessPanel(bpPanel, phrase, type);
        }
        
        
        
        
	public void classify(String phrase,String type)
	{
            
             
		if(type=="BusinessProcess"){
                    
                       BusinessProcess businessProcess = new BusinessProcess(phrase,1);
			this.parent.append(businessProcess);
//			//System.out.println("Added business process");
//			
		}
//                
//                
		else if(type=="Step")
		{
			Step step= new Step(phrase);
			 parent.append(step);
//			//System.out.println("Added step to business process");
		}
//                
		else if(type=="Action")
		{
//                   
			Action action=new Action(phrase);
			 parent.append(action);
//			//System.out.println("Added action to step");
		}
	}
        
}