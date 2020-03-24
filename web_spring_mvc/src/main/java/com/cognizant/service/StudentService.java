package com.cognizant.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.model.Student;

@Service
public class StudentService {

	private List<Student> stList = new ArrayList<Student>(
			Arrays.asList(new Student(1, "Nayan"), new Student(2, "Ayan"), new Student(3, "Sayaan")));

	public String insert(Student student) {
		for (Student st : stList) {
			if (st.getId()==student.getId()) {
				return "Fail";
			}
		}
		if (stList.add(student)) {
			return "Success";
		} else {
			return "Fail";
		}
	}

	public String update(Student student) {
		for (Student s1 : stList) {
			if (s1.getId()==student.getId()) {
				s1.setName(student.getName());
				return "SUCCESS";
			}
		}
		return "Fail";
	}

	public String delete(Student student) {
		for (Student s1 : stList) {
			if (s1.getId()==student.getId()) {
				stList.remove(s1);
				return "Success";
			}
		}
		return "Fail";
	}


	
	public List<Student> getAll() {
		System.out.println(stList);
		return stList;
	}

}