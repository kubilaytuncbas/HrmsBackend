package com.example.HrmsProject.business.abstracts;

import java.util.List;

import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.SocialMediaLink;

public interface SocialMediaLinkService {
	Result add(SocialMediaLink socialMediaLink);
	Result update(SocialMediaLink socialMediaLink);
	Result delete(int id);
	DataResult<List<SocialMediaLink>> getAll();
	DataResult<List<SocialMediaLink>> getAllByCv_id(int id);

}
