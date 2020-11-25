package com.mindtree.candyshop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.candyshop.dto.ErrorDto;
import com.mindtree.candyshop.entity.Candy;
import com.mindtree.candyshop.entity.Shop;
import com.mindtree.candyshop.service.CandyService;
import com.mindtree.candyshop.service.ShopService;

@RestController
public class Controller {

	@Autowired
	private ShopService shopService;

	@Autowired
	private CandyService candyService;

	public ErrorDto createErrorDto(Exception e) {
		ErrorDto dto = new ErrorDto();
		dto.setErrorType(e.getClass().getCanonicalName());
		dto.setMessage(e.getMessage());
		return dto;
	}

	@GetMapping("/choice")
	public String getChoice() {
		System.out.println("helloooooo");
		return "welcome to springs";
	}

	@GetMapping("/get/shop/details")
	public ResponseEntity<?> getShopDetails() {
		List<Shop> shop = new ArrayList<Shop>();
		try {
			shop = this.shopService.getShopDetails();

		} catch (Exception e) {
			return new ResponseEntity<ErrorDto>(createErrorDto(e), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<List<Shop>>(shop, HttpStatus.OK);
	}

	@PostMapping("/add/data/to/shop")
	public ResponseEntity<?> addDataToShop(@RequestBody Shop shop) {
		Shop shop1 = null;
		try {
			shop1 = shopService.addDataToShop(shop);
		} catch (Exception e) {
			return new ResponseEntity<ErrorDto>(createErrorDto(e), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Shop>(shop1, HttpStatus.OK);
	}

	@GetMapping("/get/candy/details")
	public ResponseEntity<?> getCandyDetails() {
		List<Candy> candy = new ArrayList<Candy>();
		try {
			candy = this.candyService.getCandyDetails();
		} catch (Exception e) {
			return new ResponseEntity<ErrorDto>(createErrorDto(e), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<List<Candy>>(candy, HttpStatus.OK);
	}

	@PostMapping("/add/data/to/candy")
	public ResponseEntity<?> addDataToCandy(@RequestBody Candy candy) {
		Candy candy1 = null;
		try {
			candy1 = candyService.addDataToCandy(candy);
		} catch (Exception e) {
			return new ResponseEntity<ErrorDto>(createErrorDto(e), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Candy>(candy1, HttpStatus.OK);

	}

	@GetMapping("price/{candy_Id}/{shop_Id}/{quantity}")
	public ResponseEntity<?> getPrice(@PathVariable int candy_Id, @PathVariable int shop_Id,
			@PathVariable int quantity) {
		double price;
		try {
			price = this.candyService.getPrice(candy_Id, shop_Id, quantity);
		} catch (Exception e) {
			return new ResponseEntity<ErrorDto>(createErrorDto(e), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Double>(price, HttpStatus.OK);
	}

	@GetMapping("display/all/candy/perticular/shop/{shop_Id}")
	public ResponseEntity<?> getAllCandyByShopId(@PathVariable int shop_Id) {
		List<Candy> candy = new ArrayList<Candy>();
		try {
			candy = this.candyService.getAllCandyByShopId(shop_Id);

		} catch (Exception e) {
			return new ResponseEntity<ErrorDto>(createErrorDto(e), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<List<Candy>>(candy, HttpStatus.OK);
	}

	@GetMapping("display/all/candy/stock/less/than/5")
	public ResponseEntity<?> listOfCandyLessThanFive() {
		List<Candy> candy = new ArrayList<Candy>();
		try {
			candy = this.candyService.listOfCandyLessThanFive();
		} catch (Exception e) {
			return new ResponseEntity<ErrorDto>(createErrorDto(e), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<List<Candy>>(candy, HttpStatus.OK);
	}
	
	@GetMapping("/serialization")
	public ResponseEntity<?> serialization() {
		List<Shop> shop = new ArrayList<Shop>();
		try {
			shop = this.shopService.getDetailsOfShop();

		} catch (Exception e) {
			return new ResponseEntity<ErrorDto>(createErrorDto(e), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<List<Shop>>(shop, HttpStatus.OK);
	}
	
	@GetMapping("/deserialization")
	public ResponseEntity<?> deserialization() {
		List<Shop> shop = new ArrayList<Shop>();
		try {
			shop = this.shopService.getFromTheFile();

		} catch (Exception e) {
			return new ResponseEntity<ErrorDto>(createErrorDto(e), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<List<Shop>>(shop, HttpStatus.OK);
	}

}
