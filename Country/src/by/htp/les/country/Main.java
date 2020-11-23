package by.htp.les.country;

public class Main {

	public static void main(String[] args) {
		
		City city1 = new City("A", true, true, true);
		City city2 = new City("B", true, false, false);
		City city3 = new City("C", false, false, false);
		City city4 = new City("D", false, false, false);
		City city5 = new City("E", true, true, false);
		City city6 = new City("F", true, false, false);
		City city7 = new City("G", false, false, false);
		City city8 = new City("H", false, false, false);
		City city9 = new City("I", true, true, false);
		City city10 = new City("J", true, false, false);
		City city11 = new City("K", false, false, false);
		City city12 = new City("L", false, false, false);
		
		Region region1 = new Region("A", 190);
		Region region2 = new Region("B", 260);
		Region region3 = new Region("E", 220);
		Region region4 = new Region("F", 160);
		Region region5 = new Region("I", 180);
		Region region6 = new Region("J", 230);
		
		region1.add(city1);
		
		region2.add(city2);
		region2.add(city3);
		region2.add(city4);
		
		region3.add(city5);
		region3.add(city7);
		
		region4.add(city6);
		region4.add(city8);
		
		region5.add(city9);
		
		region6.add(city10);
		region6.add(city11);
		region6.add(city12);
		
		District dis1 = new District("A");
		dis1.add(region1);
		dis1.add(region2);
		
		District dis2 = new District("E");
		dis2.add(region3);
		dis2.add(region4);
		
		District dis3 = new District("I");
		dis3.add(region5);
		dis3.add(region6);
		
		Country country = new Country("MyCountry");
		country.add(dis1);
		country.add(dis2);
		country.add(dis3);
		
		Logic logic = new Logic();
		
		System.out.println(country.getName());
		logic.getCapital(country);
		
		System.out.println();
		System.out.println(logic.getCountDistricts(country));
		logic.getDistrictCenter(country);
		
		
		
		System.out.println();
		System.out.println(logic.gerArea(country));
		
	}

}
