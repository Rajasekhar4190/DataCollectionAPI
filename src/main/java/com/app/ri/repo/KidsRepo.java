package com.app.ri.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ri.state.KidsDetails;

public interface KidsRepo extends JpaRepository<KidsDetails, Long> {

}
