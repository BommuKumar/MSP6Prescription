package com.naresh.Database.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naresh.Database.Entity.Prescriptions;

@Repository
public interface PrescriptionsRepository extends JpaRepository<Prescriptions, Integer>{

}
