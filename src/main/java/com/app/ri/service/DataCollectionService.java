package com.app.ri.service;

import java.util.List;

import com.app.ri.Binding.EducationDetailsBinding;
import com.app.ri.Binding.IncomeDetailsBinding;
import com.app.ri.Binding.KidsDetailsBinding;
import com.app.ri.state.CaseNumber;
import com.app.ri.state.PlanSelection;

public interface DataCollectionService {
	public String createCase(CaseNumber case1);
	public List<PlanSelection> getAllPlans();
	public List<String> getPlans(CaseNumber case1);
	public String incomeDta(IncomeDetailsBinding incomeBindin);
	public String educationDetails(EducationDetailsBinding eduBinding);
	public String kidsDeatails(KidsDetailsBinding kidsBinding);
	
}
