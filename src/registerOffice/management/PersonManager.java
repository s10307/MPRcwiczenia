package registerOffice.management;

import java.util.List;

import registerOffice.businessObjects.persons.Person;

public class PersonManager implements ManagerInterface<Person>{

	private List<Person> persons=DatabaseContext.getPersons();
	
	@Override
	public Person get(int a) {
		return persons.get(a);
	}

	@Override
	public List<Person> getAll() {
		return persons;
	}

	@Override
	public boolean save(Person person) {
		return persons.add(new Person(person.getName()));
	}

	@Override
	public void delete(int a) {
		persons.remove(a);
	}

}
