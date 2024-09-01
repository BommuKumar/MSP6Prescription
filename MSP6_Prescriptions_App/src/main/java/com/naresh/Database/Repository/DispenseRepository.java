package com.naresh.Database.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naresh.Database.Entity.Dispensation;

@Repository
public interface DispenseRepository extends JpaRepository<Dispensation, Integer>{

}
