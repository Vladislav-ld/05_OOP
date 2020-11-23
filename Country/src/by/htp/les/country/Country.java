package by.htp.les.country;

import java.util.ArrayList;
import java.util.List;

public class Country {
	
	private String name;
	private List<District> districts;
	
	public Country(String name) {
		districts = new ArrayList<District>();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<District> getDistrict() {
		return districts;
	}
	
	public District getDistrict(int index) {
		return districts.get(index);
	}
	
	public void add(District dis) {
		districts.add(dis);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((districts == null) ? 0 : districts.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Country other = (Country) obj;
		if (districts == null) {
			if (other.districts != null)
				return false;
		} else if (!districts.equals(other.districts))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", districts=" + districts + "]";
	}

}
