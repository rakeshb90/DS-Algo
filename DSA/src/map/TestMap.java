package map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<>();
		map.put("Ram", 20);
		map.put("Sita", 22);
		map.put("Suraj", 15);
		map.put("Suraj", 20);
		System.out.println(map);
		System.out.println(map.containsKey("Ram"));
		System.out.println(map.containsKey("Xyz"));
		System.out.println(map.containsValue(20));
		System.out.println(map.containsValue(200));
		

	}

}
