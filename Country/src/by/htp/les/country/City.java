package by.htp.les.country;

public class City {
	
	private String name;
	private boolean isRegionCenter;
	private boolean isDistrictCenter;
	private boolean isCapital;
	
	public City (String Name, boolean isRegionCenter, boolean isDistrictCenter,boolean isCapital) {
		this.name = Name;
		this.isCapital = isCapital;
		this.isDistrictCenter = isDistrictCenter;
		this.isRegionCenter = isRegionCenter;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isRegionCenter() {
		return isRegionCenter;
	}
	public void setRegionCenter(boolean isRegionCenter) {
		this.isRegionCenter = isRegionCenter;
	}
	public boolean isDistrictCenter() {
		return isDistrictCenter;
	}
	public void setDistrictCenter(boolean isDistrictCenter) {
		this.isDistrictCenter = isDistrictCenter;
	}
	public boolean isCapital() {
		return isCapital;
	}
	public void setCapital(boolean isCapital) {
		this.isCapital = isCapital;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (isCapital ? 1231 : 1237);
		result = prime * result + (isDistrictCenter ? 1231 : 1237);
		result = prime * result + (isRegionCenter ? 1231 : 1237);
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
		City other = (City) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (isCapital != other.isCapital)
			return false;
		if (isDistrictCenter != other.isDistrictCenter)
			return false;
		if (isRegionCenter != other.isRegionCenter)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "City [Name=" + name + ", isRegionCenter=" + isRegionCenter + ", isDistrictCenter=" + isDistrictCenter
				+ ", isCapital=" + isCapital + "]";
	}
	
	

}
