package com.app.ri.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.ri.state.CaseNumber;
@Repository
public interface CaseRepository extends JpaRepository<CaseNumber, Long> {

}
