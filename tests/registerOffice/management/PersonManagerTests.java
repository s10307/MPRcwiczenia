package registerOffice.management;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import registerOffice.businessObjects.persons.Person;

public class PersonManagerTests {

	@Test
	public void save_method_should_correctly_add_person_to_database() {
		
		Person p = new Person("Adam");
		
		List<Person> persons= DatabaseContext.getPersons();
		
		PersonManager mgr=new PersonManager();
		mgr.save(p);
		assertTrue("Size is still zero",persons.size()>0);
		
		assertEquals("Names do not match",p.getName(), persons.get(0).getName());
		assertNotSame("It shouldn't be the same place in memory",p, persons.get(0));
		
		persons.clear();
	}
	


}
