package by.htp.les.country;

import java.util.ArrayList;
import java.util.List;

public class Region {
	
	private String name;
	private List<City> city;
	private int area;
	
	public Region (String name, int area) {
		city = new ArrayList<City>();
		this.name = name;
		this.area = area;
	}
	
	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<City> getCity() {
		return city;
	}
	
	public City getCity(int index) {
		return city.get(index);
	}
	
	public void add(City c) {
		city.add(c);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + area;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
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
		Region other = (Region) obj;
		if (area != other.area)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
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
		return "Region [name=" + name + ", city=" + city + ", area=" + area + "]";
	}
	
	

}
