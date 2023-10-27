package map;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestPutIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"Ram","Raj","Ravi","Ram","Raj","Ram"};
		List<String> nameList = Arrays.asList(names);
		Map<String,Integer> freq = new HashMap<>();
		for(String name:nameList) {
			freq.putIfAbsent(name, Collections.frequency(nameList, name));
		}
		System.out.println(freq);

	}

}
