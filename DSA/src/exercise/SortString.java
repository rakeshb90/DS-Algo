package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortString {
	public class NumericSortComparator implements Comparator{
		
		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			String s1 = (String) o1;
			String s2 = (String) o2;
			s1 = s1.split("-")[1];
			s2 = s2.split("-")[1];
			return Integer.parseInt(s1)-Integer.parseInt(s2);
		}
		
	}
public class LexicographicalSortComparator implements Comparator{
		
		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			String s1 = (String) o1;
			String s2 = (String) o2;
			s1 = s1.split("-")[1];
			s2 = s2.split("-")[1];
			return s1.compareTo(s2);
		}
		
	}
	public static void main(String[] args) {
		List<String> strs = Arrays.asList(new String[]{"12-23-20","40-18-29",
				"02-022-19","010-0020-89","66-023-19","10-12-34"});
		SortString obj = new SortString();
		// sort string with respect to second column in numerical order
		Collections.sort(strs,obj.new NumericSortComparator());
		for(String s:strs)
			System.out.println(s);
		System.out.println("****************LexicographicalSortComparator**********************");
		// sort string with respect to second column in lexico order
		Collections.sort(strs,obj.new LexicographicalSortComparator());
		for(String s:strs)
			System.out.println(s);
		
		
	}

}
