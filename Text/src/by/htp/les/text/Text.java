package by.htp.les.text;

import java.util.ArrayList;
import java.util.List;

public class Text {
	
	private List<PartOfText> text;
	private String title;
	
	public Text(String title) {
		text = new ArrayList<PartOfText>();
		this.title = title;
	}
	
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public List<PartOfText> getPartOfText() {
		return text;
	}
	
	public PartOfText getPartOfText(int index) {
		return text.get(index);
	}

	public void add(PartOfText p) {
		text.add(p);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Text other = (Text) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Text [text=" + text + ", title=" + title + "]";
	}

	
	
	

}
