package com.test.api.view.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.api.view.dto.ProductDTO;
import com.test.api.view.model.Product;
import com.test.api.view.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	ModelMapper modelMapper = new ModelMapper();
	
	private Product convertProductToEntity (ProductDTO productDto) {
		return modelMapper.map(productDto, Product.class);
	}
	
	private ProductDTO convertProductToDTO (Product product) {
		return modelMapper.map(product, ProductDTO.class);
	}
	
	
	@GetMapping("product/getall")
	public Map<String, Object> getAllProduct (){
		List<ProductDTO> listProductDto = new ArrayList<ProductDTO>();
		
		for(Product product : productRepository.findAll()) {
			ProductDTO productDto = convertProductToDTO(product);
			System.out.println(product);
			listProductDto.add(productDto);
		}
		
		String message;
		if (listProductDto.isEmpty()) {
			message = "Data is empty";
		}else {
			message = "Show all Data";
		}
		
		 Map<String, Object> response = new HashMap<>();
	        response.put("data", listProductDto);
	        response.put("message", message);
	        response.put("status", List.of(
	                Map.of("id", 0, "name", "SUCCESS"),
	                Map.of("id", 1, "name", "FAILED")
	            ));
	        
	        return response;
	}
}
