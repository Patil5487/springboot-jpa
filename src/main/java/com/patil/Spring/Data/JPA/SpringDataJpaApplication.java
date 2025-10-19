package com.patil.Spring.Data.JPA;

import com.patil.Spring.Data.JPA.Model.Student;
import com.patil.Spring.Data.JPA.Repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);

        StudentRepo repo = context.getBean(StudentRepo.class);


//        s1.setRollno(101);
//        s1.setMarks(55);
//        s1.setName("Gaurav");
//
//        s2.setRollno(102);
//        s2.setMarks(65);
//        s2.setName("Yashodhan");
//
//        s3.setRollno(103);
//        s3.setMarks(75);
//        s3.setName("Amol");
//
//        repo.save(s1);
//        repo.save(s2);
//        repo.save(s3);

//        System.out.println(repo.findAll());

//        Optional<Student> student = repo.findById(101);

        // if id is not present then it will create new null student (Which protect form NullPointerException)
//        System.out.println(student.orElse(new Student()));


//        System.out.println(repo.findByMarksGreaterThan(72));


        //Update and delete
//        System.out.println(repo.save(s2));
//          repo.delete(s2);

    }
}
