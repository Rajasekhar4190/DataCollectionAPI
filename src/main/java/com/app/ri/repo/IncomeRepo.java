package com.app.ri.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ri.state.IncomeDetails;

public interface IncomeRepo extends JpaRepository<IncomeDetails, Long> {

}
