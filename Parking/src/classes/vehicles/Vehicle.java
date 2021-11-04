package classes.vehicles;

public class Vehicle {
	
	private String licensePlate;
	private String brand;
	private String model;
	private double parkingFactor;
	private String entryTime;
	private String exitTime;
	private double parkingTotal;
	private TypeCar typeCar;
	
	public Vehicle() {}
	public TypeCar getTypeCar() {
		return typeCar;
	}

	public void setTypeCar(TypeCar typeCar) {
		this.typeCar = typeCar;
	}

	public String getLicensePlate() {
		return licensePlate;
	}
	
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getParkingFactor() {
		return parkingFactor;
	}
	
	public void setParkingFactor(double parkingFactor) {
		this.parkingFactor = parkingFactor;
	}
	
	public String getEntryTime() {
		return entryTime;
	}
	
	public void setEntryTime(String entryTime) {
		this.entryTime = entryTime;
	}
	
	public String getExitTime() {
		return exitTime;
	}
	
	public void setExitTime(String exitTime) {
		this.exitTime = exitTime;
	}
	
	public double getParkingTotal() {
		return parkingTotal;
	}
	
	public void setParkingTotal(double parkingTotal) {
		this.parkingTotal = parkingTotal;
	}
	
}
