package com.example.HrmsProject.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.HrmsProject.business.abstracts.ImageService;
import com.example.HrmsProject.core.utilities.adapters.CloudinaryService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.core.utilities.results.SuccessDataResult;
import com.example.HrmsProject.core.utilities.results.SuccessResult;
import com.example.HrmsProject.dataAccess.abstracts.ImageDao;
import com.example.HrmsProject.entities.concretes.Image;

@Service
public class ImageManager implements ImageService {

	private ImageDao imageDao;
	private CloudinaryService cloudinaryService;
	
	@Autowired
	public ImageManager(ImageDao imageDao, CloudinaryService cloudinaryService) {
		super();
		this.imageDao = imageDao;
		this.cloudinaryService = cloudinaryService;
	}


	@Override
	public Result delete(Image image) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(Image image, MultipartFile imageFile) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		Map<String,String> uploadImage=this.cloudinaryService.uploadImageFile(imageFile).getData();	
		String url= uploadImage.get("url");
		image.setImageUrl(url);
		this.imageDao.save(image);
		return new SuccessResult("Resim başarıyla eklendi");
	}

	@Override
	public DataResult<List<Image>> getAll() {
		return new SuccessDataResult<List<Image>>(this.imageDao.findAll(), "başarıyla listelendi");
	}

	@Override
	public DataResult<Image> getById(int id) {
		return new SuccessDataResult<Image>(this.imageDao.getById(id), "Başarıyla getirildi");
	}

	@Override
	public DataResult<Image> getByCv_id(int id) {
		return new SuccessDataResult<Image>(this.imageDao.getByCv_id(id), "Başarıyla getirildi");
	}

	@Override
	public Result update(Image image) {
		// TODO Auto-generated method stub
		return null;
	}

}
