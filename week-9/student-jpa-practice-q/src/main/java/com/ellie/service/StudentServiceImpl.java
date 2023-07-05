package com.ellie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ellie.entity.Student;
import com.ellie.persistence.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public Student insertStudent(Student student) {
		if (searchStudentById(student.getRollNo()) == null)
			return studentDao.save(student);
		else
			return null;
	}

	@Override
	public Student searchStudentById(int stuId) {
		Student student = studentDao.findById(stuId).orElse(null);
		return student;
	}

	@Override
	public Student deleteStudentById(int stuId) {
		Student student = searchStudentById(stuId);
		if (student != null)
			studentDao.deleteById(stuId);
		return student;
	}

	@Override
	public Student editStudent(int stuId, String adress) {
		Student student = searchStudentById(stuId);
		if (student != null) {
			student.setAddress(adress);
			studentDao.save(student);
		}
		return student;
	}


}
