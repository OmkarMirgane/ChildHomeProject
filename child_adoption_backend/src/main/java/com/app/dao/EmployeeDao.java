package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.ChildHome;
import com.app.pojos.*;

public interface EmployeeDao extends JpaRepository<Employee, Long> {
	Employee findByU(User u);
}
