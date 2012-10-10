package registerOffice;

import registerOffice.businessObjects.persons.Person;
import registerOffice.management.*;

public class Main {

	public static void main(){
	
	PersonManager mgr= new PersonManager();
	boolean saved= mgr.save(new Person("Adam"));
	Person person =mgr.get(new Condition<Person>(){
		@Override
		public boolean getCondition(Person p)
		{
			return p.getName() == "Adam";
		}
	});
	System.out.println(person.getName());
	}
	

}
