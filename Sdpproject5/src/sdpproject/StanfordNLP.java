package sdpproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;


public class StanfordNLP implements NLPInterface{
	MaxentTagger tagger;
	public StanfordNLP(){
		try {
			tagger = new MaxentTagger("taggers/left3words-wsj-0-18.tagger");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	



	@Override
	public String[] getAllNouns(String txt) {
		// TODO Auto-generated method stub
		ArrayList<String> nouns=new ArrayList<String>();
		
		String tagged=tagger.tagString(txt);
		StringTokenizer strT1 = new StringTokenizer(tagged);
		while(strT1.hasMoreTokens())
        {  
               String word_tag = strT1.nextToken();
               String [] word=word_tag.split("/NN.*");
               if (!word[0].equals(word_tag))
            	   nouns.add(word[0]);
              
        }
		String[] n=new String[nouns.size()];
		for(int i=0;i<nouns.size();i++){
                    n[i]=nouns.get(i);
                    System.out.println(n[i]);
                }
			
		return n;
	}

	@Override
	public String[] getAllVerbs(String txt) {
		// TODO Auto-generated method stub
		ArrayList<String> verbs=new ArrayList<String>();
		
		String tagged=tagger.tagString(txt);
		StringTokenizer strT1 = new StringTokenizer(tagged);
		while(strT1.hasMoreTokens())
        {  
               String word_tag = strT1.nextToken();
               String [] word=word_tag.split("/VB.*");
               if (!word[0].equals(word_tag))
            	   verbs.add(word[0]);
              
        }
		String[] v=new String[verbs.size()];
		for(int i=0;i<verbs.size();i++){
                    v[i]=verbs.get(i);
                    System.out.println(v[i]);
                }
			
		return v;
	}
	
	

}
