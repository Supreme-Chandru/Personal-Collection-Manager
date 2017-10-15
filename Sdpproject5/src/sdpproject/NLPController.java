package sdpproject;


public class NLPController {
	NLPManager nlpm=null;
	public NLPController(){
		this.nlpm=new NLPManager();
	}
	public String[] getAllNouns(String txt){
		
		return nlpm.getAllNouns(txt);
	}
	
	public String[] getAllVerbs(String txt){
		
		return nlpm.getAllVerbs(txt);
	}
	
	//for test:
//	public static void main(String[] args){
//		String txt="An undergraduate student or a graduate student can apply to exchange programs per semester";
//		System.out.println("original text:"+txt);
//		NLPController nlpc=new NLPController();
//		String[] nouns=nlpc.getAllNouns(txt);
//		String[] verbs=nlpc.getAllVerbs(txt);
//		int i=0;
//		System.out.print("nouns:");
//		for(i=0;i<nouns.length;i++)
//			System.out.print("\""+nouns[i]+"\" ");
//		System.out.println();
//		System.out.print("verbs:");
//		for(i=0;i<verbs.length;i++)
//			System.out.print("\""+verbs[i]+"\" ");
//	}

}
