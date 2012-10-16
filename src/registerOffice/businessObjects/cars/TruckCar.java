package registerOffice.businessObjects.cars;

public class TruckCar extends Car{

	private String registerNumber;

	@Override
	public String getCarDetails() {
		return "This is a truck.";
	}

	@Override
	public Car Clone() {
		PersonCar returnValue =new PersonCar();
		returnValue.setRegisterNumber(this.registerNumber);
		
		return returnValue;
		
	}
}

