package java8;

import java.util.Arrays;
import java.util.StringTokenizer;

public class CountOccuranceOfWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "This is my information. My self Rk, my resume will tell that.";
		String word = "my";
		StringTokenizer tokenizer = new StringTokenizer(source,".");
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
		source = source.replace(".", "");
		source = source.replace(",", "");
		long count = Arrays.stream(source.split(" ")).filter(w->w.equalsIgnoreCase(word)).count();
		
       System.out.println("Occurance is : "+count);
	}

}
