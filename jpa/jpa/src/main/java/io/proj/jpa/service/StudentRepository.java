package io.proj.jpa.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.proj.jpa.entities.Students;

public interface StudentRepository extends CrudRepository<Students,Long>{
     List<Students> findByName(String name);
     List<Students> findByCourse(String course);
}
