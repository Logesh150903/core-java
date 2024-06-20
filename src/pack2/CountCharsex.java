package pack2;

import java.util.HashMap;
import java.util.Map;

public class CountCharsex {

	public Map<Character, Integer> countChars(char[] arr) {

		Map<Character, Integer> charCountMap = new HashMap<>();

		for (char ch : arr) {
			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
		}

		return charCountMap;
	}

	public static void main(String[] args) {
		CountCharsex source = new CountCharsex();
		char[] arr = { 'a', 'f', 'c', 'd', 'a', 'c' };

		Map<Character, Integer> result = source.countChars(arr);

		System.out.println(result);
	}
}
