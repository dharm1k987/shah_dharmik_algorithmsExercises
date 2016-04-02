package shah_dharmik_sortingObjects;

public class Student implements Comparable<Object> {
	private String firstName;
	private String lastName;
	private int id;
	private int mark;

	public Student(String firstName, String lastName, int id, int mark) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.mark = mark;

	}

	public int getmark() {
		return mark;
	}

	public String getFirstName() {
		return firstName;

	}

	public String getLastName() {
		return lastName;

	}

	public int getID() {
		return id;
	}

	public int compareTo(Object obj) {
		Student s = (Student) obj;
		if (getmark() < s.getmark()) {
			return -1;
		} else if (getmark() > s.getmark()) {
			return 1;
		}
		return 0;
	}

}
