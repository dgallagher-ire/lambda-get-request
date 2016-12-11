package lambda;

public class RequestClass {

	private String firstName;
	private String lastName;
	private String age;
	
	public RequestClass(){
		
	}

	public RequestClass(String firstName, String lastName, String age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public final String getFirstName() {
		return firstName;
	}

	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public final String getLastName() {
		return lastName;
	}

	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public final String getAge() {
		return age;
	}

	public final void setAge(String age) {
		this.age = age;
	}
	
}
