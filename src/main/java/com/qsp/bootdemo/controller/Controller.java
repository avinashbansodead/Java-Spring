package com.qsp.bootdemo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.bootdemo.dto.Student;
import com.example.bootdemo.repository.StudentRepository;

@RestController
public class Controller 
{
	@Autowired
	StudentRepository sr;
	
@PostMapping("/hi")
public String m1()
{
	return "hellogoodmorning";
}
	@GetMapping("/hello")
	public String m2()
	{
		return "get method is controlled";
	}
	@PostMapping("/byee")
	public String m3()
	{
		
		return "post request";
	}
	@PostMapping("/savedata")
	public String save(@RequestBody Student s)
	{
		sr.save(s);
		return "Done";
	}
	@PostMapping("/saveAll")
	public String saveAll(@RequestBody List<Student> students)
	{
		sr.saveAll(students);
		return "Save All Done";
	}
	@GetMapping("/fetchdata")
	public Student fetchStudentById(@RequestParam int id)
	{
		 java.util.Optional<Student> students=
				 sr.findById(id);
		
		Student s=students.get();
		String name=s.getName();
		System.out.println(name);
		
		return s;
	}
	@GetMapping("/findStudentByName")
	
	public List<Student> findStudentByName(@RequestParam String name)
	{
		List<Student> students=sr.findByName(name);
		
		return students;
	}
@GetMapping("/findAllStudent")
	
	public List<Student> findAllStudent()
	{
		List<Student> students=sr.findAll();
		for(int i=0;i<students.size();i++)
		{
		Student obj=students.get(i);
		System.out.println("Id: "+obj.getId()+" Age: "+obj.getAge()+" Name: "+obj.getName());
		}
		return students;
	}
@GetMapping("/findAllStudentsbyagegraterthan")

public List<Student> fetchStudentByAgeGreaterThan(@RequestParam int age )
{
	List<Student> students=sr.findByAgeGreaterThan(age);
	
	return students;
	
}
@GetMapping("/findAllStudentsbyagelessthan")

public List<Student> fetchStudentByAgeLessThan(@RequestParam int age)
{
	List<Student> students=sr.findByAgeLessThan(age);
	return students;
}
@DeleteMapping("/delete")
public String delete(@RequestParam int id)
{
	sr.deleteById(id);
	return "Data deleted sucesfully";
}
	@DeleteMapping("/deleteAll")
	public String deleteAllStudents()
	{
		sr.deleteAll();
		return "Complete Data deleted sucesfully";
}
@PutMapping("/update")
	public String updateStudent(@RequestBody Student s)
	{
	sr.save(s);
	return "Data updated Sucefully";
	}
@PutMapping("/updateAll")
public String updateAll(@RequestBody List<Student> students)
{
	sr.saveAll(students);
	return "Update All Done";
}
@GetMapping("/fetchbyage")
public List<Student> findByAge(@RequestParam int age)
{
	return sr.findByAgeEquals(age);
}
	@GetMapping("/fetchbyagegreaterthanequal")
	public List<Student> findByAgeGreaterThanEqual(@RequestParam int age)
	{
		return sr.findByAgeGreaterThanEqual(age);
	}
	@GetMapping("/fetchbyagelessequal")
	public List<Student> findByAgeLessThanEqual(@RequestParam int age)
	{
		return sr.findByAgeLessThanEqual(age);
	}
	@GetMapping("/fetchbyagebetween")
	public List<Student> findByAgeBetween(@RequestParam int age1,@RequestParam int age2)
	{
		return sr.findByAgeBetween(age1,age2);
	}
}
	


