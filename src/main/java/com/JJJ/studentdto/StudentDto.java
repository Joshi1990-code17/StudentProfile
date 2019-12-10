package com.JJJ.studentdto;

public class StudentDto {

	private String studentid;
	private String name;
	private String email;
	private int semester;

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	@Override
	public String toString() {
		return "StudentDto [studentid=" + studentid + ", name=" + name + ", email=" + email + ", semester=" + semester
				+ "]";
	}
	
	

}
