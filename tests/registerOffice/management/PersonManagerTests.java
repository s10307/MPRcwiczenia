package registerOffice.management;

import static org.junit.Assert.*;

import org.junit.Test;

import registerOffice.businessObjects.persons.Person;

public class PersonManagerTests {

	@Test
	public void get_tests() {
		
		PersonManager mgr= new PersonManager();
		boolean saved= mgr.save(new Person("Adam"));
		Person person =mgr.get(new Condition<Person>(){
			@Override
			public boolean getCondition(Person p)
			{
				return p.getCars().size() > 0 && p.getName()=="Adam" ;
			}
		});
		
		assertTrue(DatabaseContext.getPersons().size()==1);
		assertTrue(person.getName().equals("Adam"));
		
	}

}
