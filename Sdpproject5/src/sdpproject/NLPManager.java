package sdpproject;


public class NLPManager {
	
	private NLPInterface imp;
	
	public NLPManager(){
		imp= new StanfordNLP(); //One way to change different NLP dynamically
	}

	
	public String[] getAllNouns(String txt){
		return imp.getAllNouns(txt);
	}
	
	public String[] getAllVerbs(String txt){
		return imp.getAllVerbs(txt);
	}

}
