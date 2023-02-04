package com.app.ri.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.ri.state.PlanSelection;
@Repository
public interface PlanRepo extends JpaRepository<PlanSelection, Long> {
	
	List<String> findByPlan_NAME(Long id);

}
