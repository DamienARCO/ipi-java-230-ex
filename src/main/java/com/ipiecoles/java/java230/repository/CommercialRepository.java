package com.ipiecoles.java.java230.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ipiecoles.java.java230.model.Commercial;

@Repository
public interface CommercialRepository extends CrudRepository<Commercial, Long> {

}
