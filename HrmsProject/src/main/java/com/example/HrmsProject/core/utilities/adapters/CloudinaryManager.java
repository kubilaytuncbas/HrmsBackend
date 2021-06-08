package com.example.HrmsProject.core.utilities.adapters;

import java.io.IOException;
import java.util.Map;
import com.cloudinary.Cloudinary;

import org.springframework.stereotype.Service;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.ErrorDataResult;
import com.example.HrmsProject.core.utilities.results.SuccessDataResult;

@Service
public class CloudinaryManager implements CloudinaryService {

	private Cloudinary cloudinary;
	
	public CloudinaryManager() {
		this.cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "kubilaytuncbas",
				"api_key", "359434527497197",
				"api_secret", "KrmtDCL0-Er1s6VquqxWDwPAldw"));
	}

	@Override
	public DataResult<Map> uploadImageFile(MultipartFile imageFile) {
		try {
			@SuppressWarnings("unchecked")
			Map<String, String> resultMap =(Map<String, String>) cloudinary.uploader().upload(imageFile.getBytes(), ObjectUtils.emptyMap());
			return new SuccessDataResult<Map>(resultMap);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return new ErrorDataResult<Map>();
	}
	
	
	}
	
	


