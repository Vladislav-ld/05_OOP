package by.htp.les.text;

public class Main {

	public static void main(String[] args) {
		Word word1 = new Word("Aaaaaa");
		Word word2 = new Word("Bbbbb");
		Word word3 = new Word("Ccccc");
		Word word4 = new Word("Ddddd");
		Word word5 = new Word("Eeeee");
		
		Symbol symbol1 = new Symbol(".");
		Symbol symbol2 = new Symbol(",");
		Symbol symbol3 = new Symbol("!");
		Symbol symbol4 = new Symbol("?");
		Symbol symbol5 = new Symbol("-");
		
		PartOfSentence part1 = new PartOfSentence(symbol1);
		part1.add(word1);
		part1.add(word2);
		part1.add(word3);
		part1.add(word4);
		
		PartOfSentence part2 = new PartOfSentence(symbol2);
		PartOfSentence part3 = new PartOfSentence(symbol1);
		part2.add(word5);
		part2.add(word2);
		part2.add(word1);
		
		part3.add(word3);
		part3.add(word2);
		part3.add(word4);
		
		PartOfSentence part4 = new PartOfSentence(symbol2);
		PartOfSentence part5 = new PartOfSentence(symbol3);
		
		part4.add(word1);
		part4.add(word5);
		part4.add(word4);
		part4.add(word3);
		part4.add(word2);
		
		part5.add(word5);
		part5.add(word3);
		part5.add(word2);
		
		PartOfSentence part6 = new PartOfSentence(symbol2);
		PartOfSentence part7 = new PartOfSentence(symbol4);
		
		part6.add(word4);
		part6.add(word3);
		part6.add(word2);
		part7.add(word1);
		
		part7.add(word3);
		part7.add(word1);
		part7.add(word4);
		
		PartOfSentence part8 = new PartOfSentence(symbol5);
		PartOfSentence part9 = new PartOfSentence(symbol1);
		
		part8.add(word5);
		part8.add(word1);
		part8.add(word4);
		part8.add(word2);
		
		part9.add(word3);
		part9.add(word2);
		part9.add(word4);
		part9.add(word3);
		

		Sentence sent1 = new Sentence();
		Sentence sent2 = new Sentence();
		Sentence sent3 = new Sentence();
		Sentence sent4 = new Sentence();
		Sentence sent5 = new Sentence();
		
		sent1.add(part1);
		
		sent2.add(part2);
		sent2.add(part3);
		
		sent3.add(part4);
		sent3.add(part5);
		
		sent4.add(part6);
		sent4.add(part7);
		
		sent5.add(part8);
		sent5.add(part9);
		
		PartOfText partText1 = new PartOfText();
		partText1.add(sent1);
		partText1.add(sent2);
		partText1.add(sent3);
		
		PartOfText partText2 = new PartOfText();
		partText2.add(sent4);
		partText2.add(sent5);
		partText2.add(sent1);
		
		Text text = new Text("Text");
		text.add(partText1);
		text.add(partText2);
		
		Logic logic = new Logic();
		logic.getText(text);
	}

}
