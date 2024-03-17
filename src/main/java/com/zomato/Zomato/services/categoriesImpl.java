package com.zomato.Zomato.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.zomato.Zomato.entity.categories;

@Service
public class categoriesImpl implements categoriesServ {

	List<categories> list;
	 String[] data = {"Cake", "Dosa", "Idly", "Pizza", "Sandwich"};
	 
	 public categoriesImpl() {
		list  = new ArrayList<>();
//		list.add(new categories("", true,  data));
		list  = new ArrayList<>();
		list.add(new categories(true,"https://images.hdqwalls.com/wallpapers/dragon-ball-son-goku-4k-bl.jpg",1000,01,"comicStan"));
		list.add(new categories(true,"https://wallpapercave.com/wp/wp2425957.jpg",2000,02,"comicStan"));
		list.add(new categories(true,"https://www.3dspartanshop.com/wp-content/uploads/2023/04/dragon-ball-goku-black-statue.jpg",5000,03,"comicStan"));
		list.add(new categories(true,"https://www.raccoongames.es/img/productos/figura-dragon-ball-z-son-goku-super-saiyan-s-h-figuarts-15m/61B2XwPvD+L._SL1376_.jpg",500,04,"comicStan"));
		list.add(new categories(true,"https://artfiles.alphacoders.com/122/thumb-1920-122158.jpg",1500,05,"comicStan"));
	 }
	@Override
	public List<categories> getCat() {
		return list;
	}
	
	


}
