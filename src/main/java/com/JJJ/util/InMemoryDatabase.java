package com.JJJ.util;

import java.util.HashMap;
import java.util.Map;

import com.JJJ.studentdto.StudentDto;

public class InMemoryDatabase {
	
	public static Map<Integer, StudentDto> studentlist;
	
	static {
		studentlist = new HashMap<Integer, StudentDto>();
	
	
	StudentDto student1 = new StudentDto();
	
	student1.setName("Kelly Jacksokn");
	student1.setStudentid("A121");
	student1.setSemester(5);
	student1.setEmail("Kelly@mail.com");
	studentlist.put(5, student1);
	
StudentDto student2 = new StudentDto();
	
	student2.setName("Clarissa White");
	student2.setStudentid("A122");
	student2.setSemester(6);
	student2.setEmail("Clarissa@mail.com");
	studentlist.put(6, student2);
	
StudentDto student3 = new StudentDto();
	
	student3.setName("Daniel Jackson");
	student3.setStudentid("A124");
	student3.setSemester(3);
	student3.setEmail("Dan@mail.com");
	studentlist.put(3, student3);
	
	}	

}
