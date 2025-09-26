package com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Travel {

	// ---------------------------Method1--------------------------------

	public boolean isCarDriver(Driver driver) {
//		if(driver.getCategory()=="Car") {
//			return true;
//		}
//		else{
//			return false;
//		}

//		boolean result = (driver.getCategory().equalsIgnoreCase("Car")) ?  true:  false;
//		return result;

		return driver.getCategory().equalsIgnoreCase("Car");

	}

	// ---------------------------Method2--------------------------------

	public String retriveByDriverId(ArrayList<Driver> drivers, int driverId) {

//	String driverName = drivers.get(driverId).getDriverName();
//	String category = drivers.get(driverId).getCategory();
//	double totalDistance = drivers.get(driverId).getTotalDistance();
//	return "Driver Name is: "+driverName +" belonging to Category: "+ category +" traveled: "+ totalDistance+ " KM so far";

//	for(Driver driver : drivers) {
//		if(driver.getDriverId()==driverId) {
//		return "Driver Name is: "+driver.getDriverName() +" belonging to Category: "+ driver.getCategory() +" traveled: "+ driver.getTotalDistance()+ " KM so far";
//		}
//	}
//		
//		return "No driver Found";

		return drivers.stream().filter(d -> d.getDriverId() == driverId).findFirst()
				.map(d -> String.format("Driver Name is %s belonging to Category: %s traveled: %f KM so far",
						d.getDriverName(), d.getCategory(), d.getTotalDistance()))
				.orElse("No driver Found");

	}

	// ---------------------------Method3--------------------------------
	public long retriveCountOfDriver(ArrayList<Driver> drivers, String driverCategory) {
		
//		long count = 0;
//
//		for (Driver driver : drivers) {
//			if (driver.getCategory().equalsIgnoreCase(driverCategory)) {
//				count++;
//			}
//		}
//		return count;
		

		return drivers
		.stream()
		.filter(d->d.getCategory().equalsIgnoreCase(driverCategory))
		.count();
		
		
	}

	// ---------------------------Method4--------------------------------

	public List<Driver> retriveDriver(ArrayList<Driver> drivers, String category) {
		
//		ArrayList<String> newList = new ArrayList<String>();
//		
//		for(Driver driver : drivers) {
//			if(driver.getCategory().equalsIgnoreCase(category)) {
//				
//				newList.add(driver.getDriverName());
//				
//			}
//			
//		}
//		return newList;
		
		
		
		
	return	drivers
		.stream()
		.filter(d->d.getCategory().equalsIgnoreCase(category))
		.toList();
		
		

	

	}

	// ---------------------------Method5--------------------------------

	public Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> drivers) {
		
		
//		Driver maxDriver = drivers.get(0);
//		
//		for(Driver driver : drivers) {
//			
//			if(driver.getTotalDistance()>maxDriver.getTotalDistance()) {
//				maxDriver=driver;
//			}
//		}
//		return maxDriver;
		
		return drivers
		.stream()
		.sorted((d1,d2)-> Double.compare(d2.getTotalDistance(), d1.getTotalDistance()))
		.findFirst()
		.get();
		
		
		
		


	}

}
