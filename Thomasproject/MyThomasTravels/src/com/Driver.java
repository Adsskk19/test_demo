package com;

public class Driver {

	private int driverId;
	private String driverName;
	private String Category;
	private double totalDistance;

	public Driver() {
		super();
	}

	public Driver(int driverId,String  driverName, String Category, double totalDistance) {
		this.driverId= driverId;
		this.driverName = driverName;
		this.Category=Category;
		this.totalDistance= totalDistance;

	}
	public String getCategory() {
		return Category;
		
	}
	public void setCategory(String Category) {
		this.Category=Category;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public double getTotalDistance() {
		return totalDistance;
	}

	public void setTotalDistance(double totalDistance) {
		this.totalDistance = totalDistance;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", Category=" + Category
				+ ", totalDistance=" + totalDistance + "]";
	}
	
	
	
	
	
	

}
