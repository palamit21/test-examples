import java.util.ArrayList;
import java.util.Arrays;

public class LongestSubString {

	public static void main(String[] args) {
	String []words = {"Watermelon","Apple", "Melon", "Orange"};
			String []parts = {"a", "pp", "el", "An"};
			findSubSring(words,parts);

	}

	private static void findSubSring(String[] words, String[] parts) {
		String[] outPut = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			String temp="";		
			for (String part : parts) {
                //size = part.length();
                if (words[i].contains(part) && part.length() > temp.length()) {
                       temp = part;
                       if(words[i].indexOf(part) <= words[i].indexOf(temp))
                       outPut[i] = words[i].replace(part, "[" + part + "]");
                       
                }
          }

			
			
		}
		System.out.println(Arrays.toString(outPut));
		
	}

}
