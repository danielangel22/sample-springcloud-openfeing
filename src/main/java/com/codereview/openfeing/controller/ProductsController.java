package com.codereview.openfeing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codereview.openfeing.clients.FakeApiProducts;

@RestController
public class ProductsController {

	@Autowired
	private FakeApiProducts products;

	@GetMapping(value = "/products", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_HTML_VALUE })
	public ResponseEntity<Object> getProducts() {
		return products.findAllProducts();
	}
}
