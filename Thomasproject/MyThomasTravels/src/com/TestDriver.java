package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDriver {
	
	public static void main(String[] args) {
		
		System.out.println("-------------------------Method1-------------------------------");
		Driver driver1 = new Driver(1,"Raju","Car",3237.67);
		Driver driver2 = new Driver(2,"Ganesh","Lorry",5437.87);
		Driver driver3 = new Driver(3,"Vijay","Auto",7437.87);
		Driver driver4 = new Driver(4,"Murali","Car",6437.87);
//		System.out.println(driver1);
//		System.out.println(driver2);
//		System.out.println(driver3);
//		System.out.println(driver4);
//Method 1: isCarDrier()		
		Travel travel = new Travel();
		boolean carDriver = travel.isCarDriver(driver4);
		System.out.println("is he Car Driver: "+carDriver);
		boolean carDriver3 = travel.isCarDriver(driver3);
		System.out.println("is he Car Driver: "+carDriver3);
		
		System.out.println("-------------------------Driver List-------------------------------");
		
		ArrayList<Driver> driversList = new ArrayList<Driver>( Arrays.asList(driver2,driver3,driver4));
		driversList.add(driver1);
		System.out.println("All drivers List ");
		for(Driver drivers: driversList) {
			
			System.out.println("driver "+drivers.getDriverId() +" "+drivers);
		}
		
		System.out.println("-------------------------Method2-------------------------------");
		
		String driverNameById = travel.retriveByDriverId(driversList, 2);
		System.out.println(driverNameById);
		String driverNameById1 = travel.retriveByDriverId(driversList, 1);
		System.out.println(driverNameById1);
		System.out.println("-------------------------Method3-------------------------------");
		
		long retriveCountOfDriver = travel.retriveCountOfDriver(driversList, "Lorry");
		System.out.println("retriveCountOfDriver: " +" Members "+ retriveCountOfDriver);
		long retriveCountOfDriver1 = travel.retriveCountOfDriver(driversList, "Car");
		System.out.println("retriveCountOfDriver: " +" Members "+ retriveCountOfDriver1);		
		
		System.out.println("-------------------------Method4-------------------------------");
		
//		ArrayList<String> drivers = travel.retriveDriver(driversList, "Car");
//		System.out.println("Drivers List of "+ "Category Car :"+drivers );
		List<Driver> drivers = travel.retriveDriver(driversList, "Car");
		System.out.println("Drivers List of "+ "Category Car :"+drivers );	
		
		
		System.out.println("-------------------------Method5-------------------------------");
		
		Driver maximumDistanceTravelledDriver = travel.retriveMaximumDistanceTravelledDriver(driversList);
		System.out.println("maximumDistanceTravelledDriver: "+maximumDistanceTravelledDriver.getDriverName()+" Distanace in KMs: "+ maximumDistanceTravelledDriver.getTotalDistance());
		
	}

}
