package com.codingShuttle.springbootwebtutorial.springbootwebtutorial.repositories;

import com.codingShuttle.springbootwebtutorial.springbootwebtutorial.entitities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

}
