package com.example.HrmsProject.core.utilities.adapters;

import org.springframework.stereotype.Service;

import com.example.HrmsProject.fakeMernis.FakeMernis;

@Service
public class FakeMernisAdapter implements ValidationService {

	@Override
	public boolean validateByFakeMernis(String nationalityId, String firstName, String lastName, int yearOfBirth) {
		// TODO Auto-generated method stub
		FakeMernis fakeMernis=new FakeMernis();
		boolean result=true;
		try {
			result=fakeMernis.checkIfRealPerson(nationalityId, firstName, lastName, yearOfBirth);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
