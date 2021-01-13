package com.tatsam.priority.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tatsam.priority.entities.UserAreaPriority;
@Repository
public interface UserAreaPriorityRepository extends JpaRepository<UserAreaPriority, Integer> {

}
