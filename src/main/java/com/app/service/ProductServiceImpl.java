package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.ApiResponse;
import com.app.dto.ProductDto;

import com.app.entities.Product;
import com.app.exceptions.ResourceNotFoundException;
import com.app.repository.ProductRepository;



@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repo;
	@Autowired
	private ModelMapper mapper;

	@Override
	public List<ProductDto> getAllProducts() {
		return repo.findAll()
				.stream()
				.map(product->mapper.map(product,ProductDto.class))
				.collect(Collectors.toList());
	}

	@Override
	public Product addNewProduct(Product newProduct) {
		// TODO Auto-generated method stub
		return repo.save(newProduct);
	}

	@Override
	public ApiResponse deleteProduct(Long productid) {
		Product delProduct=repo.findById(productid)
				.orElseThrow(()->new ResourceNotFoundException("Invalid Product Id!!"));
		repo.delete(delProduct);
		return new ApiResponse("Product with id "+delProduct.getId()+"deleted !!");
	}

	@Override
	public Product GetProductById(Long id) {
		Product prod=repo.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Invalid Id!!"));
				return prod;
	}

	@Override
	public ApiResponse UpdateProduct(Product product) {
		if(repo.existsById(product.getId()))
		{
			repo.save(product);
			return new ApiResponse("Product with id- "+ product.getId() +" updated successfully!!");
		}
		 return new ApiResponse("Product not updated !!");
	}

}
