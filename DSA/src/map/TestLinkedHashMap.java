package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new LinkedHashMap<>();
		map.put("Ram", 20);
		map.put("Sita", 22);
		map.put("Suraj", 15);
		map.put("Suraj", 20);
		map.put(null, 0);
		map.put("0", null);
		map.put(null, 20);
		System.out.println(map);// order of insertion maintained 
		System.out.println(map.values());
	}

}
