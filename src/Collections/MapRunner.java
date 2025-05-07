package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapRunner {
	public static void main(String[] args) {
		String str = "Hello Good Morning Everyone" + " Welcome to computer club";
		Map<String, Integer> map = Map.of("cat", 2, "dog", 3, "cow", 10);
		HashMap<Character, Integer> hm = new HashMap<>();
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
			lhm.put(str.charAt(i), lhm.getOrDefault(str.charAt(i), 0) + 1);
			tm.put(str.charAt(i), tm.getOrDefault(str.charAt(i), 0) + 1);

		}
		hm.put(null, null);
		lhm.put(null, null);
		tm.put('b', null);
		System.out.println(hm);
		System.out.println(lhm);
		System.out.println(tm);
		Map.Entry<String,Integer> entry = map.entrySet().iterator().next();
		System.out.println(entry);
		//OR WE CAN USE DIRECTLY Map.Entry in for loop
		for (Map.Entry<String, Integer> e : map.entrySet())
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
		System.out.println(tm.subMap('c', true, 'i', false));
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

	}
}
