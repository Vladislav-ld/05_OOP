package by.htp.les.text;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
	
	private List<PartOfSentence> sentence;
	
	public Sentence() {
		sentence = new ArrayList<PartOfSentence>();
	}
	
	public List<PartOfSentence> getPartOfSentence() {
		return sentence;
	}
	
	public PartOfSentence getPartOfSentence(int index) {
		return sentence.get(index);
	}

	public void add(PartOfSentence p) {
		sentence.add(p);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentence == null) ? 0 : sentence.hashCode());
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
		Sentence other = (Sentence) obj;
		if (sentence == null) {
			if (other.sentence != null)
				return false;
		} else if (!sentence.equals(other.sentence))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sentence [partSent=" + sentence + "]";
	}
	
	

}
