package hello;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
@Component
public class PersonForm {
	@NonNull
	@Size(min=5, max=25)
	private String name;
	@NonNull
	@Min(18)
	@Max(60)
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "PersonForm [name=" + name + ", age=" + age + "]";
	}
	

}
