package com.example.HrmsProject.business.abstracts;



import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.Image;


public interface ImageService {
	Result add(Image image,MultipartFile imageFile);
	Result update(Image image);
	Result delete(Image image);
	DataResult<List<Image>> getAll();
	DataResult<Image> getById(int id);
	DataResult<Image> getByCv_id(int id);
	
	

}
