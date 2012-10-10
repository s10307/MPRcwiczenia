package registerOffice.management;

import java.util.List;

import registerOffice.businessObjects.persons.Person;

public class PersonManager implements ManagerInterface<Person>{

	private List<Person> persons=DatabaseContext.getPersons();
	
	@Override
	public Person get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Person person) {
		
		return persons.add(new Person(person.getName()));
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

}
