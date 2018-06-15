package hung.com.jstl.dao;

import java.util.ArrayList;
import java.util.List;

import hung.com.jstl.model.Person;


public class PersonDao {
    private static List<Person> persons = new ArrayList<Person>();
    
    static {
        persons.add(new Person("Bill", "Gates"));
        persons.add(new Person("Steve", "Jobs"));
    }
    
    public static List<Person>  getPersons(){
    	return persons;
    }
    
    public static Person getAuthor(){
    	
    	return new Person("Hung", "Nguyen Manh");
    }
}
