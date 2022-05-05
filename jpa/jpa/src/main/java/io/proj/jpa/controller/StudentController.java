package io.proj.jpa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.proj.jpa.entities.Students;
import io.proj.jpa.service.StudentRepository;

@Controller
public class StudentController {
    @Autowired
	StudentRepository repo;
	@GetMapping("/all")
	public String addStudents(){
		System.out.println(repo.findAll()+"\n");
		return "redirect:/welcome";
	}
	@PostMapping("/entry")
	public String getStudentsDetails(@RequestParam String name, @RequestParam String course){
		
		String n = name;
		String c = course;
		Students st = new Students(n,c);
		repo.save(st);
		return "redirect:/welcome";
	}
	@PostMapping("/id")
	public String getStudentByid(@RequestParam Long id){
		Long i = id;
		System.out.println(repo.findById(i)+"\n");
		return "redirect:/welcome";
	}
	@GetMapping("/welcome")
	public String Welcome(){
		return "welcome";
	}
	@GetMapping("/id")
	public String displayId(){
		return "id";
	}
	@GetMapping("/course")
	public String displayCourse(){
		return "course";
	}
	@GetMapping("/entry")
	public String entry(){
		return "entry";
	}
	@PostMapping("/course")
	public String getStudentByCourse(@RequestParam String course){
		String c = course;
		System.out.println(repo.findByCourse(c)+"\n");
		return "redirect:/welcome";
	}
}
