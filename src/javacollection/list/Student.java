package javacollection.list;

public class Student {
private int id;
private String name;
private String clz;
private int age;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getClz() {
	return clz;
}
public void setClz(String clz) {
	this.clz = clz;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", clz=" + clz + ", age=" + age + "]";
}

}
