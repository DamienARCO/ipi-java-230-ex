package com.ipiecoles.java.java230.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ipiecoles.java.java230.model.Technicien;

@Repository
public interface TechnicienRepository extends CrudRepository<Technicien, Long> {

}
