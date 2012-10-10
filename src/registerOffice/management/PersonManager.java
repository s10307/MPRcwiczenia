package registerOffice.management;

import java.util.List;

import registerOffice.businessObjects.persons.Person;

public class PersonManager implements ManagerInterface<Person>{

	private List<Person> persons=DatabaseContext.getPersons();
	
	@Override
	public Person get(Condition<Person> condition) {
		
		Person result=null;
		
		for(Person p : persons)
		{
			if(condition.getCondition(p))
			{
				result =p;
				break;
			}
		}
		
		return result;
	}

	@Override
	public List<Person> getAll() {
		
		return persons;
	}

	@Override
	public boolean save(Person p) {
		
		
		return persons.add(p);
	}

	@Override
	public boolean delete(Person p) {
		
		return persons.remove(p);
	}

}
