package com.JJJ.studentcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.JJJ.studentdto.StudentDto;
import com.JJJ.studentservice.StudentService;

@Controller
@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentservice;

	@GetMapping(value= "/{sem}/details")
	public StudentDto getStudentProfilesbySem(@PathVariable (value="sem") Integer semester,@RequestParam String id) {
		return studentservice.getStudentProfile(semester);
	}

	
	@GetMapping(value= " ")
	public StudentDto getStudentProfiles(@RequestParam(value="sem") Integer sem, @PathVariable Integer semester) {
		return studentservice.getStudentProfile(semester);
	}
	
	@PostMapping
	public void getStudentProfile(@RequestBody StudentDto dto) {
		System.out.println(dto.toString());
	}
	
	

}
