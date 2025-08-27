package com.shamim.SpringJDBC;

import com.shamim.SpringJDBC.model.Student;
import com.shamim.SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

        Student s1 = context.getBean(Student.class);
        s1.setRollNo(11);
        s1.setName("Shamim");
        s1.setMarks(95);

        StudentService service = context.getBean(StudentService.class);
        service.addStudent(s1);

        List<Student> students = service.getStudents();
        System.out.println(students);
	}
}
