package com.qa.morse_code_translator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MorseTranslator {
	private Map<String, String> morse = new HashMap<>();

	public void populateMorseMap() {
		morse.put(".-", "A");
		morse.put("-...", "B");
		morse.put("-.-.", "C");
		morse.put("-..", "D");
		morse.put(".", "E");
		morse.put("..-.", "F");
		morse.put("--.", "G");
		morse.put("....", "H");
		morse.put("..", "I");
		morse.put(".---", "J");
		morse.put("-.-", "K");
		morse.put(".-..", "L");
		morse.put("--", "M");
		morse.put("-.", "N");
		morse.put("---", "O");
		morse.put(".--.", "P");
		morse.put("--.-", "Q");
		morse.put(".-.", "R");
		morse.put("...", "S");
		morse.put("-", "T");
		morse.put("..-", "U");
		morse.put("...-", "V");
		morse.put(".--", "W");
		morse.put("-..-", "X");
		morse.put("-.--", "Y");
		morse.put("--..", "Z");
		morse.put(".----", "1");
		morse.put("..---", "2");
		morse.put("...--", "3");
		morse.put("....-", "4");
		morse.put(".....", "5");
		morse.put("-....", "6");
		morse.put("--...", "7");
		morse.put("---..", "8");
		morse.put("----.", "9");
		morse.put("-----", "0");
		morse.put("/", " ");
	}

//	public String translate(String code) {
//		String[] codes = code.split(" ");
//		StringBuilder output = new StringBuilder();
//
//		for (String i : codes) {
//			System.out.println(i);
//			if (i.contentEquals("/")) {
//				output.append(" ");
//			} else {
//				output.append(morse.get(i));
//			}
//		}
//
//		String o = output.toString();
//
//		return o;
//	}

	public String translate(String code) {
		String[] codes = code.split(" ");
		StringBuilder output = new StringBuilder();

		for (String i : codes) {
			output.append(morse.get(i));
		}

		String o = output.toString();

		return o;
	}

	public String translateWithStream(String code) {
		return Arrays.stream(code.split(" ")).map(n -> morse.get(n)).collect(Collectors.joining(""));
	}
}
