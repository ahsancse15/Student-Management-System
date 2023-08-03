package com.example.studentmanagement;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

		/*Student student1 = new Student("ahsanul", "haque", "ahsan@gmail.com");
		studentRepository.save(student1);

		Student student2 = new Student("sanjana", "haque", "sanjana@gmail.com");
		studentRepository.save(student2);*/
	}
}
