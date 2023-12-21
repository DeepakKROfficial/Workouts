package Workouts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTests {
	
	public static void main(String args[]) {

		String str = "Welcome to eclipse to";
		System.out.println(str);
		
		if(str.startsWith("t", 8)) {
			System.out.println("9th letter start with t");
		}
		List<Integer> numbers = Arrays.asList(25,13,15,8);
		System.out.println("Second smallest : "+ numbers.stream().sorted().skip(1).findFirst().get());
		List<Integer> grt10 = numbers.stream().filter(x -> x>10).collect(Collectors.toList());
		long count = numbers.stream().filter(x -> x>10).count();
		System.out.println(grt10);
		System.out.println(count);
		numbers.stream().forEach(x -> System.out.println(x+10));
		//Natural sort
		System.out.println(numbers.stream().sorted().collect(Collectors.toList()));
		//Reverse sort using comparator
		System.out.println(numbers.stream().sorted((i1,i2) -> i2.compareTo(i1)).collect(Collectors.toList()));
		//Min or max
		System.out.println(numbers.stream().max((i1,i2) -> i1.compareTo(i2)).get());

		PersonInfo person1 = new PersonInfo(1,"Deepak","pkd");
		PersonInfo person2 = new PersonInfo(2,"Deepak","ekm");
		PersonInfo person3 = new PersonInfo(3,"Anil","knnr");
		PersonInfo person4 = new PersonInfo(4,"KP","pmna");
		PersonInfo person5 = new PersonInfo(5,"Anandhu","mkd");
		List<PersonInfo> personInfos = new ArrayList<>();
		personInfos.add(person1);
		personInfos.add(person2);
		personInfos.add(person3);
		personInfos.add(person4);
		personInfos.add(person5);	
		
		//Even number persons
		personInfos.stream().filter(per -> per.getPersonID()%2 ==0).forEach(per -> System.out.println(per.getName()+":"+per.getAddress()));
		
		//Sum of IDs
		System.out.println("Sum of personID ");
		System.out.println(personInfos.stream().filter(info -> info.getName().startsWith("D") ||
				info.getName().startsWith("A")).mapToLong(PersonInfo :: getPersonID).sum());
		//Sort persons
		List<PersonInfo> sortedPersons = personInfos.stream().sorted(Comparator.comparing(PersonInfo :: getName)
				.thenComparing(PersonInfo :: getAddress))
				.collect(Collectors.toList());
		sortedPersons.stream().forEach(x -> System.out.println(x.getName()+":"+x.getAddress()));

		//Print IDs
		List<Integer> ids = personInfos.stream().map(x -> x.getPersonID()).collect(Collectors.toList());
		
		//Changing type 
		List<PersonInfo> persons = numbers.stream().map(x -> {
			PersonInfo person = new PersonInfo();
			person.setPersonID(x);
			person.setName("Iam "+x);
			person.setAddress("Address "+x);
			return person;
		}).collect(Collectors.toList());
		System.out.println(persons);
		
		//System.out.println(personInfos);
	}
	
}

class PersonInfo{
	Integer personID;
	String name;
	String address;
	public Integer getPersonID() {
		return personID;
	}
	public void setPersonID(Integer personID) {
		this.personID = personID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public PersonInfo(Integer personID, String name, String address) {
		super();
		this.personID = personID;
		this.name = name;
		this.address = address;
	}
	public PersonInfo() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PersonInfo [personID=" + personID + ", name=" + name + ", address=" + address + "]";
	}
	
	
}

