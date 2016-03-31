import java.util.HashMap;
import java.util.Map;


public class TestFile {	

//	public static String getHint(String secret, String guess){ 
//
//	    }

	
	 public static boolean wordPattern(String pattern, String str) {
	        Map<Character, String> map = new HashMap<Character, String>();
	        String[] words = str.split(" ");
	        for(int i=0;i<words.length;i++){
	        	 System.out.print(words[i]);
	        }
	        if(pattern.length()!=words.length){
	        	return false;
	        }
	        else{
	        	for(int i =0;i<pattern.length();i++){
	        		if(map.containsKey(pattern.charAt(i))){
	        			if(!map.get(pattern.charAt(i)).equals(words[i])){
	        				return false;
	        			}
	        			
	        		}
	        		else{
	        			if(map.containsValue(words[i])){
	        				return false;
	        			}
	        			map.put(pattern.charAt(i), words[i]);
	        		}
	        	}
	        }
		 return true;
	 }
	 public static void main(String []args){
		 int N = 4;
		 String pattern="aaaa";
		 String str ="dog dog dog dog";
		 System.out.print(wordPattern(pattern, str));
	 }
}
