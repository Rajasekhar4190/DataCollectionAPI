package com.app.ri.impl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ri.Binding.EducationDetailsBinding;
import com.app.ri.Binding.IncomeDetailsBinding;
import com.app.ri.Binding.KidsDetailsBinding;
import com.app.ri.repo.CaseRepository;
import com.app.ri.repo.EducationRepo;
import com.app.ri.repo.IncomeRepo;
import com.app.ri.repo.KidsRepo;
import com.app.ri.repo.PlanRepo;
import com.app.ri.service.DataCollectionService;
import com.app.ri.state.CaseNumber;
import com.app.ri.state.PlanSelection;
@Service
public class DataCollectionServiceImpl implements DataCollectionService {
	@Autowired
	CaseRepository caseRepository;
	@Autowired
	PlanRepo planRepo;
	@Autowired
	EducationRepo  educationRepo;
	@Autowired
    KidsRepo kidsRepo;
	@Autowired
	IncomeRepo incomeRepo;
	@Override
	public String createCase(CaseNumber case1) {
		// TODO Auto-generated method stub
		
		if(case1.getApp_Id()!=null) {
			caseRepository.save(case1);
			return "CaseID is saved successfully!!!!";
		}
	
		
		return "CaseID is failed to create";
	}

	@Override
	public List<String> getPlans(CaseNumber case1) {
		// TODO Auto-generated method stub
		 List<String> plan= planRepo.findByPlan_NAME(case1.getApp_Id());
		return plan;
	}

	@Override
	public String incomeDta(IncomeDetailsBinding incomeBindin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String educationDetails(EducationDetailsBinding eduBinding) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String kidsDeatails(KidsDetailsBinding kidsBinding) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanSelection> getAllPlans() {
		// TODO Auto-generated method stub
		List<PlanSelection> plans=planRepo.findAll();
		return plans;
	}

}
