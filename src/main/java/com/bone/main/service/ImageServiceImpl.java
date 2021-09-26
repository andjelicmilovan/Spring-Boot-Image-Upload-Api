package com.bone.main.service;

import java.util.Optional;

import com.bone.main.model.ImageModel;
import com.bone.main.repository.ImageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {
	
	@Autowired
	private ImageRepo repo;

	@Override
	public ImageModel saveImage(ImageModel img) {
		ImageModel savedImage = repo.save(img);
		return savedImage;
	}

	@Override
	public Optional<ImageModel> getImageById(int id) {
		Optional<ImageModel> img = repo.findById(id);
		return img;
	}

	@Override
	public void deleteImageById(int id) {
		repo.deleteById(id);
	}

}
