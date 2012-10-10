package registerOffice.businessObjects.cars;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParsonCarTests {

	@Test
	public void clone_method_should_return_new_car_object() {
		
		PersonCar c =new PersonCar();
		
		PersonCar returnValue=(PersonCar)c.Clone();
		
		assertNotNull(returnValue);
		assertTrue(c.getRegisterNumber()==returnValue.getRegisterNumber());
		assertEquals(c.owner,returnValue.owner);
		assertNotSame(c, returnValue);
	
	}

}
