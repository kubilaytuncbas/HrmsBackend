package com.example.HrmsProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HrmsProject.business.abstracts.FavoriteService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.Favorite;

@RestController
@RequestMapping("/api/favorites")
public class FavoritesController {
	
	private FavoriteService favoriteService;
	
	@Autowired
	public FavoritesController(FavoriteService favoriteService) {
		super();
		this.favoriteService = favoriteService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Favorite favorite) {
		return this.favoriteService.add(favorite);
		
	}
	@PostMapping("/update")
	public Result update(@RequestBody Favorite favorite) {
		return this.favoriteService.update(favorite);
		
	}
	
	@PostMapping("delete")
	public Result delete(int id) {
		return this.favoriteService.delete(id);
		
	}
	@GetMapping("/getAll")
	public DataResult<List<Favorite>> getAll(){
		return this.favoriteService.getAll();
	}
}
