package com.example.student.dal;

import com.example.student.entity.Student;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class StudentDAL {

    @Autowired
    EntityManager entityManager;

    public void save(Student student) {
        ///get the session object
        Session session = entityManager.unwrap(Session.class);
        session.persist(student);
    }
}
