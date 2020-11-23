package by.htp.les.text;

import java.util.ArrayList;
import java.util.List;

public class PartOfSentence {
	
	private List<Word> words;
	private Symbol symbol;
	
	public PartOfSentence(Symbol symbol) {
		words = new ArrayList<Word>();
		this.symbol = symbol;
	}

	public List<Word> getWords() {
		return words;
	}
	
	public Word getWord(int index) {
		return words.get(index);
	}

	public void add(Word word) {
		words.add(word);
	}

	public Symbol getSymbol() {
		return symbol;
	}

	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		result = prime * result + ((words == null) ? 0 : words.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PartOfSentence other = (PartOfSentence) obj;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		if (words == null) {
			if (other.words != null)
				return false;
		} else if (!words.equals(other.words))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PartOfSentence [words=" + words + ", symbol=" + symbol + "]";
	}
	
	

}
