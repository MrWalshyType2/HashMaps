package com.qa.morse_code_translator;

public class App {
	public static void main(String[] args) {
		MorseTranslator translator = new MorseTranslator();
		translator.populateMorseMap();
		System.out.println(translator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
		System.out.println(translator.translateWithStream(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
	}
}
