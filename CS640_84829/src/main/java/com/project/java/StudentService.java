package com.project.java;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
  
  @PersistenceContext
  private EntityManager em;
  
  @Transactional
  public List<Student> getAll() {
    List<Student> result = em.createQuery("SELECT s FROM Student s", Student.class).getResultList();
    return result;
  }
  
  @Transactional
  public void add(Student p) {
    em.persist(p);
  }
}
