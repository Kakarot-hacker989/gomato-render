package com.zomato.Zomato.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zomato.Zomato.entity.restoResMain;
import com.zomato.Zomato.services.items.idlimpl;


@RestController
@RequestMapping("restaurant")
public class restauController {

	@Autowired
	idlimpl idl;
	
	@GetMapping("Idly")
	public restoResMain getbyid() {
		return this.idl.res();
	}
	
	@GetMapping("Cake")
	public restoResMain getcakes() {
		return this.idl.getCake();
	}
	
	@GetMapping("Pizza")
	public restoResMain getcpizza() {
		return this.idl.getpizza();
	}
	
	@GetMapping("Sandwich")
	public restoResMain getSand() {
		return this.idl.getSandwich();
	}
	
	@GetMapping("Dosa")
	public restoResMain getDsa() {
		return this.idl.getDosa();
	}
}
