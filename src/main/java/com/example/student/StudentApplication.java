package com.example.student;

import com.example.student.entity.Student;
import com.example.student.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class StudentApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StudentApplication.class, args);
        StudentService studentService = context.getBean(StudentService.class);
        Student student = new Student();
        student.setStudentMarks(100);
        student.setId(123);
        student.setName("pratik");
        studentService.save(student);
    }

}
