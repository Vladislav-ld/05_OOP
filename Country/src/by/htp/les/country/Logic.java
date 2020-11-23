package by.htp.les.country;

public class Logic {
	
	public void getCapital(Country country) {
		for(int i = 0; i < country.getDistrict().size(); i++) {
			for(int j = 0; j < country.getDistrict(i).getRegion().size(); j++) {
				for(int k = 0; k < country.getDistrict(i).getRegion(j).getCity().size(); k++) {
					if(country.getDistrict(i).getRegion(j).getCity(k).isCapital()) {
						System.out.println(country.getDistrict(i).getRegion(j).getCity(k).getName());
					}
				}
			}
			
		}
		
	}
	
	public void getDistrictCenter(Country country) {
		for(int i = 0; i < country.getDistrict().size(); i++) {
			for(int j = 0; j < country.getDistrict(i).getRegion().size(); j++) {
				for(int k = 0; k < country.getDistrict(i).getRegion(j).getCity().size(); k++) {
					if(country.getDistrict(i).getRegion(j).getCity(k).isDistrictCenter()) {
						System.out.println(country.getDistrict(i).getRegion(j).getCity(k).getName());
					}
				}
			}
			
		}
		
	}
	
	public int getCountDistricts(Country country) {
		return country.getDistrict().size();
	}
	
	public int gerArea(Country country) {
		int area = 0;
		for(int i = 0; i < country.getDistrict().size(); i++) {
			for(int j = 0; j < country.getDistrict(i).getRegion().size(); j++) {
				area +=country.getDistrict(i).getRegion(j).getArea();
			}
		}
		return area;
	}

}
