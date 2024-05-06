package cascade;

class Person {

	private String id;
	private String name;
	private String lastName;

	public Person() {
	}

	public Person changeId(String id) {

		this.id = id;
		return this;

	}

	public Person changeName(String name) {

		this.name = name;
		return this;

	}

	public Person changeLastName(String lastName) {

		this.lastName = lastName;
		return this;

	}

	public void actionShow() {

		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
	}

}

public class CreatePerson {

	public CreatePerson() {

	}

	public static Person getPeople() {

		return new Person();

	}

	public static void main(String[] args) {

		CreatePerson
		.getPeople()
		.changeId("3342432342")
		.changeName("Julian")
		.changeLastName("Rose")
		.actionShow();

	}
}
