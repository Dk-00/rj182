package duixiangming;
@FunctionalInterface
interface PersonBuilder{
	Person bulidPerson(String name);
}
class Person{
	private String name;
	public Person(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
public class E26 {
public static void printName(String name,PersonBuilder builder) {
	System.out.println(builder.bulidPerson(name).getName());
}
	public static void main(String[] args) {
		printName("宋小宝",name->new Person(name));
		printName("宋小宝", Person::new);

	}

}
