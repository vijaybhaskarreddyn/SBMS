package com.vijay.repo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vijay.entities.ContactsMasterEntity;

@Repository
public interface ContactsMasterRepo extends CrudRepository<ContactsMasterEntity, Serializable> {

	
}
