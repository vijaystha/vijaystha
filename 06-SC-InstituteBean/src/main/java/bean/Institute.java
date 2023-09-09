package bean;

import java.util.List;
import java.util.Set;

public class Institute {
private String name;
private List<Student> students; 
private Set<String> courses;

public void setName(String name) {
	this.name = name;
}
public void setStudents(List<Student> students) {
	this.students = students;
}
public void setCourses(Set<String> courses) {
	this.courses = courses;
}

public void displayInstituteInfo() {
	System.out.println("Institute name " + name);
	System.out.println("Courses Information " );
	
	courses.forEach(System.out::println);
}

}

