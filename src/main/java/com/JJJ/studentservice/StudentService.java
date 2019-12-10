package com.JJJ.studentservice;

import org.springframework.stereotype.Service;

import com.JJJ.studentdto.StudentDto;
import com.JJJ.util.InMemoryDatabase;

@Service
public class StudentService {

	public StudentDto getStudentProfile(Integer semester) {
		return InMemoryDatabase.studentlist.get(semester);
	}
}
