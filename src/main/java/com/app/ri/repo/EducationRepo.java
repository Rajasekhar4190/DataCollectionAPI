package com.app.ri.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ri.state.EducationDetails;

public interface EducationRepo extends JpaRepository<EducationDetails, Long> {

}
