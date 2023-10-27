package string;

public class Space20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello world, how are you?";
		s = s.replace(" ", "%20");
		System.out.println(s);
		s = "Ram@jam*jan@mam*pop";
		for(String x: s.split("@"))
		System.out.println(x); 
		char[] ch = s.toCharArray();
		System.out.println(ch[s.length()]);
		

	}

}
