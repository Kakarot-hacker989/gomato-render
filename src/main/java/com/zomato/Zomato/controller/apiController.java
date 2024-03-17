package com.zomato.Zomato.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zomato.Zomato.entity.categories;
import com.zomato.Zomato.services.categoriesServ;



@RestController
@CrossOrigin("*")
public class apiController {
	
	@Autowired
	public categoriesServ categor;
	
	@GetMapping("categories")
	public List<categories> getCat() {
		return this.categor.getCat();
	}
	
	

}
