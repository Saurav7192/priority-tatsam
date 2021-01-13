package com.tatsam.priority.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tatsam.priority.entities.Area;
@Repository
public interface AreaRepository extends JpaRepository<Area, Integer> {

}
