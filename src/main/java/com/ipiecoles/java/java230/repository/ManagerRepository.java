package com.ipiecoles.java.java230.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ipiecoles.java.java230.model.Manager;

@Repository
public interface ManagerRepository extends CrudRepository<Manager, Long> {

}
