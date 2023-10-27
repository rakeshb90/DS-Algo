package map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	class LengthWiseComprator implements Comparator<String>{

		@Override
		public int compare(String str1, String str2) {
			// TODO Auto-generated method stub
			if(str1.length()==str2.length())
				return str1.compareTo(str2);
			else if(str1.length()<str2.length())
				return -1;
			return 1;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map<String,Integer> map = new TreeMap<>();
		Map<String,Integer> map = new TreeMap<>(new TestTreeMap().new LengthWiseComprator());
		map.put("Ram", 20);
		map.put("Sita", 22);
		map.put("Suraj", 15);
		map.put("Suraj", 20);
		map.put("Puja", 21);
//		map.put(null, 0);// not allowed
		map.put("0", null);
		System.out.println(map);// sorted order  natural order 
		System.out.println(map.values());

	}

}
