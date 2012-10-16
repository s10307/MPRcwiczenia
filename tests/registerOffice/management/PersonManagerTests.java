package registerOffice.management;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import registerOffice.businessObjects.persons.Person;

public class PersonManagerTests {

	@Test
	public void save_method_should_correctly_add_person_to_database() {
		
		Person p = new Person("Adam");
		
		PersonManager mgr=new PersonManager();
		mgr.save(p);
		assertTrue("Size is still zero",mgr.getAll().size()>0);
		
		assertEquals("Names do not match",p.getName(), mgr.getAll().get(0).getName());
		assertNotSame("It shouldn't be the same place in memory",p, mgr.getAll().get(0));
		
		mgr.getAll().clear();
	}
	
	@Test
	public void get_should_correctly_return_a_person_from_the_database() {
		
		Person p = new Person("Adam");
						
		PersonManager mgr=new PersonManager();
		mgr.save(p);		
				
		assertTrue("Size is still zero", mgr.getAll().size()>0);
		assertEquals("Names do not match", p.getName(), mgr.getAll().get(0).getName());
		assertNotSame("It shouldn't be the same place in memory",p, mgr.getAll().get(0));
		
		mgr.getAll().clear();
	}

	@Test
	public void getAll_should_correctly_return_all_persons_from_the_database() {
		
		Person p1 = new Person("Adam");
		Person p2 = new Person("Jasiu");
		Person p3 = new Person("Kuba");
		
		PersonManager mgr=new PersonManager();
		
		mgr.save(p1);
		mgr.save(p2);
		mgr.save(p3);
				
		assertEquals("Size does not match", mgr.getAll().size(), 3);
	
		mgr.getAll().clear();
	}
	
	@Test
	public void delete_should_correctly_delete_a_person_from_the_database() {

		Person p = new Person("Adam");
		
		PersonManager mgr=new PersonManager();

		mgr.save(p);

		assertTrue("Size is still zero", mgr.getAll().size()>0);
		
		mgr.delete(0);
		
		assertEquals("The list still has items on it", mgr.getAll().size(), 0);
		
		mgr.getAll().clear();
	}
	
}
