package registerOffice.businessObjects.persons;

import java.util.ArrayList;
import java.util.List;

import registerOffice.businessObjects.cars.*;

public class Person {

	private String name;
	private List<Car> cars;
	
	public Person(String name) {
	
		this.name = name;
		this.cars=new CarsList(this);
		
	}
	
	public Person()
	{
		this("");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	
}
