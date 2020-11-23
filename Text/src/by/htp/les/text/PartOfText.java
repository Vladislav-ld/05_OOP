package by.htp.les.text;

import java.util.ArrayList;
import java.util.List;

public class PartOfText {
	
	private List<Sentence> partText;
	
	public PartOfText () {
		partText = new ArrayList<Sentence>();
	}
	
	public List<Sentence> getSentences() {
		return partText;
	}
	
	public Sentence getSentences(int index) {
		return partText.get(index);
	}

	public void add(Sentence p) {
		partText.add(p);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((partText == null) ? 0 : partText.hashCode());
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
		PartOfText other = (PartOfText) obj;
		if (partText == null) {
			if (other.partText != null)
				return false;
		} else if (!partText.equals(other.partText))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PartOfText [partText=" + partText + "]";
	}

	
}
