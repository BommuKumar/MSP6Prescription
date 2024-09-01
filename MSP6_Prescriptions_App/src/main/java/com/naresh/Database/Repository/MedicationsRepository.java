package com.naresh.Database.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naresh.Database.Entity.Medications;

@Repository
public interface MedicationsRepository extends JpaRepository<Medications, Integer> {

}
