package by.htp.les.country;

import java.util.ArrayList;
import java.util.List;

public class District {
	
	private String name;
	private List<Region> region;
	
	public District(String name) {
		region = new ArrayList<Region>();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Region> getRegion() {
		return region;
	}
	
	public Region getRegion(int index) {
		return region.get(index);
	}
	
	public void add(Region reg) {
		region.add(reg);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
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
		District other = (District) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "District [name=" + name + ", region=" + region + "]";
	}
	
	
	

}
