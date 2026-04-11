package arrayofobject;

public class Student {
	private int id;
	private String fnanme;
	private String lname;
	private String college;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFnanme() {
		return fnanme;
	}
	public void setFnanme(String fnanme) {
		this.fnanme = fnanme;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fnanme=" + fnanme + ", lname=" + lname + ", college=" + college + ", age=" + age
				+ "]";
	}
	
	
}
