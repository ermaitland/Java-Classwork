package com.ellie.service;

import com.ellie.entity.Student;

public interface StudentService {
	public Student insertStudent(Student student);
	public Student searchStudentById(int stuId);
	public Student deleteStudentById(int stuId);
	public Student editStudent(int stuId,String address);
}
