package com.jspiders.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.jspiders.springmvc.dto.StudentDTO;
import com.jspiders.springmvc.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/addStudent")
	private String addStudent() {
		return "AddStudentForm";

	}

	@PostMapping("/addStudent")
	private String addStudent(ModelMap map, @SessionAttribute(name = "login", required = false) StudentDTO login,
			@RequestParam String name, @RequestParam String email, @RequestParam String userName,
			@RequestParam String password) {
//		if (login != null) {
			service.addStudent(name, email, userName, password);
			return "AddStudentForm";
		}
//		map.addAttribute("msg", "Invalid Username Or Password");
//		return "LoginPage";
//	}

	@PostMapping("/home")
	private String login(@SessionAttribute(name = "login", required = false) StudentDTO login, HttpSession session,
			HttpServletRequest request, @RequestParam String userName, @RequestParam String password, ModelMap map) {

		StudentDTO student = service.login(userName, password);
		if (student != null) {
			session = request.getSession();
			session.setAttribute("login", student);
			session.setMaxInactiveInterval(300);
			map.addAttribute("student", student);
			return "HomePage";
		}
		map.addAttribute("msg", "Invalid Username Or Password");
		return "LoginPage";

	}

	@GetMapping("/logout")
	private String logout(ModelMap map, HttpSession session) {
		session.invalidate();
		map.addAttribute("msg", "Successfully loged off");
		return "LoginPage";

	}

	@GetMapping("/removeStudent")
	private String removeStudent(ModelMap map, @SessionAttribute(name = "login", required = false) StudentDTO login) {
		if (login != null) {
			List<StudentDTO> students = service.viewAllStudents();
			map.addAttribute("students", students);
			return "RemoveStudent";
		}
		map.addAttribute("msg", "Please login first..!");
		return "LoginPage";
	}

	@PostMapping("/removeStudent")
	private String removeStudent(@RequestParam int id, ModelMap map,
			@SessionAttribute(name = "login", required = false) StudentDTO login) {
		if (login != null) {
			StudentDTO student = service.removeStudent(id);
			if (student != null) {
				map.addAttribute("msg", "Student removed from database");
				List<StudentDTO> students = service.viewAllStudents();
				map.addAttribute("students", students);
				return "RemoveStudent";
			}
			map.addAttribute("msg", "Invalid student id entered");
			List<StudentDTO> students = service.viewAllStudents();
			map.addAttribute("students", students);
			return "RemoveStudent";
		}
		map.addAttribute("msg", "Please login first..!");
		return "LoginPage";
	}

	@GetMapping("/updateStudent")
	private String updateStudent(ModelMap map, @SessionAttribute(name = "login", required = false) StudentDTO login) {
		if (login != null) {
			List<StudentDTO> students = service.viewAllStudents();
			map.addAttribute("students", students);
			return "UpdateStudent";
		}
		map.addAttribute("msg", "Please login first..!");
		return "LoginPage";
	}

	@PostMapping("/updateStudent")
	private String updateStudent1(@RequestParam int id, ModelMap map,
			@SessionAttribute(name = "login", required = false) StudentDTO login) {
		if (login != null) {
			StudentDTO student = service.searchStudent(id);
			if (student != null) {
				map.addAttribute("student", student);
				return "UpdateStudent";
			}
			map.addAttribute("msg", "Invalid student id entered");
			List<StudentDTO> students = service.viewAllStudents();
			map.addAttribute("students", students);
			return "UpdateStudent";
		}
		map.addAttribute("msg", "Please login first..!");
		return "LoginPage";
	}

	@PostMapping("/updateStudentData")
	private String updateStudent2(@RequestParam int id, @RequestParam String name, @RequestParam String email,
			@RequestParam String userName, @RequestParam String password, ModelMap map,
			@SessionAttribute(name = "login", required = false) StudentDTO login) {
		if (login != null) {
			StudentDTO student = service.searchStudent(id);
			if (student != null) {
				service.updateStudent(id, name, email, userName, password);
				map.addAttribute("msg", "Student updated successfully");
				List<StudentDTO> students = service.viewAllStudents();
				map.addAttribute("students", students);
				return "UpdateStudent";
			}
			map.addAttribute("msg", "Student not found");
			List<StudentDTO> students = service.viewAllStudents();
			map.addAttribute("students", students);
			return "UpdateStudent";
		}
		map.addAttribute("msg", "Please login first..!");
		return "LoginPage";
	}

	@GetMapping("/searchStudent")
	private String searchStudent() {
		return "SearchStudent";

	}
	
	@PostMapping("/searchStudent")
	private String searchStudent1(@RequestParam int id, ModelMap map,
			@SessionAttribute(name = "login", required = false) StudentDTO login) {
		if (login != null) {
			StudentDTO student = service.searchStudent(id);
			if (student != null) {
				map.addAttribute("student", student);
				return "SearchStudent";
			}
			map.addAttribute("msg", "Invalid student id entered");
			return "SearchStudent";
		}
		map.addAttribute("msg", "Please login first..!");
		return "LoginPage";
	}

}
