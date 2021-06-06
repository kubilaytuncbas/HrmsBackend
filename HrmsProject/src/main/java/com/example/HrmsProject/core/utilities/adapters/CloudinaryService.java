package com.example.HrmsProject.core.utilities.adapters;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.example.HrmsProject.core.utilities.results.DataResult;

public interface CloudinaryService {	
	DataResult<Map> uploadImageFile(MultipartFile imageFile);

}
