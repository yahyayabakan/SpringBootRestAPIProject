package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Yahya", "Ayabakan");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student("Yusuf", "Ayabakan"));
		students.add(new Student("Kemal", "Ayabakan"));
		students.add(new Student("Gulbahar", "Ayabakan"));
		students.add(new Student("Ilknur", "Ayabakan"));
		students.add(new Student("Ali", "Ayabakan"));
		
		return students;
	}
	
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
	@GetMapping("/student/query")
	public Student studentQueryParam(@RequestParam(name = "firstName")  String firstName, @RequestParam(name = "lastName") String lastName) {
		return new Student(firstName, lastName);
	}
}
