package comparable;

import java.util.function.Function;

class Person implements Comparable<Person> {

	private String id;
	private String name;
	private String lastName;

	public Person() {
	}

	public Person changeID(String dni) {

		this.id = dni;
		return this;

	}

	public Person changeName(String Nombre) {

		this.name = Nombre;
		return this;

	}

	public Person changeLastName(String Apellidos) {

		this.lastName = Apellidos;
		return this;

	}

	public void actionShow() {

		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
	}

	public int compareTo(Function<Person, Integer> compare) {
		// TODO Auto-generated method stub
		return compare.apply(this);
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

public class CreatePersonFunctionalCompare {

	public CreatePersonFunctionalCompare() {

	}

	public static Person getPersonas() {

		return new Person();

	}

	public static void main(String[] args) {

		Person p1 = CreatePersonFunctionalCompare.getPersonas().changeID("3342432").changeName("Julian")
				.changeLastName("Rose");

		Person p2 = CreatePersonFunctionalCompare.getPersonas().changeID("3342436L").changeName("Tony")
				.changeLastName("Parker");

		System.out.println("We are to change the class ordering behaviour by passing a lambda");

		if (p1.compareTo((p) -> p.getName().compareTo(p2.getName())) == 1) {

			System.out.println(" We have change the Compareto behaviour of a class with a lambda\n " + p1.toString()
					+ " greater than " + p2.toString());

		} else if (p1.compareTo((p) -> p.getName().compareTo(p2.getName())) == 0) {

			System.out.println(" We have change the Compareto behaviour of a class with a lambda\n " + p1.toString()
					+ " equals to " + p2.toString());

		} else {

			System.out.println(" We have change the Compareto behaviour of a class with a lambda\\n  " + p1.toString()
					+ " less than  " + p2.toString());

		}

		System.out.println("We now change the class sorting behaviur by setting id order");

		if (p1.compareTo((p) -> p.getId().compareTo(p2.getId())) == 1) {

			System.out.println(" We have change the Compareto behaviour of a class with a lambda\n "
					+ " comparing by id " + p1.toString() + " is greater than " + p2.toString());

		} else if (p1.compareTo((p) -> p.getId().compareTo(p2.getId())) == 0) {

			System.out.println("  We have change the Compareto behaviour of a class with a lambda\n "
					+ " comparing by id" + p1.toString() + " equals to " + p2.toString());

		} else {

			System.out.println(" hemos cambiado el comportamiento de el Compare con una expresion lambda\n "
					+ " comparing by id" + p1.toString() + "  less than " + p2.toString());
		}

	}

}
