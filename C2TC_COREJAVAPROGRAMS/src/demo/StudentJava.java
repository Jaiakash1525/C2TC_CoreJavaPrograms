package demo;

public class StudentJava {
	private int id;
	private String name;
	private int age;
	

	
	@Override
	public String toString() {
		return "StudentJava [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

public void setId(int id)
{
	this.id=id;
}
	
public int getId() {
	return this.id;
}
}
