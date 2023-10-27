package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> st = new LinkedHashSet<>(
				Arrays.asList(new String[] {"Ram","Aman","Golu","John","Ram"}));
		Iterator<String> it = st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());// inserting order preserve
		}
		System.out.println("****************HashSet**********************");
		Set<String> st1 = new HashSet<>(
				Arrays.asList(new String[] {"Ram","Aman","Golu","John","Ram"}));
		 it = st1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());// inserting order not preserve
		}
		
		System.out.println(st1.contains("John"));

	}

}
